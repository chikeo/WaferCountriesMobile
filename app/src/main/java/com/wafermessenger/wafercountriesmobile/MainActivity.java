package com.wafermessenger.wafercountriesmobile;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wafermessenger.wafercountriesmobile.payload.Country;
import com.wafermessenger.wafercountriesmobile.utils.HttpsHelper;
import com.wafermessenger.wafercountriesmobile.utils.SwipeHelper;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getName();
    public static final String COUNTRIES_ENDPOINT = "https://restcountries.eu/rest/v2/all";

    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressbar);

        final String[] response = new String[1];



        try {

            // Display the progress bar at the beginning of the RESTful call.
            showProgress();

            // Start a processing thread to make the JSON network call.
            Thread networkRequestThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        // Make the RESTful call and print the JSON response to the console.
                        response[0] = HttpsHelper.getUrlContent(COUNTRIES_ENDPOINT);
                        System.out.println("Response: ".concat(response[0]));

                        // Unmarshal the JSON response to a POJO
                        Type complexType = new TypeToken<Collection<Country>>() {}.getType();
                        Gson gson = new Gson();
                        final List<Country> countries = gson.fromJson(response[0], complexType);

                        // Hide the progress bar on the UI thread.
                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                hideProgress();
                                populateRecycledList(countries);
                            }
                        });


                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            });
            networkRequestThread.start();

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }


    public void showProgress()
    {
        progressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgress()
    {
        progressBar.setVisibility(View.GONE);
    }

    void populateRecycledList(final List<Country> countries)
    {
        RecyclerView recyclerView = findViewById(R.id.list_item_country);

        if (countries.isEmpty())
        {
            recyclerView.setVisibility(View.GONE);
        }
        else
        {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(linearLayoutManager);
            final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, countries);
            recyclerView.setAdapter(recyclerViewAdapter);

//            SwipeHelper swipeHelper = new SwipeHelper(this, recyclerView) {
//                @Override
//                public void instantiateUnderlayButton(final RecyclerView.ViewHolder viewHolder, List<UnderlayButton> underlayButtons) {
//                    underlayButtons.add(new SwipeHelper.UnderlayButton(
//                            "",
//                            //"Delete",
//                            R.drawable.ic_delete,
//                            0,
//                            //Color.parseColor("#EE82EE"),
//                            new SwipeHelper.UnderlayButtonClickListener() {
//                                @Override
//                                public void onClick(int pos) {
//                                    countries.remove(viewHolder.getAdapterPosition());
//                                    recyclerViewAdapter.notifyDataSetChanged();
//                                }
//                            }
//                    ));
//
//                }
//            };

            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {


                public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
                    if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
                        // Get RecyclerView item from the ViewHolder
                        View itemView = viewHolder.itemView;

                        Paint p = new Paint();
                        if (dX > 0) {
            /* Set your color for positive displacement */
                            p.setARGB(255, 238, 130, 238);
                            // Draw Rect with varying right side, equal to displacement dX
                            c.drawRect((float) itemView.getLeft(), (float) itemView.getTop(), dX,
                                    (float) itemView.getBottom(), p);
                        } else {
            /* Set your color for negative displacement */
                            p.setARGB(255, 238, 130, 238);
                            // Draw Rect with varying left side, equal to the item's right side plus negative displacement dX
                            c.drawRect((float) itemView.getRight() + dX, (float) itemView.getTop(),
                                    (float) itemView.getRight(), (float) itemView.getBottom(), p);
                        }

                        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
                    }
                }
                @Override
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                    return false;
                }

                @Override
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                    // Remove item from backing list here
                    countries.remove(viewHolder.getAdapterPosition());
                    recyclerViewAdapter.notifyDataSetChanged();
                }
            });

            itemTouchHelper.attachToRecyclerView(recyclerView);
        }
    }
}

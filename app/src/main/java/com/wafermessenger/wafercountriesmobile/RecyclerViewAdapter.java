package com.wafermessenger.wafercountriesmobile;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wafermessenger.wafercountriesmobile.payload.Country;


import java.util.List;

/**
 * Created by CHIKEO on 8/16/2018.
 */

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CountryViewHolder>{

    public static final String TAG = RecyclerViewAdapter.class.getName();

    private List<Country> countries;
    private Context context;
    private LayoutInflater layoutInflater;

    public RecyclerViewAdapter (Context context, List<Country> countries)
    {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CountryViewHolder countryViewHolder = null;
        CardView cardView = null;
        layoutInflater = LayoutInflater.from(context);

        cardView = (CardView) layoutInflater.inflate(R.layout.list_item_country, parent, false);
        countryViewHolder = new RecyclerViewAdapter.CountryViewHolder(cardView);
        return countryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        Country country = countries.get(position);
        holder.textViewCountryDetails.setText(country.getName().concat(" - ").concat(country.getCurrencies().get(0).getName()).concat(" - ").concat(country.getLanguages().get(0).getName()));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewCountryDetails;

        public CountryViewHolder(CardView cardView) {
            super(cardView);

            textViewCountryDetails = cardView.findViewById(R.id.textview_country_detail_text);
        }
    }
}

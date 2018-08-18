package com.wafermessenger.wafercountriesmobile.payload;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CHIKEO on 8/16/2018.
 */

public class Currency implements Parcelable
{

    private String code;
    private String name;
    private String symbol;
    public final static Parcelable.Creator<Currency> CREATOR = new Creator<Currency>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Currency createFromParcel(Parcel in) {
            return new Currency(in);
        }

        public Currency[] newArray(int size) {
            return (new Currency[size]);
        }

    }
            ;

    protected Currency(Parcel in) {
        this.code = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.symbol = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Currency() {
    }

    /**
     *
     * @param symbol
     * @param name
     * @param code
     */
    public Currency(String code, String name, String symbol) {
        super();
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(code);
        dest.writeValue(name);
        dest.writeValue(symbol);
    }

    public int describeContents() {
        return 0;
    }

}

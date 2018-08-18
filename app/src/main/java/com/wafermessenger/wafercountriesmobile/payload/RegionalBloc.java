package com.wafermessenger.wafercountriesmobile.payload;


import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CHIKEO on 8/16/2018.
 */

public class RegionalBloc implements Parcelable
{

    private String acronym;
    private String name;
    private List<Object> otherAcronyms = null;
    private List<Object> otherNames = null;
    public final static Parcelable.Creator<RegionalBloc> CREATOR = new Creator<RegionalBloc>() {


        @SuppressWarnings({
                "unchecked"
        })
        public RegionalBloc createFromParcel(Parcel in) {
            return new RegionalBloc(in);
        }

        public RegionalBloc[] newArray(int size) {
            return (new RegionalBloc[size]);
        }

    }
            ;

    protected RegionalBloc(Parcel in) {
        this.acronym = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.otherAcronyms, (java.lang.Object.class.getClassLoader()));
        in.readList(this.otherNames, (java.lang.Object.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public RegionalBloc() {
    }

    /**
     *
     * @param otherAcronyms
     * @param acronym
     * @param name
     * @param otherNames
     */
    public RegionalBloc(String acronym, String name, List<Object> otherAcronyms, List<Object> otherNames) {
        super();
        this.acronym = acronym;
        this.name = name;
        this.otherAcronyms = otherAcronyms;
        this.otherNames = otherNames;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(List<Object> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public List<Object> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(List<Object> otherNames) {
        this.otherNames = otherNames;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(acronym);
        dest.writeValue(name);
        dest.writeList(otherAcronyms);
        dest.writeList(otherNames);
    }

    public int describeContents() {
        return 0;
    }

}
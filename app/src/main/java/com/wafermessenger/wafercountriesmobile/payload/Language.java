package com.wafermessenger.wafercountriesmobile.payload;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CHIKEO on 8/16/2018.
 */

public class Language implements Parcelable
{

    private String iso6391;
    private String iso6392;
    private String name;
    private String nativeName;
    public final static Parcelable.Creator<Language> CREATOR = new Creator<Language>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Language createFromParcel(Parcel in) {
            return new Language(in);
        }

        public Language[] newArray(int size) {
            return (new Language[size]);
        }

    }
            ;

    protected Language(Parcel in) {
        this.iso6391 = ((String) in.readValue((String.class.getClassLoader())));
        this.iso6392 = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.nativeName = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Language() {
    }

    /**
     *
     * @param iso6391
     * @param iso6392
     * @param name
     * @param nativeName
     */
    public Language(String iso6391, String iso6392, String name, String nativeName) {
        super();
        this.iso6391 = iso6391;
        this.iso6392 = iso6392;
        this.name = name;
        this.nativeName = nativeName;
    }

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getIso6392() {
        return iso6392;
    }

    public void setIso6392(String iso6392) {
        this.iso6392 = iso6392;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(iso6391);
        dest.writeValue(iso6392);
        dest.writeValue(name);
        dest.writeValue(nativeName);
    }

    public int describeContents() {
        return 0;
    }

}

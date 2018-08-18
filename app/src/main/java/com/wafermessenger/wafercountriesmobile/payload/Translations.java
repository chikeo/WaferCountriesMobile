package com.wafermessenger.wafercountriesmobile.payload;

import android.os.Parcel;
import android.os.Parcelable;
/**
 * Created by CHIKEO on 8/16/2018.
 */

public class Translations implements Parcelable
{

    private String de;
    private String es;
    private String fr;
    private String ja;
    private String it;
    private String br;
    private String pt;
    private String nl;
    private String hr;
    private String fa;
    public final static Parcelable.Creator<Translations> CREATOR = new Creator<Translations>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Translations createFromParcel(Parcel in) {
            return new Translations(in);
        }

        public Translations[] newArray(int size) {
            return (new Translations[size]);
        }

    }
            ;

    protected Translations(Parcel in) {
        this.de = ((String) in.readValue((String.class.getClassLoader())));
        this.es = ((String) in.readValue((String.class.getClassLoader())));
        this.fr = ((String) in.readValue((String.class.getClassLoader())));
        this.ja = ((String) in.readValue((String.class.getClassLoader())));
        this.it = ((String) in.readValue((String.class.getClassLoader())));
        this.br = ((String) in.readValue((String.class.getClassLoader())));
        this.pt = ((String) in.readValue((String.class.getClassLoader())));
        this.nl = ((String) in.readValue((String.class.getClassLoader())));
        this.hr = ((String) in.readValue((String.class.getClassLoader())));
        this.fa = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Translations() {
    }

    /**
     *
     * @param hr
     * @param de
     * @param it
     * @param pt
     * @param fa
     * @param fr
     * @param br
     * @param es
     * @param nl
     * @param ja
     */
    public Translations(String de, String es, String fr, String ja, String it, String br, String pt, String nl, String hr, String fa) {
        super();
        this.de = de;
        this.es = es;
        this.fr = fr;
        this.ja = ja;
        this.it = it;
        this.br = br;
        this.pt = pt;
        this.nl = nl;
        this.hr = hr;
        this.fa = fa;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(de);
        dest.writeValue(es);
        dest.writeValue(fr);
        dest.writeValue(ja);
        dest.writeValue(it);
        dest.writeValue(br);
        dest.writeValue(pt);
        dest.writeValue(nl);
        dest.writeValue(hr);
        dest.writeValue(fa);
    }

    public int describeContents() {
        return 0;
    }

}
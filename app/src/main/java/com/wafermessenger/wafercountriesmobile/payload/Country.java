package com.wafermessenger.wafercountriesmobile.payload;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CHIKEO on 8/16/2018.
 */


public class Country implements Parcelable
{

    private String name;
    private List<String> topLevelDomain = null;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes = null;
    private String capital;
    private List<String> altSpellings = null;
    private String region;
    private String subregion;
    private Integer population;
    private List<Double> latlng = null;
    private String demonym;
    private Double area;
    private Double gini;
    private List<String> timezones = null;
    private List<String> borders = null;
    private String nativeName;
    private String numericCode;
    private List<Currency> currencies = null;
    private List<Language> languages = null;
    private Translations translations;
    private String flag;
    private List<RegionalBloc> regionalBlocs = null;
    private String cioc;
    public final static Parcelable.Creator<Country> CREATOR = new Creator<Country>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Country createFromParcel(Parcel in) {
            return new Country(in);
        }

        public Country[] newArray(int size) {
            return (new Country[size]);
        }

    }
            ;

    protected Country(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.topLevelDomain, (java.lang.String.class.getClassLoader()));
        this.alpha2Code = ((String) in.readValue((String.class.getClassLoader())));
        this.alpha3Code = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.callingCodes, (java.lang.String.class.getClassLoader()));
        this.capital = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.altSpellings, (java.lang.String.class.getClassLoader()));
        this.region = ((String) in.readValue((String.class.getClassLoader())));
        this.subregion = ((String) in.readValue((String.class.getClassLoader())));
        this.population = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.latlng, (java.lang.Double.class.getClassLoader()));
        this.demonym = ((String) in.readValue((String.class.getClassLoader())));
        this.area = ((Double) in.readValue((Double.class.getClassLoader())));
        this.gini = ((Double) in.readValue((Double.class.getClassLoader())));
        in.readList(this.timezones, (java.lang.String.class.getClassLoader()));
        in.readList(this.borders, (java.lang.String.class.getClassLoader()));
        this.nativeName = ((String) in.readValue((String.class.getClassLoader())));
        this.numericCode = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.currencies, (com.wafermessenger.wafercountriesmobile.payload.Currency.class.getClassLoader()));
        in.readList(this.languages, (com.wafermessenger.wafercountriesmobile.payload.Language.class.getClassLoader()));
        this.translations = ((Translations) in.readValue((Translations.class.getClassLoader())));
        this.flag = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.regionalBlocs, (com.wafermessenger.wafercountriesmobile.payload.RegionalBloc.class.getClassLoader()));
        this.cioc = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Country() {
    }

    /**
     *
     * @param cioc
     * @param region
     * @param currencies
     * @param numericCode
     * @param callingCodes
     * @param alpha3Code
     * @param nativeName
     * @param topLevelDomain
     * @param alpha2Code
     * @param capital
     * @param altSpellings
     * @param languages
     * @param subregion
     * @param timezones
     * @param flag
     * @param area
     * @param name
     * @param regionalBlocs
     * @param translations
     * @param latlng
     * @param demonym
     * @param gini
     * @param borders
     * @param population
     */
    public Country(String name, List<String> topLevelDomain, String alpha2Code, String alpha3Code, List<String> callingCodes, String capital, List<String> altSpellings, String region, String subregion, Integer population, List<Double> latlng, String demonym, Double area, Double gini, List<String> timezones, List<String> borders, String nativeName, String numericCode, List<Currency> currencies, List<Language> languages, Translations translations, String flag, List<RegionalBloc> regionalBlocs, String cioc) {
        super();
        this.name = name;
        this.topLevelDomain = topLevelDomain;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
        this.callingCodes = callingCodes;
        this.capital = capital;
        this.altSpellings = altSpellings;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.latlng = latlng;
        this.demonym = demonym;
        this.area = area;
        this.gini = gini;
        this.timezones = timezones;
        this.borders = borders;
        this.nativeName = nativeName;
        this.numericCode = numericCode;
        this.currencies = currencies;
        this.languages = languages;
        this.translations = translations;
        this.flag = flag;
        this.regionalBlocs = regionalBlocs;
        this.cioc = cioc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getGini() {
        return gini;
    }

    public void setGini(Double gini) {
        this.gini = gini;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeList(topLevelDomain);
        dest.writeValue(alpha2Code);
        dest.writeValue(alpha3Code);
        dest.writeList(callingCodes);
        dest.writeValue(capital);
        dest.writeList(altSpellings);
        dest.writeValue(region);
        dest.writeValue(subregion);
        dest.writeValue(population);
        dest.writeList(latlng);
        dest.writeValue(demonym);
        dest.writeValue(area);
        dest.writeValue(gini);
        dest.writeList(timezones);
        dest.writeList(borders);
        dest.writeValue(nativeName);
        dest.writeValue(numericCode);
        dest.writeList(currencies);
        dest.writeList(languages);
        dest.writeValue(translations);
        dest.writeValue(flag);
        dest.writeList(regionalBlocs);
        dest.writeValue(cioc);
    }

    public int describeContents() {
        return 0;
    }

}

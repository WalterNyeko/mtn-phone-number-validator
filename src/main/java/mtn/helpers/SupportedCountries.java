package mtn.helpers;

/**
 * This class contains all supported countries
 * Author: Walter Nyeko
 * Email: nyekowalter69@gmail.com
 */
public enum SupportedCountries {

    UGANDA("Uganda"),

    RWANDA("Rwanda"),

    NIGERIA("Nigeria"),

    GHANA("Ghana"),

    ESWATINI("Eswatini"),

    CAMEROON("Cameroon"),

    ZAMBIA("Zambia"),

    SOUTHAFRICA("South Africa");

    public String country;

    SupportedCountries(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return this.country;
    }

    public static boolean resolveForCountryQualification(SupportedCountries country) {
        for (SupportedCountries value : SupportedCountries.values()) {
            if (value.equals(country)) {
                return true;
            }
        }
        return false;
    }
}

package mtn.validators.uganda.allocations.specialtariffs;

/**
 * This enumerator has all codes allocated to
 * Mobile Network Providers In Uganda
 * This codes specify numbers for specific network
 * provider that can be called at local rates
 * Author: Walter Nyeko
 * Email: nyekowalter69@gmail.com
 */
public enum  LocalRatesNumbers {
    UTL("08101"),

    MTN("08102"),

    AIRTEL("08103");

    private String code;

    LocalRatesNumbers(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

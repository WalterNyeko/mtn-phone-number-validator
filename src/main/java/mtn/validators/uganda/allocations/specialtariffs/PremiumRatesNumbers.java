package mtn.validators.uganda.allocations.specialtariffs;

/**
 * This enumerator has all codes allocated to
 * Mobile Network Providers In Uganda
 * This codes specify numbers for specific
 * network provider that can be called at premium rates
 * Author: Walter Nyeko
 * Email: nyekowalter69@gmail.com
 */
public enum  PremiumRatesNumbers {
    UTL("0901"),

    MTN("0902"),

    CELTEL("0903"),

    WARID("0907777"),

    ORANGE("09090004");

    private String code;

    PremiumRatesNumbers(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

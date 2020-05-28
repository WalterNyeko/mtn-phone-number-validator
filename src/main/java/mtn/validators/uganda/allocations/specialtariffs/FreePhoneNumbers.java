package mtn.validators.uganda.allocations.specialtariffs;

/**
 * This enumerator has all codes allocated to
 * Mobile Network Providers In Uganda
 * This codes specify numbers for specific
 * network provider that can be called at no cost
 * Author: Walter Nyeko
 * Email: nyekowalter69@gmail.com
 */
public enum  FreePhoneNumbers {
    UTL("08001"),

    MTN("08002"),

    AIRTEL("08003"),

    WARID_ONE("0800707"),

    WARID_TWO("0800777"),

    ORANGE("0800900");

    private String code;

    FreePhoneNumbers(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

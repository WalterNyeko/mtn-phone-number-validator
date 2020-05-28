package mtn.validators.uganda.allocations.specialtariffs;

/**
 * This enumerator has all codes allocated to
 * Mobile Network Providers In Uganda
 * This codes specify numbers for specific
 * network provider that can be called for a single charge
 * Author: Walter Nyeko
 * Email: nyekowalter69@gmail.com
 */
public enum  SingleChargeNumbers {
    UTL("08201"),

    MTN("08202"),

    AIRTEL("08203"),

    WARID_ONE("0820777"),

    WARID_TWO("08207781");

    private String code;

    SingleChargeNumbers(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

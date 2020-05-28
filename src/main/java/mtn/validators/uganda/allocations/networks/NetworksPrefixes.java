package mtn.validators.uganda.allocations.networks;

/**
 * This enumerator has all codes allocated to Mobile Network Providers In Uganda
 * Author: Walter Nyeko
 * Email: nyekowalter69@gmail.com
 */
public enum  NetworksPrefixes {
    ALL_NETWORKS("02", "All other fixed networks"),

    MTN_FIXED_NETWORKS("03", "MTN fixed network"),

    UTL_FIXED_NETWORKS("04", "Uganda Telecom fixed network"),

    MOBILE_NETWORKS("07", "Mobile networks"),

    SPECIAL_TARIFFS_NETWORKS("08", "Special tariffs & other services"),

    PREMIUM_NETWORKS("09", "Premium rate and Multimedia service");

    private String code;

    private String description;

    NetworksPrefixes(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

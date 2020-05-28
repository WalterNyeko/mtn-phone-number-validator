package mtn.validators.uganda.allocations.networks;

/**
 * This enumerator has all codes allocated to MTN Uganda by UCC
 * Author: Walter Nyeko
 * Email: nyekowalter69@gmail.com
 */
public enum MobileNetworks {

    LEVEL_7_MOBILE_NETWORKS_ONE(770, 779),

    LEVEL_7_MOBILE_NETWORKS_TWO(780, 789);

    public Integer startValue;

    public Integer endValue;

    MobileNetworks(Integer startValue, Integer endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public Integer getStartValue() {
        return startValue;
    }

    public Integer getEndValue() {
        return endValue;
    }

    public static boolean resolveForRangeQualification(String phoneNumber) {
        for (MobileNetworks value : MobileNetworks.values()) {
            String purePhoneNumber = phoneNumber.substring(1); //remove prefixed 0
            Integer firstThreeDigits = Integer.parseInt(purePhoneNumber.substring(0,3));
            if (firstThreeDigits >= value.getStartValue() && firstThreeDigits <= value.getEndValue()) {
                return true;
            }
        }
        return false;
    }
}

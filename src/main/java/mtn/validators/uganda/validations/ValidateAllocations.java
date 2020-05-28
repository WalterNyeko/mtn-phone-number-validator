package mtn.validators.uganda.validations;

public interface ValidateAllocations {

    boolean isValidMTNNetworkNumber(String phoneNumber);

    boolean isValidMTNFixedNetworkNumber(String phoneNumber);

    boolean isValidMTNNetworkAllocatedRange(String phoneNumber);

    boolean isValidFreeNumberPrefixCodes(String phoneNumber);

    boolean isValidLocalRateNumberPrefixCodes(String phoneNumber);

    boolean isValidSingleRateNumberPrefixCodes(String phoneNumber);

    boolean isValidPremiumRateNumberPrefixCodes(String phoneNumber);

    boolean isValidNetworkPrefixCodes(String phoneNumber);
}

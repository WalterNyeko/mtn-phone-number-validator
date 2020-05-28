package mtn.validators.uganda.validations;


import mtn.validators.uganda.allocations.networks.MobileNetworks;
import mtn.validators.uganda.allocations.networks.NetworksPrefixes;
import mtn.validators.uganda.allocations.specialtariffs.FreePhoneNumbers;
import mtn.validators.uganda.allocations.specialtariffs.LocalRatesNumbers;
import mtn.validators.uganda.allocations.specialtariffs.PremiumRatesNumbers;
import mtn.validators.uganda.allocations.specialtariffs.SingleChargeNumbers;

public class ValidateAllocationsImpl implements ValidateAllocations {

    /**
     * This method validates that the provided number matches
     * the codes that UCC has allocated to MTN Uganda for The different networks
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidMTNNetworkNumber(String phoneNumber) {
        if (phoneNumber.startsWith(NetworksPrefixes.MOBILE_NETWORKS.getCode())
                || phoneNumber.startsWith(NetworksPrefixes.MTN_FIXED_NETWORKS.getCode())
                || phoneNumber.startsWith(NetworksPrefixes.SPECIAL_TARIFFS_NETWORKS.getCode())
                || phoneNumber.startsWith(NetworksPrefixes.PREMIUM_NETWORKS.getCode())) {
            return true;
        }
        return false;
    }

    /**
     * This method validates that the provided number matches
     * the codes that UCC has allocated to MTN Uganda for Fixed Lines Networks
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidMTNFixedNetworkNumber(String phoneNumber) {
        //03xxxxx Numbers
        if (phoneNumber.startsWith(NetworksPrefixes.MTN_FIXED_NETWORKS.getCode())) {
            return true;
        }
        return false;
    }

    /**
     * This method validates that the provided number matches
     * the codes that UCC has allocated to MTN Uganda for Mobile Network Range
     * 0770-0779
     * 0780-0789
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidMTNNetworkAllocatedRange(String phoneNumber) {
        if (MobileNetworks.resolveForRangeQualification(phoneNumber)) {
            return true;
        }
        return false;
    }


    /**
     * This method validates that the provided number matches
     * the codes that UCC has allocated to MTN Uganda for Free Calls
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidFreeNumberPrefixCodes(String phoneNumber) {
        if (phoneNumber.startsWith(FreePhoneNumbers.MTN.getCode())) {
            return true;
        }
        return false;
    }

    /**
     * This method validates that the provided number matches
     * the codes that UCC has allocated to MTN Uganda for Local Rates
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidLocalRateNumberPrefixCodes(String phoneNumber) {
        if (phoneNumber.startsWith(LocalRatesNumbers.MTN.getCode())) {
            return true;
        }
        return false;
    }

    /**
     * This method validates that the provided number matches
     * the codes that UCC has allocated to MTN Uganda for Single Charge Rates
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidSingleRateNumberPrefixCodes(String phoneNumber) {
        if (phoneNumber.startsWith(SingleChargeNumbers.MTN.getCode())) {
            return true;
        }
        return false;
    }

    /**
     * This method validates that the provided number matches
     * the codes that UCC has allocated to MTN Uganda for Premium Rates
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidPremiumRateNumberPrefixCodes(String phoneNumber) {
        if (phoneNumber.startsWith(PremiumRatesNumbers.MTN.getCode())) {
            return true;
        }
        return false;
    }

    /**
     * This method validates that the provided number matches one of
     * the codes that UCC has allocated to MTN Uganda
     * @param phoneNumber
     * @return
     */
    @Override
    public boolean isValidNetworkPrefixCodes(String phoneNumber) {
        if (isValidMTNNetworkNumber(phoneNumber)) {

            //03xxxxx Numbers
            if (isValidMTNFixedNetworkNumber(phoneNumber)) {
                return true;
            }
            //07xxxxx Numbers
            if (isValidMTNNetworkAllocatedRange(phoneNumber)) {
                return true;
            }
            //08002xxxxx Numbers
            if (isValidFreeNumberPrefixCodes(phoneNumber)) {
                return true;
            }
            //08102xxxxx Numbers
            if (isValidLocalRateNumberPrefixCodes(phoneNumber)) {
                return true;
            }
            //08202xxxxx Numbers
            if (isValidSingleRateNumberPrefixCodes(phoneNumber)) {
                return true;
            }
            //0902xxxxx Numbers
            if (isValidPremiumRateNumberPrefixCodes(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}

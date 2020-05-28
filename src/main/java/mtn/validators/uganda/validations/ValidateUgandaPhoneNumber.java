package mtn.validators.uganda.validations;


import mtn.helpers.CountryCodes;
import mtn.helpers.SupportedCountries;
import mtn.helpers.Validation;

public class ValidateUgandaPhoneNumber implements Validation {

    private static final String prefixPlus = "+";
    private static final String nationalPrefix = "0";
    private boolean validateWithPlusPrefix;
    private boolean validateWithCountryCode;
    public ValidateUgandaPhoneNumber(
            boolean validateWithPlusPrefix,
            boolean validateWithCountryCode) {
        this.validateWithPlusPrefix = validateWithPlusPrefix;
        this.validateWithCountryCode = validateWithCountryCode;
    }

    private boolean isSupportedCountry(SupportedCountries country) {
        if (SupportedCountries.resolveForCountryQualification(country)){
            return true;
        }
        return false;
    }

    private boolean isValidCountryCode(String phoneNumber, SupportedCountries country) {
        if (containsPlus(phoneNumber)) {
            String theActualDigits = phoneNumber.replace(prefixPlus, "");
            if (isSupportedCountry(country)){
                if (theActualDigits.startsWith(CountryCodes.UGANDA_COUNTRY_CODE)) {
                    return true;
                }
            }
        } else {
            if (isSupportedCountry(country)){
                if (phoneNumber.startsWith(CountryCodes.UGANDA_COUNTRY_CODE)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean containsPlus(String phoneNumber) {
        if (phoneNumber.startsWith(prefixPlus)) {
            return true;
        }
        return false;
    }

    /**
     * Validate International MTN Phone Numbers
     * @param phoneNumber
     * @return boolean
     */
    @Override
    public boolean isValidPhoneNumber(String phoneNumber) {
        ValidateAllocations validateAllocations = new ValidateAllocationsImpl();
        if (validateWithPlusPrefix && validateWithCountryCode) {
            if (containsPlus(phoneNumber) && isValidCountryCode(phoneNumber, SupportedCountries.UGANDA)) {
                String codeAndPlus = prefixPlus+CountryCodes.UGANDA_COUNTRY_CODE;
                String localPhoneNumber = phoneNumber.replace(codeAndPlus, nationalPrefix);
                if (isValid(validateAllocations, localPhoneNumber)) return true;
            }
        }else if (!validateWithPlusPrefix && validateWithCountryCode){
            if (isValidCountryCode(phoneNumber, SupportedCountries.UGANDA)) {
                String localPhoneNumber = nationalPrefix+ phoneNumber.substring(3);
                if (isValid(validateAllocations, localPhoneNumber)) return true;
            }
        }else if (!validateWithPlusPrefix && !validateWithCountryCode) {
            if (isValid(validateAllocations, phoneNumber)) return true;
        }
        return false;
    }

    private boolean isValid(ValidateAllocations validateAllocations, String localPhoneNumber) {
        if (localPhoneNumber.matches("[0-9]+")
                && localPhoneNumber.length() == 10 &&
                validateAllocations.isValidNetworkPrefixCodes(localPhoneNumber)) {
            return true;
        }
        return false;
    }
}

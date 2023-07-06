package phone.contacts.rest.api.lib;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<PhoneValid, String> {
    private static final String PHONE_NUMBER_PATTERN = "^\\+38\\d{10}$";


    @Override
    public void initialize(PhoneValid annotation) {
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
//        if (phoneNumber == null || phoneNumber.isBlank()) {
//
//        }
        return phoneNumber.matches(PHONE_NUMBER_PATTERN);
    }
}

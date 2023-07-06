package phone.contacts.rest.api.lib;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneValid {
    String message() default "Phone number should start with +38";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

package rules;

import core.PersonalNumber;
import utilities.LuhnAlgorithm;

public class LuhnValidationRule implements ValidationRule<PersonalNumber> {

    @Override
    public boolean validate(PersonalNumber personalNumber) {
        return LuhnAlgorithm.validate(personalNumber.getNumericForm());
    }

    @Override
    public String getErrorMsg() {
        return "Luhn validation failed.";
    }
}

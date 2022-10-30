package rules;

import core.PersonalNumber;

import java.util.Arrays;

public class DigitLengthRule implements ValidationRule<PersonalNumber> {

    private static final int[] ALLOWED_LENGTHS = {10, 12};

    @Override
    public boolean validate(PersonalNumber personalNumber) {
        int length = personalNumber.getNumericForm().length();

        for (int i : ALLOWED_LENGTHS) {
            if (length == i) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getErrorMsg() {
        return "Personal Number doesn't match required length. Allowed lengths: " + Arrays.toString(ALLOWED_LENGTHS);
    }
}

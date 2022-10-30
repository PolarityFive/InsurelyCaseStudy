package rules;

import core.PersonalNumber;

public class AllowedCharactersRule implements ValidationRule<PersonalNumber> {
    /*
     * This regex will ensure that a personal number will exclusively consist of:
     * Any number of digits that may or may not include either a plus or hyphen.
     */
    final String regPattern = "([0-9]+([-]|[+])[0-9]+)|([0-9]+)";

    @Override
    public boolean validate(PersonalNumber personalNumber) {
        return personalNumber.getNumber().matches(regPattern);
    }

    @Override
    public String getErrorMsg() {
        return "Illegal characters detected. Number may only contain numbers and a hyphen or plus sign.";
    }
}

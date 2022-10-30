package validators;

import core.PersonalNumber;
import rules.LuhnValidationRule;
import rules.AllowedCharactersRule;
import rules.DigitLengthRule;

public class SwedishPersonalNumberValidator extends AbstractValidator<PersonalNumber> {

    public SwedishPersonalNumberValidator() {
        addRule(new DigitLengthRule());
        addRule(new AllowedCharactersRule());
        addRule(new LuhnValidationRule());
    }
}

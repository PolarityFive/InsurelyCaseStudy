package validators;

import rules.BlankNameRule;
import rules.EnforceSwedishCharactersRule;

public class SwedishNameValidator extends AbstractValidator<String> {

    public SwedishNameValidator() {
        addRule(new EnforceSwedishCharactersRule());
        addRule(new BlankNameRule());
    }
}

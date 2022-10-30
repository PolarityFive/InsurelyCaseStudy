package validators;

import exceptions.ValidationException;
import rules.ValidationRule;

import java.util.ArrayList;
import java.util.List;

public class AbstractValidator<T> implements Validator<T> {

    private List<ValidationRule<T>> validationRules = new ArrayList<>();

    @Override
    public void validate(T value) throws ValidationException {
        List<String> errors = new ArrayList<>();

        validationRules.forEach(rule -> {
            if (!rule.validate(value)) {
                errors.add(rule.getErrorMsg());
            }
        });

        if (errors.isEmpty()) {
            return;
        }

        throw new ValidationException(errors);
    }

    protected void addRule(ValidationRule<T> rule) {
        validationRules.add(rule);
    }

}


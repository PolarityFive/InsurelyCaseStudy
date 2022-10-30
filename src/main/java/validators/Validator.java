package validators;

import exceptions.ValidationException;

public interface Validator<T> {
    void validate(T value) throws ValidationException;
}

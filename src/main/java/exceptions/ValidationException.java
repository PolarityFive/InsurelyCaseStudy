package exceptions;

import java.util.List;

public class ValidationException extends Exception {

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(List<String> errors) {
        super(String.join("\n", errors));
    }

}

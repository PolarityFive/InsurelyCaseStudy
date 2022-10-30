package validators;

import exceptions.ValidationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwedishNameValidatorTest {
    SwedishNameValidator swedishNameValidator = new SwedishNameValidator();

    @Test
    void validate_nameBlank_validationExceptionErrorsMatch() {
        Throwable throwable = assertThrows(ValidationException.class, () -> swedishNameValidator.validate(""));
        assertEquals("Name must only contain English or Swedish characters.\n" +
                        "Name can not be blank.",
                throwable.getMessage());
    }

    @Test
    void validate_nameWithNorwegianCharacters_validationExceptionErrorMatches() {
        Throwable throwable = assertThrows(ValidationException.class, () -> swedishNameValidator.validate("Ægir"));
        assertEquals("Name must only contain English or Swedish characters.", throwable.getMessage());
    }

    @Test
    void validate_nameWithEnglishCharacters_validated() {
        assertDoesNotThrow(() -> swedishNameValidator.validate("Lisbeth Salander"));
    }

}

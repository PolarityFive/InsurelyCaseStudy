package validators;

import core.PersonalNumber;
import exceptions.ValidationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwedishPersonalNumberValidatorTest {

    SwedishPersonalNumberValidator swedishPersonalNumberValidator = new SwedishPersonalNumberValidator();

    @Test
    void validate_invalidDigits_errorsMatch() {
        final String expectedError = "Personal Number doesn't match required length. Allowed lengths: [10, 12]\n" +
                "Luhn validation failed.";
        final String number = "250898-44666699";

        PersonalNumber personalNumber = new PersonalNumber(number);
        Throwable throwable = assertThrows(ValidationException.class, () -> swedishPersonalNumberValidator.validate(personalNumber));
        assertEquals(expectedError, throwable.getMessage());
    }

    @Test
    void validate_invalidDigitsAndLength_errorsMatch() {
        final String expectedError = "Personal Number doesn't match required length. Allowed lengths: [10, 12]\n" +
                "Illegal characters detected. Number may only contain numbers and a hyphen or plus sign.\n" +
                "Luhn validation failed.";
        final String number = "250898--44666699";

        PersonalNumber personalNumber = new PersonalNumber(number);
        Throwable throwable = assertThrows(ValidationException.class, () -> swedishPersonalNumberValidator.validate(personalNumber));
        assertEquals(expectedError, throwable.getMessage());
    }

    @Test
    void validate_correctNumber_validated() {
        final String number = "2508984461";
        PersonalNumber personalNumber = new PersonalNumber(number);
        assertDoesNotThrow(() -> swedishPersonalNumberValidator.validate(personalNumber));
    }

}

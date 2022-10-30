package rules;

import core.PersonalNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class DigitLengthRuleTest {
    DigitLengthRule digitLengthRule = new DigitLengthRule();

    @ParameterizedTest
    @ValueSource(strings = {"1234", "12345678912", "1234567891234"})
    void validate_invalidAmountOfDigits_falseReturned(String number) {
        PersonalNumber personalNumber = new PersonalNumber(number);
        assertFalse(digitLengthRule.validate(personalNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234567890", "123456789012"})
    void validate_validAmountOfDigits_trueReturned(String number) {
        PersonalNumber personalNumber = new PersonalNumber(number);
        assertTrue(digitLengthRule.validate(personalNumber));
    }

}

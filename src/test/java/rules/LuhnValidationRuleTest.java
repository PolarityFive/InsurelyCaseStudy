package rules;

import core.PersonalNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LuhnValidationRuleTest {

    LuhnValidationRule luhnValidationRule = new LuhnValidationRule();

    @Test
    void validate_numberNotValidated_falseReturned() {
        PersonalNumber personalNumber = new PersonalNumber("250898-4466");
        assertFalse(luhnValidationRule.validate(personalNumber));
    }

    @Test
    void validate_numberValidated_trueReturned() {
        PersonalNumber personalNumber = new PersonalNumber("250898-4461");
        assertTrue(luhnValidationRule.validate(personalNumber));
    }
}

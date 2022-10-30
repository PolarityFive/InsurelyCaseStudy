package rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EnforceSwedishCharactersRuleTest {

    EnforceSwedishCharactersRule enforceSwedishCharactersRule = new EnforceSwedishCharactersRule();

    @ParameterizedTest
    @ValueSource(strings = {"Bút", "VДlve", "Ægir"})
    void validate_invalidNames_falseReturned(String name) {
        assertFalse(enforceSwedishCharactersRule.validate(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"John", "Pete Mitchell", "Lillian Van Der Woodsen", "Aslög", "Håkan Håkan"})
    void validate_validNames_trueReturned(String name) {
        assertTrue(enforceSwedishCharactersRule.validate(name));
    }
}

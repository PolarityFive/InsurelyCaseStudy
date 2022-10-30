package rules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlankNameRuleTest {
    BlankNameRule blankNameRule = new BlankNameRule();

    @Test
    public void validate_blankName_falseReturned() {
        assertFalse(blankNameRule.validate(""));
    }

    @Test
    public void validate_nonBlankName_trueReturned() {
        assertTrue(blankNameRule.validate("Pete Mitchell"));
    }
}

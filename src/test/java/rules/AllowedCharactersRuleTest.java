package rules;

import core.PersonalNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AllowedCharactersRuleTest {

    AllowedCharactersRule allowedCharactersRule = new AllowedCharactersRule();

    @ParameterizedTest
    @ValueSource(strings = {"123456=7891", "123456!7891", "123456%7891", "123456@7891", "123456(7891", "123456$7891", "123456--7891", "123456++7891", "123456-+7891"})
    void validate_incorrectSpecialCharactersPresent_falseReturned(String number) {
        PersonalNumber personalNumber = new PersonalNumber(number);

        assertFalse(allowedCharactersRule.validate(personalNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456-7891", "12345678-7891", "123456+7891", "12345678+7891", "2508981234", "250898123456"})
    void validate_correctNumbers_trueReturned(String number) {
        PersonalNumber personalNumber = new PersonalNumber(number);
        assertTrue(allowedCharactersRule.validate(personalNumber));
    }
}

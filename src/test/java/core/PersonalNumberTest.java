package core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalNumberTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void getNumericForm_plusAndHyphenInNumber_removed(String number, String matcher) {
        PersonalNumber personalNumber = new PersonalNumber(number);
        assertEquals(personalNumber.getNumericForm(), matcher);
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("123456-7890", "1234567890"),
                Arguments.of("12345678-7890", "123456787890"),
                Arguments.of("123456+7890", "1234567890"),
                Arguments.of("12345678+7890", "123456787890"),
                Arguments.of("1234567890", "1234567890")
        );
    }
}

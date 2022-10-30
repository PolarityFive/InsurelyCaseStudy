package utilities;

public class LuhnAlgorithm {

    public static boolean validate(String number) {
        return (number.charAt(number.length() - 1)) - '0' == calculateCheckDigit(number);
    }

    public static int calculateCheckDigit(String number) {
        number = number.substring(0, number.length() - 1);
        int sum = 0;
        boolean alternate = true;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = number.charAt(i) - '0';

            if (alternate) {
                if (digit * 2 >= 10) {
                    sum += (digit * 2) - 9;
                } else {
                    sum += digit * 2;
                }
            } else {
                sum += digit;
            }

            alternate = !alternate;
        }
        return (1000 - sum) % 10;
    }
}

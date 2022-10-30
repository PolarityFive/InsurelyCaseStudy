package core;

public class PersonalNumber {

    private final String number;

    public PersonalNumber(String value) {
        this.number = value;
    }

    public String getNumber() {
        return this.number;
    }

    public String getNumericForm() {
        return this.number.replaceAll("[^0-9]", "");
    }

}
package core;

public class Person {

    private final String name;
    private final PersonalNumber personalNumber;

    public Person(String name, PersonalNumber personalNumber) {
        this.name = name;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public PersonalNumber getPersonalNumber() {
        return personalNumber;
    }
}
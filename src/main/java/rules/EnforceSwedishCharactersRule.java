package rules;

public class EnforceSwedishCharactersRule implements ValidationRule<String> {

    final String regPatten = "[åäöÅÄÖA-Za-z\\s]+";

    @Override
    public boolean validate(String name) {
        return name.matches(regPatten);
    }

    @Override
    public String getErrorMsg() {
        return "Name must only contain English or Swedish characters.";
    }
}

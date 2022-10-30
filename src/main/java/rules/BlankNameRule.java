package rules;

public class BlankNameRule implements ValidationRule<String> {

    @Override
    public boolean validate(String value) {
        return !value.equals("");
    }

    @Override
    public String getErrorMsg() {
        return "Name can not be blank.";
    }
}

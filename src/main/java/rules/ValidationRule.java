package rules;

public interface ValidationRule<T> {
    boolean validate(T value);

    String getErrorMsg();
}

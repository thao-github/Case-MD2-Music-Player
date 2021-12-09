package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public ValidateEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail", "@#abc@gmail.com"};
        ValidateEmail validateEmail = new ValidateEmail();
        for (String email : validEmail) {
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }

        for (String email : invalidEmail) {
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}

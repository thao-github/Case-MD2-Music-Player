package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    private static final String PN_REGEX = "^[0-9]{2}+-+0+[1-9]{9}$";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PN_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class ValidatePhoneNumberTest {
    private static final String [] validPhoneNumber = new String [] {"84-0912345678"};
    private static final String [] inValidPhoneNumber = new String [] {"a4-0912345678"};

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        for (String phoneNumber : validPhoneNumber) {
            boolean isValid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("The Phone Number " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber : inValidPhoneNumber) {
            boolean isValid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("The Phone Number " + phoneNumber + " is valid: " + isValid );
            }
        }
    }


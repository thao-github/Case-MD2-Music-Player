package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {

    private static final String ACCOUNT_REGEX = "^[a-z0-9]{6,}$";

    public ValidateAccount() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

    class ValidateAccountTest {
        public static final String[] validAccount = new String[]{"123abc", "acb1234", "123456"};
        public static final String[] inValidAccount = new String[]{"_123abc", "123ABC", ".@"};


        public static void main(String[] args) {
            ValidateAccount validateAccount = new ValidateAccount();
            for (String account : validAccount) {
                boolean isValid = validateAccount.validate(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }

            for (String account : inValidAccount) {
                boolean isValid = validateAccount.validate(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }
        }
    }


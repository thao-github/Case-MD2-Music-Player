package StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {

    private static final String CLASS_NAME_REGEX = "^[CAP]+[0-9]{4}+[GHIKLM]$";

    public ValidateClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class ValidateClassNameTest {
    private static final String[] validClassName = new String[]{"C0318G", "A1234H", "P2610I"};
    private static final String[] inValidClassName = new String[]{"B03189", "F1234O", "123"};

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        for (String classname : validClassName) {
            boolean isValid = validateClassName.validate(classname);
            System.out.println("The ClassName" + classname + " is valid: " + isValid);
        }

        for (String classname : inValidClassName) {
            boolean isValid = validateClassName.validate(classname);
            System.out.println("The ClassName " + classname + " is valid: " + isValid);
        }
    }
}

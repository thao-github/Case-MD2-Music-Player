package service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    static Scanner scanner = new Scanner(System.in);

    //name/ user cannot be null
    public String isEmpty() {
        do {
            String name = scanner.nextLine();
            if (name.trim().equals("")) {
                System.err.println("Cannot be null.");
            } else {
                return name;
            }
        } while (true);
    }
    //validate password: gom so + chu
    public String validatePassword(){
        while (true) {
            String password = scanner.nextLine();
            Matcher matcher;
            Pattern pattern = Pattern.compile("^[A-Za-z]{2,}+[0-9]{1,}$");
            matcher = pattern.matcher(password);
            boolean isValidatePassword = matcher.matches();

            if (isValidatePassword) {
                return password;
            } else {
                System.err.println("Password must include at least 2 character & 1 number ");
                System.out.println("Enter password: ");
            }
        }
    }

    //validate email
    public String validateEmail() {
        while (true) {
            String email = scanner.nextLine();
            Matcher matcher;
            Pattern pattern = Pattern.compile("^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");
            matcher = pattern.matcher(email);
            boolean isValidateEmail = matcher.matches();

            if (isValidateEmail) {
                return email;
            } else {
                System.err.println("Invalid Email. Email must be @gmail.com / @yahoo.com / @hotmail.com");
                System.out.println("Enter email: ");
            }
        }
    }
}





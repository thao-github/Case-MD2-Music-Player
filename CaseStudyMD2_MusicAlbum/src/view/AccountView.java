package view;

import model.Account;
import service.Validate;

import java.util.Scanner;

public class AccountView {
    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    public int menuLogin() {
        System.out.println("                                                                            ");
        System.out.println("                        ♪ ♪ ♪ Welcome to RING RING.mp3 ♪ ♪ ♪                ");
        System.out.println("                        Press 1 to Login. Press 2 to Sign up.               ");
        System.out.println("                                                                            ");
        System.out.println("                                    1. LOG IN                               ");
        System.out.println("                                    2. SIGN UP                              ");

        while (true) {
            try {
                int menuLogin = Integer.parseInt(scanner.nextLine());
                if (menuLogin == 1 || menuLogin == 2) {
                    return menuLogin;
                }
            } catch (NumberFormatException e) {
                System.err.println("Press 1 or 2.");
            }
        }
    }

    public Account loginUser() {
        System.out.println("Enter userName: ");
        String userName = validate.isEmpty();
        System.out.println("Enter password: ");
        String passWord = scanner.nextLine();
        return new Account(userName, passWord);
    }

    public Account signup() {
        System.out.println("Enter userName: ");
        String userName = validate.isEmpty();
        System.out.println("Enter password: ");
        String passWord = validate.validatePassword();
        System.out.println("Enter email: ");
        String email = validate.validateEmail();
        return new Account(userName, passWord, email);
    }

    public void alertAccountExist() {
        System.err.println("User name or Email is ALREADY exist! Please enter another Username or another Email!");
    }

    public void alertAccountNotExist() {
        System.err.println("Account is NOT exist. Sign up to continue!");
    }

    public void alertSignUpSuccess() {
        System.out.println("Account Sign up Success. Log in to enjoy RING RING.mp3 ♪ ");
    }
}

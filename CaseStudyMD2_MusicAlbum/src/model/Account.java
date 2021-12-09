package model;

import java.io.Serializable;

public class Account implements Serializable {
    private String userName;
    private String passWord;
    private String email;

    public Account() {
    }

    public Account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public Account(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

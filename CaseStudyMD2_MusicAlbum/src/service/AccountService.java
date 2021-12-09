package service;

import io.Path;
import io.ReadAndWrite;
import model.Account;

import java.util.List;

public class AccountService {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    public static final String ACCOUNT_PATH = Path.PATH + "accountList.txt";
    public List<Account> accountList = readAndWrite.readFile(ACCOUNT_PATH);
    public static Account accountUser = new Account();

    public boolean loginUser(Account account) {
        for (Account acc : accountList) {
            if (account.getUserName().equals(acc.getUserName()) && account.getPassWord().equals(acc.getPassWord())) {
                accountUser = account;
                return true;
            }
        }
        return false;
    }

    public boolean loginAdmin(Account account) {

        if (account.getUserName().equalsIgnoreCase("admin") && account.getPassWord().equalsIgnoreCase("admin")) {
            return true;
        }
        return false;
    }

    public void signup(Account account) {
        for (Account acc : accountList) {
            if (account.getUserName().equals(acc.getUserName()) || account.getEmail().equals(acc.getEmail())) {
                return;
            }
        }
        accountList.add(account);
        readAndWrite.writeFile(ACCOUNT_PATH, accountList);
    }

    public boolean isAccountExist(Account account) {
        boolean isAccountExist = false;
        for (Account acc : accountList) {
            if (account.getUserName().equalsIgnoreCase(acc.getUserName()) || account.getEmail().equalsIgnoreCase(acc.getEmail())) {
                isAccountExist = true;
            }
        }
        return isAccountExist;
    }

    public List<Account> findAll() {
        return accountList;
    }

}


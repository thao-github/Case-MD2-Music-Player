package controller;

import model.Account;
import service.AccountService;
import view.AccountView;

public class AccountController {

    public void managerLogin() {
        while (true) {
            AccountService accountService = new AccountService();
            AccountView accountView = new AccountView();
            PlaylistController playlistController = new PlaylistController();
            SongController songController = new SongController();
            int choice = accountView.menuLogin();

            switch (choice) {
                case 1: {
                    Account account = accountView.loginUser();
                    if (accountService.loginAdmin(account)) {
                        songController.managerAdmin();
                        break;
                    }
                    if (accountService.loginUser(account)) {
                        playlistController.managerUser();
                        break;
                    } else {
                        accountView.alertAccountNotExist();
                        accountView.menuLogin();
                    }
                }

                case 2: {
                    Account account = accountView.signup();
                    boolean isAccountExist = accountService.isAccountExist(account);
                    if (isAccountExist) {
                        accountView.alertAccountExist();
                    } else {
                        accountService.signup(account);
                        accountView.alertSignUpSuccess();
                        break;
                    }
                }
            }
        }
    }
}

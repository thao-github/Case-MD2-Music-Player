package controller;

import service.SongService;
import view.SongView;


public class SongController {
    static SongView songView = new SongView();
    static SongService songService = new SongService();
    AccountController accountController = new AccountController();

    public void managerAdmin() {


        while (true) {
            int choice = songView.menuAdmin();
            switch (choice) {
                case 1: {
                    songService.save(songView.createSong());
                    songView.songCreateSuccess();
                    break;
                }
                case 2: {//edit Name
                    while (true) {
                        String songName = songView.inputSongNameToEdit();
                        int index = songService.findSongIndexByName(songName);
                        boolean isSongExist = songService.isSongExist(songName);

                        if (isSongExist) {
                            while (true) {
                                String newName = songView.editSongByName();
                                if (newName.equals(songName)) {
                                    songView.alertEditName();
                                } else {
                                    songService.editSongByName(index, newName);
                                    songView.alertEditSuccess();
                                    break;
                                }
                            }
                            break;
                        } else {
                            songView.alertSongNotExist();
                            String choose = songView.backToMenu();
                            if (choose.equals("2")) {
                                managerAdmin();
                            }
                        }
                    }
                    break;
                }
                case 3: {//delete
                    while (true) {
                        String songName = songView.inputSongNameToDelete();
                        boolean isSongExist = songService.isSongExist(songName);
                        int index = songService.findSongIndexByName(songName);

                        if (isSongExist) {
                            int choose = songView.deleteOrNot();
                            switch (choose) {
                                case 1: {
                                    songService.deleteSongByName(index);
                                    songView.alertDeleteSongSuccess();
                                    songService.displayAllSong();
                                }
                                case 2: {
                                    managerAdmin();
                                }
                            }
                        } else {
                            songView.alertSongNotExist();
                            String choose = songView.backToMenu();
                            if (choose.equals("2")) {
                                managerAdmin();
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    songService.sortSongByName();
                    songView.alertSortSongSuccess();
                    break;
                }
                case 5: {
                    while (true) {
                        String songName = songView.inputSongNameToSearch();
                        boolean isSongExist = songService.isSongExist(songName);
                        if (isSongExist) {
                            songService.searchSongByName(songName);
                            break;
                        } else {
                            songView.alertSongNotExist();
                        }
                    }
                    break;
                }
                case 6: {
                    songView.displayAllSong();
                    songService.countSongInLibrary();
                    songService.displayAllSong();
                    break;
                }
                case 7: {
                    int select = songView.manageUser();
                    switch (select) {
                        case 1: {
                            songService.displayUser();
                            break;
                        }
                        case 2: {
                            while (true) {
                                String userNameToBlock = songView.inputUserNameToBlock();
                                int index = songService.findAccountIndexByName(userNameToBlock);
                                boolean isAccountExist = songService.isAccountExist(userNameToBlock);
                                if (isAccountExist) {
                                    songService.blockUser(userNameToBlock, index);
                                    songView.alertBlockUser();
                                    break;
                                } else {
                                    songView.alertAccountNotExist();
                                    String choose = songView.backToMenu();
                                    if (choose.equals("2")) {
                                        managerAdmin();
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                case 8: {
                    accountController.managerLogin();
                }
                break;
            }
        }
    }
}

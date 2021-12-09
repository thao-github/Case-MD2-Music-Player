package view;

import model.Account;
import model.Playlist;
import service.AccountService;
import service.Validate;

import java.util.Scanner;

public class PlaylistView {
    static Scanner scanner = new Scanner(System.in);
    SongView songView = new SongView();
    static Validate validate = new Validate();

    public int menuUser() {
        System.out.println("                                              ♪ ♪ ♪ Welcome " + AccountService.accountUser.getUserName().toUpperCase() + " ♪ ♪ ♪");
        System.out.println("                1. CREATE New Playlist                      " + "       5. DELETE song from Playlist        ");
        System.out.println("                2. EDIT Playlist (by Name)                  " + "       6. DISPLAY songs of a Playlist      ");
        System.out.println("                3. DELETE Playlist                          " + "       7. DISPLAY ALL Playlist             ");
        System.out.println("                4. ADD A Song to Playlist                   " + "       8. SIGN OUT                         ");
        System.out.println("                                                                                                            ");

        System.out.println("Enter your choice: ");
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7 || choice == 8) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                System.err.println("Press 1 ~ 8");
            }
        }
    }

    //1 create New Playlist
    public Playlist createNewPlaylist() {
        System.out.println("Enter PLAYLIST name: ");
        String name = validate.isEmpty();
        return new Playlist(name);
    }

    public void alertPlaylistCreateSuccess() {
        System.out.println("Playlist Create Success!");
    }

    //2 edit Playlist by Name
    public String inputPlaylistNameToEdit() {
        System.out.println("Enter PLAYLIST NAME you want to EDIT: ");
        return scanner.nextLine();
    }

    public String inputNewPlaylistName() {
        System.out.println("Enter NEW Playlist Name: ");
        String newName = validate.isEmpty();
        return newName;
    }

    public void alertNameEdit() {
        System.err.println("The Playlist Name is the same. Enter other Name! ");
    }

    public void alertPlaylistNotExist() {
        System.err.println("Playlist does not Exist!");
        System.out.println("Press 1 to continue. Press 2 to Back to Menu.");
    }

    public void alertPlaylistEditSuccess() {
        System.out.println("Playlist Edit Success!");
    }


    //3 delete Playlist
    public String inputDeletePlaylistName() {
        System.out.println("Enter PLAYLIST NAME you want to DELETE: ");
        return scanner.nextLine();
    }

    public int chooseToDeletePlaylist() {
        System.out.println("ARE YOU SURE? This process cannot be undone!");
        System.out.println("Press 1 to Delete. Press 2 to Return.");
        return Integer.parseInt(scanner.nextLine());
    }


    //4 add song to Playlist
    public String inputSongNameToAdd() {
        System.out.println("Enter SONG NAME that you want to ADD TO PLAYLIST");
        return scanner.nextLine();
    }

    public String inputPlaylistNameToAddSong() {
        System.out.println("Enter PLAYLIST NAME you want to ADD song: ");
        return scanner.nextLine();
    }

    public int selectToAddSong() {
        System.out.println("Press 1 to ADD another Song. Press 2 to BACK to Menu.");
        return Integer.parseInt(scanner.nextLine());
    }

    public void alertSongNotExist() {
        System.err.println("Song or Playlist NOT exist!");
    }

    //5 delete song form Playlist
    public String inputPlaylistNameToDeleteSong() {
        System.out.println("Enter PLAYLIST NAME you want to DELETE song: ");
        return scanner.nextLine();
    }

    public String inputSongNameToDelete() {
        System.out.println("Enter SONG NAME that you want to DELETE FROM PLAYLIST: ");
        return scanner.nextLine();
    }

    public void alertSongOrPlaylistNotExist() {
        System.err.println("Playlist or Song not Exist!");
    }

    public void alertDeleteSongFromPlaylistSuccess() {
        System.out.println("Song Delete from Playlist Success!");
    }

    //6 Display songs of a Playlist
    public String inputPlaylistNameToDisplaySongList() {
        System.out.println("Enter PLAYLIST NAME you want do display: ");
        return scanner.nextLine();
    }

    public void alertPlaylistNull() {
        System.err.println("Playlist is Null");
        System.out.println("Press 1 to continue. Press 2 to Back to Menu");
    }

    //7 display All Playlist

    public String backToMenu(){
        return scanner.nextLine();
    }
}

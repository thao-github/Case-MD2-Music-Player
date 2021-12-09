package view;

import model.Song;
import service.Validate;

import java.util.Scanner;

public class SongView {
    static Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    public int menuAdmin (){
        System.out.println("                                                                                        ");
        System.out.println("                             ♪ ♪ ♪ Welcome ADMIN ♪ ♪ ♪                                  ");
        System.out.println("            1. CREATE New Song          " + "           5. SEARCH Song                  ");
        System.out.println("            2. EDIT Song (by Name)      " + "           6. DISPLAY All Songs            ");
        System.out.println("            3. DELETE Song (by Name)    " + "           7. Manage User                  ");
        System.out.println("            4. SORT Song (by Name)      " + "           8. SIGN OUT                     ");
        System.out.println("                                                                                        ");

        System.out.println("                                 Enter your choice:                                     ");
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

    //1 create Song
    public Song createSong () {
            System.out.println("Enter Song name: ");
            String name = validate.isEmpty();
            System.out.println("Enter singer: ");
            String singer = validate.isEmpty();
            return new Song(name, singer);
    }
    public void songCreateSuccess () {
        System.out.println("Song Create Success!");
    }


    //2 edit Song by Name
    public String inputSongNameToEdit() {
        System.out.println("Enter Song Name that you want to EDIT: ");
        return scanner.nextLine();
    }

    public String editSongByName(){
        System.out.println("Enter new Song Name: ");
        return scanner.nextLine();
    }

    public void alertEditName (){
        System.err.println("Song name must be different form the old one.");
    }

    public void alertSongNotExist() {
        System.err.println("Song is not exist.");
        System.out.println("Press 1 to continue. Press 2 to Back to Menu.");
    }

    public void alertEditSuccess() {
        System.out.println("Song Edit Success!");
    }


    //3 delete Song
    public String inputSongNameToDelete() {
        System.out.println("Enter Song Name that you want to DELETE: ");
        return scanner.nextLine();
    }

    public int deleteOrNot(){
        System.out.println("Press 1 to Delete. Press 2 to back to Menu.");
        return Integer.parseInt(scanner.nextLine());
    }

    public void alertDeleteSongSuccess () {
        System.out.println("Song Delete Success!");
    }

    //4 sort Song by Name
    public void alertSortSongSuccess () {
        System.out.println("Song Sort Success!");
    }

    //5 search Song
    public String inputSongNameToSearch() {
        System.out.println("Enter Song Name that you want to SEARCH: ");
        return scanner.nextLine();
    }
    // 6 display All Song
    public void displayAllSong(){
        System.out.print("Total Song: ");
    }

    //7 manage User
    public int manageUser() {
        System.out.println("Press 1 to DISPLAY all User. Press 2 to BLOCK User. ");
        while (true) {
            try {
                int manageUser = Integer.parseInt(scanner.nextLine());
                if (manageUser == 1 || manageUser == 2) {
                    return manageUser;
                }
            } catch (NumberFormatException e) {
                System.err.println("Press 1 or 2.");
            }
        }
    }

    public String inputUserNameToBlock (){
        System.out.println("Enter userName to BLOCK: ");
        return scanner.nextLine();
    }

    public void alertAccountNotExist(){
        System.err.println("Account NOT Exist.");
        System.out.println("Press 1 to continue. Press 2 to Back to Menu.");
    }

    public void alertBlockUser(){
        System.out.println("User Block Success!");
    }

    public String backToMenu(){
        return scanner.nextLine();
    }
}

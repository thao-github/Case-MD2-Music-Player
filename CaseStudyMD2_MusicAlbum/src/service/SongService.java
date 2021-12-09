package service;

import io.Path;
import io.ReadAndWrite;
import model.Account;
import model.Song;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SongService {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    public static final String SONG_LIST_PATH = Path.PATH + "songList.txt";
    private final List<Song> songList = readAndWrite.readFile(SONG_LIST_PATH);

    AccountService accountService = new AccountService();


    public List<Song> findAll() {
        return songList;
    }

    //1 create song
    public void save(Song song) {
        songList.add(song);
        readAndWrite.writeFile(SONG_LIST_PATH, songList);
    }

    //2 edit Song name
    public void editSongByName(int index, String name) {
        songList.get(index).setName(name);
        readAndWrite.writeFile(SONG_LIST_PATH, songList);

    }

    //3 delete Song
    public void deleteSongByName(int index) {
        songList.remove(index);
        readAndWrite.writeFile(SONG_LIST_PATH, songList);
    }

    //4 sort Song by Name
    public void sortSongByName() {
        Collections.sort(songList, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    //5 search Song by Name
    public void searchSongByName(String name) {
        for (int i = 0; i < songList.size(); i++) {
            if (name.equals(songList.get(i).getName())) {
                System.out.println(songList.get(i));
            }
        }
    }

    //6 display All Song
    public void displayAllSong() {
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i).toString());
        }
    }

    public int findSongIndexByName(String name) {
        for (int i = 0; i < songList.size(); i++) {
            if (name.equals(songList.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public void countSongInLibrary() {
        System.out.println(songList.size());
    }

    //
    public boolean isSongExist(String name) {
        for (int i = 0; i < songList.size(); i++) {
            if (name.equals(songList.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

    //7 display user + delete user
    public void displayUser() {
        for (int i = 0; i < accountService.accountList.size(); i++){
            System.out.println(accountService.accountList.get(i));
        }
    }

    public void blockUser(String userName, int index) {
        for (int i = 0; i < accountService.accountList.size(); i++){
            if (userName.equals(accountService.accountList.get(i).getUserName())) {
                accountService.accountList.remove(index);
                readAndWrite.writeFile(AccountService.ACCOUNT_PATH, accountService.accountList);
            }
        }
    }

    public int findAccountIndexByName(String userName){
        for (int i = 0; i < accountService.accountList.size(); i++) {
            if (userName.equals(accountService.accountList.get(i).getUserName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isAccountExist(String userName) {
        for (int i = 0; i < accountService.accountList.size(); i++){
            if (userName.equals(accountService.accountList.get(i).getUserName())) {
                return true;
            }
        }
        return false;
    }
}

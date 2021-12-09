package controller;

import model.Playlist;
import model.Song;
import service.PlaylistService;
import view.PlaylistView;

import java.util.List;

public class PlaylistController {
    PlaylistService playlistService = new PlaylistService();
    PlaylistView playlistView = new PlaylistView();
    AccountController accountController = new AccountController();

    public void managerUser() {
        while (true) {
            int choice = playlistView.menuUser();
            switch (choice) {
                case 1: {  //create New Playlist
                    playlistService.save(playlistView.createNewPlaylist());
                    playlistView.alertPlaylistCreateSuccess();
                    break;
                }

                case 2: { //edit Playlist Name
                    while (true) {
                        String name = playlistView.inputPlaylistNameToEdit();
                        int index = playlistService.findPlaylistIndexByName(name);
                        boolean isPlaylistExist = playlistService.isPlaylistExist(name);

                        if (isPlaylistExist) {
                            while (true) {
                                String newName = playlistView.inputNewPlaylistName();
                                if (name.equals(newName)) {
                                    playlistView.alertNameEdit();
                                } else {
                                    playlistService.editPlaylistByName(index, newName);
                                    playlistView.alertPlaylistEditSuccess();
                                    break;
                                }
                            }
                            break;
                        } else {
                            playlistView.alertPlaylistNotExist();
                            String select = playlistView.backToMenu();
                            if (select.equals("2")) {
                                managerUser();
                                break;
                            }
                        }
                    }
                    break;
                }

                case 3: { //Delete Playlist
                    while (true) {
                        String name = playlistView.inputDeletePlaylistName();
                        boolean isPlaylistExist = playlistService.isPlaylistExist(name);
                        if (isPlaylistExist) {
                            int choose = playlistView.chooseToDeletePlaylist();
                            switch (choose) {
                                case 1: {
                                    playlistService.deletePlaylistByName(name);
                                    playlistService.displayAllPlaylist();
                                    break;
                                }
                                case 2: {
                                    playlistService.displayAllPlaylist();
                                    break;
                                }
                            }
                            break;
                        } else {
                            playlistView.alertPlaylistNotExist();
                            String select = playlistView.backToMenu();
                            if (select.equals("2")) {
                                managerUser();
                                break;
                            }
                        }
                    }
                    break;
                }

                case 4: {// add song to playlist
                    while (true) {
                        String songName = playlistView.inputSongNameToAdd();
                        String playlistName = playlistView.inputPlaylistNameToAddSong();
                        boolean isSongExist = playlistService.isSongExist(songName);
                        boolean isPlaylistExist = playlistService.isPlaylistExist(playlistName);
                        Song song = playlistService.findSongByName(songName);

                        if (isSongExist && isPlaylistExist) {
                            playlistService.addSongToPlaylist(playlistName, song);
                            break;
                        } else {
                            playlistView.alertSongNotExist();
                            int select = playlistView.selectToAddSong();
                            if (select == 2) {
                                managerUser();
                                break;
                            }
                        }
                    }
                    break;
                }

                case 5: {//delete song from playlist
                    while (true) {
                        String playlistName = playlistView.inputPlaylistNameToDeleteSong();
                        String songName = playlistView.inputSongNameToDelete();
                        boolean isSongExist = playlistService.isSongExist(songName);
                        boolean isPlaylistExist = playlistService.isPlaylistExist(playlistName);
                        if (isPlaylistExist && isSongExist) {
                            int index = playlistService.findSongIndexByName(playlistName, songName);
                            playlistService.deleteSongFromPlaylist(playlistName, index);
                            playlistView.alertDeleteSongFromPlaylistSuccess();
                            break;
                        } else {
                            playlistView.alertSongOrPlaylistNotExist();
                        }
                    }
                    break;
                }

                case 6: {// display Songs of a playlist
                    while (true) {
                        String playlistName = playlistView.inputPlaylistNameToDisplaySongList();
                        Playlist playlist = playlistService.findPlaylistByName(playlistName);
                        boolean isPlaylistExist = playlistService.isPlaylistExist(playlistName);
                        if (isPlaylistExist) {
                            playlistService.displaySongsOfAPlaylist(playlist);
                            break;
                        } else {
                            playlistView.alertPlaylistNotExist();
                            String select = playlistView.backToMenu();
                            if (select.equals("2")) {
                                managerUser();
                            }
                        }
                    }
                    break;
                }

                case 7: {
                    List<Playlist> playlistList = playlistService.findAll();
                    boolean isPlaylistListNull = playlistService.isPlaylistListNull(playlistList);
                    if (!isPlaylistListNull) {
                        playlistService.displayAllPlaylist();
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




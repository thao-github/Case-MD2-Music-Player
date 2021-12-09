package service;

import io.Path;
import io.ReadAndWrite;
import model.Playlist;
import model.Song;

import java.util.List;

public class PlaylistService {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    public static final String PLAYLIST_PATH = Path.PATH + "playlist.txt";
    private final List<Playlist> playlistList = readAndWrite.readFile(PLAYLIST_PATH);

    public static final String SONG_LIST_PATH = Path.PATH + "songList.txt";
    private final List<Song> songList = readAndWrite.readFile(SONG_LIST_PATH);

    public List<Playlist> findAll() {
        return playlistList;
    }

    //1 create New Playlist
    public void save(Playlist playlist) {
        playlistList.add(playlist);
        readAndWrite.writeFile(PLAYLIST_PATH, playlistList);
    }

    //2 edit Playlist Name
    public void editPlaylistByName(int index, String name) {
        playlistList.get(index).setName(name);
        readAndWrite.writeFile(PLAYLIST_PATH, playlistList);
    }

    //3 delete Playlist
    public void deletePlaylistByName(String name) {
        for (int i = 0; i < playlistList.size(); i++) {
            if (name.equals(playlistList.get(i).getName())) {
                playlistList.remove(findPlaylistIndexByName(name));
            }
        }
        readAndWrite.writeFile(PLAYLIST_PATH, playlistList);
    }

    //4 add song to Playlist
    public Song findSongByName(String name) {
        for (int i = 0; i < songList.size(); i++) {
        if (name.equals(songList.get(i).getName())) {
            return songList.get(i);
        }
    }
        return null;
    }

    public Playlist findPlaylistByName(String name) {
        for (int i = 0; i < playlistList.size(); i++) {
            if (name.equals(playlistList.get(i).getName())) {
                return playlistList.get(i);
            }
        }
        return null;
    }

    public void addSongToPlaylist(String name, Song song) {
        findPlaylistByName(name).getSongList().add(song);
        readAndWrite.writeFile(PLAYLIST_PATH, playlistList);
    }

    //5 delete song from Playlist
    public void deleteSongFromPlaylist(String playlistName, int index) {
        findPlaylistByName(playlistName).getSongList().remove(index);
        readAndWrite.writeFile(PLAYLIST_PATH, playlistList);
    }

    public int findSongIndexByName(String playlistName, String songName) {
        for (int i = 0; i < findPlaylistByName(playlistName).getSongList().size(); i++) {
            if (songName.equals(findPlaylistByName(playlistName).getSongList().get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    //6 Display songs of a Playlist
        public void displaySongsOfAPlaylist(Playlist playlist) {
            for (int i = 0; i < playlist.getSongList().size(); i++) {
                System.out.println(playlist.getSongList().get(i));
            }
        }


    //7 display
        public void displayAllPlaylist () {
            for (int i = 0; i < playlistList.size(); i++) {
                System.out.println(playlistList.get(i));
            }
        }


        // find Index of Playlist
    public int findPlaylistIndexByName(String name) {
        for (int i = 0; i < playlistList.size(); i++) {
            if (name.equals(playlistList.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
        //isPlaylistExist (3 edit + 4 delete)
    public boolean isPlaylistExist(String name){
        for (int i = 0; i < playlistList.size(); i++){
            if (name.equals(playlistList.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

    // isSongExist
    public boolean isSongExist(String name) {
        for (int i = 0; i < songList.size(); i++) {
            if (name.equals(songList.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

    //isPlaylistNull
    public boolean isPlaylistNull (Playlist playlist) {
        if (playlist.getSongList().size() == 0) {
            return true;
        }
        return false;
    }

    //isPlaylistListNull
    public boolean isPlaylistListNull (List<Playlist> playlistList) {
        if (playlistList.size() == 0) {
            return true;
        }
        return false;
    }

    }


package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Serializable {
    private String name;
    private List<Song> songList = new ArrayList<>();

    public Playlist(String name, String userName) {
        songList = new ArrayList<>();
    }

    public Playlist(String name) {
        this.name = name;
    }

    public Playlist(String name, List<Song> songList) {
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }


        @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songList=" + songList +
                '}';
    }

}

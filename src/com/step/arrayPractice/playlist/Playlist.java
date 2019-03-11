package com.step.arrayPractice.playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {

  public ArrayList<Album> albums = new ArrayList<Album>();
  public LinkedList<Song> songs = new LinkedList<Song>();
  public String name;
  public Song currentSong;
  public boolean isOn;

  public Playlist(String name) {
    this.name = name;
    this.isOn = true;
  }

  public void turnOff(){
    this.isOn = false;
  }

  public void addAlbum(Album album) {
    this.albums.add(album);
  }

  public String getName() {
    return name;
  }

  public void addSong(Song song) {
    this.songs.add(song);
  }

  public void setCurrentSong(Song currentSong) {
    this.currentSong = currentSong;
  }

  public void setCurrentSong() {
    this.currentSong = this.songs.get(0);
  }

  public Song getCurrentSong() {
    return currentSong;
  }

  public LinkedList<Song> getSongs() {
    return songs;
  }

  public void addSongsfromAlbum(){
    for (Album album : this.albums) {
      for (Song song : album.getSongs()) {
        this.addSong(song);
      }
    }
  }
}

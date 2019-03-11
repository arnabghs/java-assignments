package com.step.arrayPractice.playlist;

import java.util.LinkedList;

public class Album {
  public String name;
  public LinkedList<Song> songs = new LinkedList<>();

  public Album(String name) {
    this.name = name;
  }

  public void addSong(Song song){
    this.songs.add(song);
  }

  public LinkedList<Song> getSongs() {
    return songs;
  }
}

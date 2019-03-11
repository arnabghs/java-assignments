package com.step.arrayPractice.playlist;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Song song1 = new Song("Hallelujah", 6.00);
    Song song2 = new Song("Girls_like_you", 3.30);
    Song song3 = new Song("Shape_of_you", 4.30);
    Song song4 = new Song("November_rain", 8.00);

    Album album1 = new Album("classic");
    Album album2 = new Album("romantic");

    album1.addSong(song1);
    album1.addSong(song4);
    album2.addSong(song2);
    album2.addSong(song3);

    Playlist playlist1 = new Playlist("favourites");
    playlist1.addAlbum(album1);
    playlist1.addAlbum(album2);
    playlist1.addSongsfromAlbum();

    playlist1.setCurrentSong();

    while (playlist1.isOn) {
      startPlaying(playlist1);
    }
  }

  public static void startPlaying(Playlist playlist) {
    String playlistName = playlist.getName();
    String currentSong = playlist.getCurrentSong().getTitle();

    System.out.println(currentSong + " is playing now from " + playlistName + " playlist.");
    showOptions(playlist);
  }

  private static void showOptions(Playlist playlist) {
    System.out.println("1. Next Song: \n" +
            "2. Previous Song\n" +
            "3. Replay Song\n" +
            "4. All songs\n" +
            "5. Quit"
    );
    int option = scanner.nextInt();
    processInput(option, playlist);
  }

  private static void processInput(int option, Playlist playlist) {
    switch (option) {
      case 1:
        playNextSong();
        break;
      case 2:
        playPreviousSong();
        break;
      case 3:
        replay();
        break;
      case 4:
        showAllSongs(playlist);
        break;
      case 5:
        quit(playlist);
        break;
      default:
        System.out.println("Not a valid input.");
    }
  }

  private static void quit(Playlist playlist) { //done
    playlist.turnOff();
    System.out.println("Playing is stopped.");
  }

  private static void showAllSongs(Playlist playlist) { //done
    ListIterator<Song> iterator = playlist.getSongs().listIterator();
    int count = 1;

    while(iterator.hasNext()){
      System.out.println(count+". "+iterator.next().getTitle());
      count++;
    }
    System.out.println("<==========================>");
  }

  private static void replay() {
    System.out.println("replay");
  }

  private static void playPreviousSong() {
    System.out.println("prev");
  }

  private static void playNextSong() {
    System.out.println("next");
  }
}

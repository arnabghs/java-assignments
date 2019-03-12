package com.step.generics;

public class FootballTeam extends Team {
  public FootballTeam(String name, Integer matchesWon, Integer matchesLost, Integer matchesDrawn) {
    super(name, matchesWon, matchesLost, matchesDrawn);
  }

  @Override
  public int calculatePoints() {
    return matchesWon*1 - matchesLost*(-2);
  }
}
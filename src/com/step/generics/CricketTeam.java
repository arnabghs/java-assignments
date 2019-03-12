package com.step.generics;

public class CricketTeam extends Team {
  public CricketTeam(String name, Integer matchesWon, Integer matchesLost, Integer matchesDrawn) {
    super(name, matchesWon, matchesLost, matchesDrawn);
  }

  @Override
  public int calculatePoints() {
    return (matchesWon * 2) + matchesDrawn;
  }
}
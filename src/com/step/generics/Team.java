package com.step.generics;

public abstract class Team<T extends Team> {
  public String name;
  public Integer matchesWon;
  public Integer matchesLost;
  public Integer matchesDrawn;

  public Team(String name, Integer matchesWon, Integer matchesLost, Integer matchesDrawn) {
    this.name = name;
    this.matchesWon = matchesWon;
    this.matchesLost = matchesLost;
    this.matchesDrawn = matchesDrawn;
  }

  public abstract int calculatePoints();

  public <T extends Team> int compareWithOtherTeam(T o2) {
    int firstTeamPoints = this.calculatePoints();
    int secondTeamPoints = o2.calculatePoints();
    return firstTeamPoints - secondTeamPoints;
  }

  public String getName() {
    return name;
  }
}


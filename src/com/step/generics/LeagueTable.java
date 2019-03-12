package com.step.generics;

import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Team> {
  private List<T> teams;

  public LeagueTable(List<T> team) {
    this.teams = team;
  }

  public void addTeam(T team) {
    this.teams.add(team);
  }

  public void showLeaderBoard() {
    this.teams.sort(new Comparator<T>() {
      @Override
      public int compare(T o1, T o2) {
        return o2.compareWithOtherTeam(o1);
      }
    });
    for (T team : teams) {
      System.out.println(team.getName() + " is at " + team.calculatePoints() + " points");
    }
  }
}

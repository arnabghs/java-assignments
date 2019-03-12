package com.step.generics;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    CricketTeam india = new CricketTeam("India", 11, 5, 2);
    CricketTeam australia = new CricketTeam("Australia", 7, 5, 4);
    CricketTeam bangladesh = new CricketTeam("Bangladesh", 5, 3, 11);
    CricketTeam pakistan = new CricketTeam("Pakistan", 0, 10, 5);

    LeagueTable<CricketTeam> cricketTeamTable = new LeagueTable<>(Arrays.asList(india, australia, bangladesh,pakistan));
    cricketTeamTable.showLeaderBoard();

    System.out.println("-------------");

    FootballTeam germany = new FootballTeam("Germany", 5, 2, 3);
    FootballTeam spain = new FootballTeam("Spain", 2, 2, 0);
    FootballTeam italy = new FootballTeam("Italy", 3, 1, 1);


    LeagueTable<FootballTeam> footballTeamTable = new LeagueTable<>(Arrays.asList(germany,spain,italy));
    footballTeamTable.showLeaderBoard();
  }
}

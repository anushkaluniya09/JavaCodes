package com.Concrete.Concrete12;

class SportsTeam {
    private String teamName;
    private String coach;
    private int players;

    public SportsTeam(String teamName, String coach, int players) {
        this.teamName = teamName;
        this.coach = coach;
        this.players = players;
    }

    public void showTeam() {
        System.out.println(teamName + " coached by " + coach + " has " + players + " players");
    }
}

package main;

public class BasketballPlayer {
    private int jersey;
    private String name;
    private int points;
    private String team;

    public BasketballPlayer(int jersey, String name, int points, String team) {
        this.jersey = jersey;
        this.name = name;
        this.points = points;
        this.team = team;
    }

    public int getJersey() {
        return jersey;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getTeam() {
        return team;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

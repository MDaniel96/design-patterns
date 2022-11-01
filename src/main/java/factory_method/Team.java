package factory_method;

public abstract class Team {
    protected static final int incrementPoints = 5;

    protected int points = 0;

    public abstract void onHomeScore();

    public abstract void onAwayScore();

    public int getPoints() {
        return points;
    }
}

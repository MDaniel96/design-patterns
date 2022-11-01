package factory_method;

public class HomeTeam extends Team {
    @Override
    public void onHomeScore() {
        this.points += incrementPoints;
    }

    @Override
    public void onAwayScore() {
        this.points -= incrementPoints;
    }
}

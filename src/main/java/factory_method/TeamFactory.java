package factory_method;

public class TeamFactory {
    public static Team createTeam(TeamType teamType) {
        switch (teamType) {
            case HOME -> {
                return new HomeTeam();
            }
            case AWAY -> {
                return new AwayTeam();
            }
            default -> {
                return null;
            }
        }
    }
}

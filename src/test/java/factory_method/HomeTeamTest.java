package factory_method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTeamTest {
    HomeTeam team;

    @BeforeEach
    void setup() {
        team = new HomeTeam();
    }

    @Test
    void onHomeScore_Should_IncreasePointsWithIncrement() {
        var points = team.getPoints();

        team.onHomeScore();

        assertEquals(Team.incrementPoints, team.getPoints() - points);
    }

    @Test
    void onAwayScore_Should_DecreasePointsWithIncrement() {
        var points = team.getPoints();

        team.onAwayScore();

        assertEquals(Team.incrementPoints, points - team.getPoints());
    }
}
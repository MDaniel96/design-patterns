package factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TeamFactoryTest {

    @Test
    void createTeam_Should_ReturnHomeTeam() {
        var team = TeamFactory.createTeam(TeamType.HOME);

        assertTrue(team instanceof HomeTeam);
    }

    @Test
    void createTeam_Should_ReturnAwayTeam() {
        var team = TeamFactory.createTeam(TeamType.AWAY);

        assertTrue(team instanceof AwayTeam);
    }
}
package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DbSingletonTest {

    @Test
    void getInstance_Should_ReturnSameObject() {
        var instance = DbSingleton.getInstance();
        var otherInstance = DbSingleton.getInstance();

        assertSame(instance, otherInstance);
    }
}

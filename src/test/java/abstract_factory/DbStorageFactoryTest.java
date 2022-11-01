package abstract_factory;

import abstract_factory.storage.DbAndroidStorage;
import abstract_factory.storage.DbIosStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DbStorageFactoryTest {
    DbStorageFactory factory;

    @BeforeEach
    void setup() {
        factory = new DbStorageFactory();
    }

    @Test
    void getStorage_Should_ReturnIosStorageWhenOsTypeIsIos() {
        var storage = factory.getStorage(OsType.IOS);

        assertTrue(storage instanceof DbIosStorage);
    }

    @Test
    void getStorage_Should_ReturnAndroidStorageWhenOsTypeIsAndroid() {
        var storage = factory.getStorage(OsType.ANDROID);

        assertTrue(storage instanceof DbAndroidStorage);
    }
}
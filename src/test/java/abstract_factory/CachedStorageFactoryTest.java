package abstract_factory;

import abstract_factory.storage.CachedAndroidStorage;
import abstract_factory.storage.CachedIosStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CachedStorageFactoryTest {
    CachedStorageFactory factory;

    @BeforeEach
    void setup() {
        factory = new CachedStorageFactory();
    }

    @Test
    void getStorage_Should_ReturnIosStorageWhenOsTypeIsIos() {
        var storage = factory.getStorage(OsType.IOS);

        assertTrue(storage instanceof CachedIosStorage);
    }

    @Test
    void getStorage_Should_ReturnAndroidStorageWhenOsTypeIsAndroid() {
        var storage = factory.getStorage(OsType.ANDROID);

        assertTrue(storage instanceof CachedAndroidStorage);
    }
}
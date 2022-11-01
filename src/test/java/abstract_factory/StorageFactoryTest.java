package abstract_factory;

import abstract_factory.storage.DbIosStorage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageFactoryTest {

    @Test
    void getStorageFactory_Should_ReturnCachedFactoryWhenElapsedTimeIsSmall() {
        var elapsedTime = StorageFactory.CACHE_LIMIT_IN_MS - 1;

        var result = StorageFactory.getStorageFactory(elapsedTime);

        assertTrue(result instanceof CachedStorageFactory);
    }

    @Test
    void getStorageFactory_Should_ReturnDbFactoryWhenElapsedTimeIsGreat() {
        var elapsedTime = StorageFactory.CACHE_LIMIT_IN_MS + 1;

        var result = StorageFactory.getStorageFactory(elapsedTime);

        assertTrue(result instanceof DbStorageFactory);
    }

    @Test
    void factoryUsage_Should_ReturnDbIosStorageWhenElapsedTimeIsGreatAndOsIsIos() {
        var elapsedTime = StorageFactory.CACHE_LIMIT_IN_MS + 1;
        var os = OsType.IOS;

        var factory = StorageFactory.getStorageFactory(elapsedTime);
        var storage = factory.getStorage(os);
        storage.getContacts();

        assertTrue(storage instanceof DbIosStorage);
    }
}
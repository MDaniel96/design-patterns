package abstract_factory;

import abstract_factory.storage.Storage;

public abstract class StorageFactory {
    protected static int CACHE_LIMIT_IN_MS = 60_000;

    public static StorageFactory getStorageFactory(int elapsedTimeInMs) {
        if (elapsedTimeInMs < CACHE_LIMIT_IN_MS) {
            return new CachedStorageFactory();
        }
        return new DbStorageFactory();
    }

    public abstract Storage getStorage(OsType osType);
}

package abstract_factory;

import abstract_factory.storage.CachedAndroidStorage;
import abstract_factory.storage.CachedIosStorage;
import abstract_factory.storage.Storage;

public class CachedStorageFactory extends StorageFactory {
    @Override
    public Storage getStorage(OsType osType) {
        switch (osType) {
            case IOS -> {
                return new CachedIosStorage();
            }
            case ANDROID -> {
                return new CachedAndroidStorage();
            }
        }
        return null;
    }
}

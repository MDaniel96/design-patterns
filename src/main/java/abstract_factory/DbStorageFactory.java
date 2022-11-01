package abstract_factory;

import abstract_factory.storage.DbAndroidStorage;
import abstract_factory.storage.DbIosStorage;
import abstract_factory.storage.Storage;

public class DbStorageFactory extends StorageFactory {
    @Override
    public Storage getStorage(OsType osType) {
        switch (osType) {
            case IOS -> {
                return new DbIosStorage();
            }
            case ANDROID -> {
                return new DbAndroidStorage();
            }
        }
        return null;
    }
}

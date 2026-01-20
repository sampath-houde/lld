package cache.storage;

import cache.exception.NotFoundException;
import cache.exception.StorageFullException;

public interface CacheStorage<Key,Value> {

    void put(Key key, Value value) throws StorageFullException;
    Value get(Key key) throws NotFoundException;
    void remove(Key key) throws NotFoundException;

}

package cache.storage;


import cache.exception.NotFoundException;
import cache.exception.StorageFullException;

import java.util.HashMap;

public class HashMapBasedStorage<Key, Value> implements CacheStorage<Key, Value> {

    int capacity;
    HashMap<Key, Value> storage;

    public HashMapBasedStorage(int capacity) {
        this.capacity = capacity;
        this.storage = new HashMap<>();
    }

    @Override
    public void put(Key key, Value value) throws StorageFullException {
         if (isStorageFull()) throw new StorageFullException();
         storage.put(key, value);
    }

    @Override
    public Value get(Key key) throws NotFoundException {
        if (storage.containsKey(key)) return storage.get(key);
        else
            throw new NotFoundException("Key missing in the cache" + key);
    }

    @Override
    public void remove(Key key) throws NotFoundException {
        if(storage.containsKey(key)) storage.remove(key);
        else
            throw new NotFoundException("Key missing in the cache" + key);
    }

    private boolean isStorageFull() {
        return storage.size() == capacity;
    }
}


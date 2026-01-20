package cache;

import cache.exception.NotFoundException;
import cache.exception.StorageFullException;
import cache.policy.EvictionPolicy;
import cache.storage.CacheStorage;

public class Cache<Key, Value> {

    CacheStorage<Key, Value> storage;
    EvictionPolicy<Key> evictionPolicy;

    public Cache(CacheStorage<Key, Value> storage, EvictionPolicy<Key> evictionPolicy) {
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }

    public Value get(Key key) {
        try {
            Value value = storage.get(key);
            this.evictionPolicy.keyAccessed(key);
            return value;
        } catch (NotFoundException e) {
            System.out.println("Value not found");
            return null;
        }
    }

    public void put(Key key, Value value) {
        try {
            storage.put(key, value);
            this.evictionPolicy.keyAccessed(key);
        } catch (StorageFullException e) {
            System.out.println("Storage full");
            Key keyToBeEvicted = this.evictionPolicy.evict();
            if (keyToBeEvicted == null) {
                throw new RuntimeException("Unexpected State. Storage full and no key to evict.");
            }
            try {
                this.storage.remove(keyToBeEvicted);
            } catch (NotFoundException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Creating space by evicting item..." + keyToBeEvicted);
            put(key, value);
        }
    }
}

package cache;

import cache.policy.LRUEvictionPolicy;
import cache.storage.CacheStorage;
import cache.storage.HashMapBasedStorage;

public class Main {
    public static void main(String[] args) {
        CacheStorage<String, String> storage = new HashMapBasedStorage<>(5);
        Cache<String, String> cache = new Cache<>(storage, new LRUEvictionPolicy<>());

        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");
        cache.put("key4", "value4");
        cache.put("key5", "value5");
        cache.put("key6", "value6");
    }
}

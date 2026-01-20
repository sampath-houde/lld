package cache.policy;


import java.util.LinkedHashSet;
import java.util.Set;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {

    private final Set<Key> keys = new LinkedHashSet<>();

    @Override
    public void keyAccessed(Key key) {
        keys.remove(key);
        keys.add(key);
    }

    @Override
    public Key evict() {
        if (keys.isEmpty()) {
            return null;
        }
        Key lru = keys.iterator().next();
        keys.remove(lru);
        return lru;
    }
}

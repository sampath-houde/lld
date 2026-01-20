package cache.policy;

public interface EvictionPolicy<Key> {

    Key evict();
    void keyAccessed(Key key);
}

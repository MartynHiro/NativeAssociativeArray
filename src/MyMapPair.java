public class MyMapPair<K, V> { //класс, объекты которого хранят наши пары в списке
    protected K key;
    protected V value;

    public MyMapPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
    protected List<MyMapPair<K, V>> pairs = new ArrayList<>();

    public void put(K key, V value) {  //метод добавления значения
        for (MyMapPair<K, V> kv : pairs) {
            if (kv.getKey().equals(key)) {
                kv.setValue(value);
                return;   //закрываем цикл так как уже нашли нужное значение
            }
        }
        //если такого ключа не нашлось, то создаем новую пару и добавляем в список
        MyMapPair<K, V> newKv = new MyMapPair<>(key, value);
        pairs.add(newKv);
    }

    public V get(K key) {   //метод доставания значения по ключу
        for (MyMapPair<K, V> kv : pairs) {
            if (kv.getKey().equals(key)) {
                return kv.getValue();
            }
        }
        return null; //если не нашли такого ключа
    }
}

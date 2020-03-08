import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


//Реализована ариметичнская прогрессия
//если мы зададим несколько первоночальных чисел, то добавление в кэш будет только с того элемента
//, которого еще в мапе нет

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.arithmeticProgression(8);
        for (Map.Entry<Integer, Integer> pair : task6.cache.entrySet())
            System.out.println(task6.cache.get(pair.getKey()));

    }

    Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    public void arithmeticProgression(Integer key) {
        if (cache.isEmpty()) {
            cache.put(1, 1);
        }
        while (!cache.containsKey(key - 1)) {
            arithmeticProgression(key - 1);
        }
        cache.computeIfAbsent(key, value -> value + cache.get(key - 1));
    }
}

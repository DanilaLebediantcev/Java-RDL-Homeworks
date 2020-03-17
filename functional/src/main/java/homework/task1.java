package homework;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;


//Реализована ариметичнская прогрессия
//если мы зададим несколько первоночальных чисел, то добавление в кэш будет только с того элемента
//, которого еще в мапе нет

public class task1 {
    public static void main(String[] args) {
        task1 cacheObject = new task1();
        cacheObject.arithmeticProgression(8);
        for (Map.Entry<Integer, Integer> pair : cacheObject.cache.entrySet())
            System.out.println(cacheObject.cache.get(pair.getKey()));

    }

    Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    public void arithmeticProgression(Integer key) {
        if (!Optional.ofNullable(key).isPresent()) {
            System.out.println(key);
        } else {
            if (cache.isEmpty()) {
                cache.put(1, 1);
            }
            while (!cache.containsKey(key - 1)) {
                arithmeticProgression(key - 1);
            }

            cache.computeIfAbsent(key, value -> value + cache.get(key - 1));
        }
    }


}

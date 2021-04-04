package hexlet;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class DictionariesMerge {

    //BEGIN (write your solution here)
    public static Map<String, Set<Integer>> merged(Map ... dictionaries) {
        Set dictKeys = new HashSet();
        HashMap<String, Set<Integer>> result = new HashMap<>();

        for (Map dict : dictionaries) {
            for ( Object key : dict.keySet()) {
                if(!result.containsKey(key)) {
                    //result.put((String )key, (Set<Integer>) dict.get(key));
                    result.put((String )key, new HashSet<Integer>());
                }
            }
        }

       for(String id : result.keySet()) {
           Set values = new HashSet();
           for (Map dict : dictionaries) {
               for ( Object key : dict.keySet()) {
                   if(key.equals(id)) { // в result есть
                       values.add(dict.get(id));
                   }
               }
           }
           result.put(id, values);
        }

        return  result;
    }
    // Решение учителя. Важный момент, уточнение типа МАПЫ в сигнатуре метода
    // Не знакомое мне применение лямбда-выражений
    public static Map<String, Set<Integer>> merged1(Map<String, Integer>... dicts) {

        Map<String, Set<Integer>> aggregate = new HashMap<String, Set<Integer>>(Map.of());
        for (Map<String, Integer> item : dicts) {
            for (Map.Entry<String, Integer> entry : item.entrySet()) {
                aggregate.merge(entry.getKey(), Set.of(entry.getValue()),
                        (oldValue, newValue) -> {
                            Set<Integer> result = new HashSet<Integer>();
                            result.addAll(oldValue);
                            result.addAll(newValue);
                            return result;
                        });
            }
        }
        return aggregate;
    }

    //END
}
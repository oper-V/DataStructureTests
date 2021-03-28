package hexlet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;




public class MapsDiff {
    public static void main (String[] args) {

        HashMap<String, String> result = new HashMap<String, String>();
        HashMap<String, String> data1 = new HashMap<String, String>();
        HashMap<String, String> data2 = new HashMap<String, String>();

        data1.put("three", "eerht");
        data2.put("four", "ruof");

        System.out.println(data2.keySet().toString());
        HashSet<String> keySetResult = new HashSet<String>();
        keySetResult.clear();
        keySetResult.addAll(data2.keySet());
        keySetResult.addAll(data1.keySet());
        System.out.println(keySetResult);
        for (String i : keySetResult) {
        System.out.println(data1.get(i).equals(data2.get(i)));
        }



    }

    //BEGIN (write your solution here)

    public static HashMap<String, String> genDiff (HashMap<String, String> data1, HashMap<String, String> data2) {
        HashMap<String, String> result = new HashMap<String, String>();
        HashSet<String> keySetResult = new HashSet<>();
        keySetResult.addAll(data2.keySet());
        keySetResult.addAll(data1.keySet());
        /*
        if (data1.size() == 0 & data2.size() != 0) {
            for (String i : data2.keySet()) {
                result.put(i, "added");
            }
        }

        if (data2.size() == 0 & data1.size() != 0) {
            for (String i : data1.keySet()) {
                result.put(i, "deleted");
            }
        }
        */
        for (String i : keySetResult) {
            if (data1.containsKey(i) & data2.containsKey(i)) {
                if (data1.get(i).equals(data2.get(i))) {
                    result.put(i, "unchanged");
                } else {
                    result.put(i, "changed");
                }
            }

            if (data1.containsKey(i) & !data2.containsKey(i)) {
                result.put(i, "deleted");
            }

            if (data2.containsKey(i) & !data1.containsKey(i)) {
                result.put(i, "added");
            }
        }

        return result;
    }




    //END
}
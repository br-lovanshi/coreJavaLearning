package basic;

import java.util.*;

public class HashMaps {

    public static void main(String[] args) {
        Map<Integer, String> hasMap = new HashMap<>();

        // methods
        hasMap.put(1, "one");
        hasMap.get(1);
        hasMap.remove(11);
        hasMap.getOrDefault(11,"eleven");

        boolean containsKey =  hasMap.containsKey(1);
        boolean containsValue = hasMap.containsValue("two");
        int size =  hasMap.size();
        boolean isEmpty = hasMap.isEmpty();
        Set<Integer> keys = hasMap.keySet();
        Collection<String> values = hasMap.values();
        Set<Map.Entry<Integer, String>> entrySet = hasMap.entrySet();

        for(Map.Entry<Integer, String> map : hasMap.entrySet()){
            System.out.println(map.getKey() + "\n" + map.getValue());
        }

        System.out.println(entrySet);
    }
}

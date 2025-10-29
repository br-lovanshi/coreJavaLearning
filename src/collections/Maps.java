package collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "one");
        hashtable.put(3, "three");
        Collections values = (Collections) hashtable.values();
        Enumeration<Integer> keySet = hashtable.keys();
        for(Map.Entry<Integer, String> map:hashtable.entrySet() ){
            int key = map.getKey();
            String value = map.getValue();
        }
    }
}

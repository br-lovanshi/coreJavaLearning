package projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Notes {

    public static void main(String[] args) {
//        Integer x = null;
//        int y = 3;
//        System.out.println(x + " " + y);
        Map<String, Object> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", 2);
        System.out.println(map.containsKey("c") ? map.get("c") : null);

    }

}


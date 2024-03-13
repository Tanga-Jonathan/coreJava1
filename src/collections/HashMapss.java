package collections;

import java.util.*;

import java.util.Map.Entry;
public class HashMapss {
    public static void main(String[] args) {
        
        Map <String, Integer> map = new HashMap<>();

        map.put("x",10);
        map.put("y",15);
        map.put("z",50);

        System.out.println(map);
        System.out.println("The size of the map is: "+map.size());

        if(map.containsKey("z")){
            Integer a = map.get("z");
            System.out.println("Key z contains: "+a);
        }

        //another approach

        for(String key : map.keySet()){
            System.out.println("Key "+key+  " contains value: "+ map.get(key));
        }

        //another approach
        for(Entry<String, Integer> entryy : map.entrySet()){
            System.out.println("Key "+entryy.getKey()+" Values "+entryy.getValue());
        }

    }
}

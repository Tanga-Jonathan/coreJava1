package collections;

import java.util.*;

public class TreeMapss {
    public static void main(String[] args) {
        TreeMap <Integer, String> treemap = new TreeMap<Integer, String>();

        TreeMap <String, Integer> treema = new TreeMap<String, Integer>();

        treemap.put(3, "t");
        treemap.put(1, "2");
        treemap.put(2, "5");
        treemap.put(4, "d");

        treema.put("z", 4);
        treema.put("u", 7);
        treema.put("x", 4);
        treema.put("y", 2);

        System.out.println(treemap);

        System.out.println(treema);

    }
}

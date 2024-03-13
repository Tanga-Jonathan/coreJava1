package collections;

import java.util.*;

//this class doesn't order all its out from A-Z, 1-10 in order and
// supports no duplicate elements
public class sets {
    public static void main(String[] args) {
        
        Set <String> hashSet = new HashSet<>();

        hashSet.add("T");
        hashSet.add("a");
        hashSet.add("n");
        hashSet.add("g");
        hashSet.add("a");
        System.out.println(hashSet);

        System.out.println("It contains 't'? "+hashSet.contains("t"));
    }
}

package collections;

import java.util.*;
public class linkedListss {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList <String>();
        
        /*this can also work
      1.  List <String> list = new LinkedList <String>();
      2.  LinkedList <String> list = new LinkedList <>();
        */
       list.add("a");
       list.addFirst("K");
       list.add("m");
       list.add("a");
       list.add("J"); 
    //    does it accept duplicate values?
       list.add("J");

       list.addLast("e");
       list.add("o");
       System.out.println(list);
       list.remove(6);
       list.remove("J");
       System.out.println("I like using the name: " +list);

        System.out.println("Does it contain k?: "+list.contains("K"));
        for(int i=0;i <= list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}

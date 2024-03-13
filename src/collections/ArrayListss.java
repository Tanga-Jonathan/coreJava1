package collections;
import java.util.*;

public class ArrayListss {
    public static void main(String[] args) {
        
       List<Integer> arrayList = new ArrayList<>(5); 
    
        //<populate my arrayList
        for(int i=0;i<=5;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        //remove an item
        arrayList.remove(2);

        System.out.println(arrayList);

        for(int t=0; t<arrayList.size(); t++){
            System.out.print(arrayList.get(t)+" ");
        }

    }
    
}

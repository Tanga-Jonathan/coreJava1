import java.util.*;
import java.util.stream.Collectors;

public class Streamss {
    public static void main(String[] args) {
        List <Integer> nunmberList = new ArrayList <>();

        nunmberList.add(10);
        nunmberList.add(14);
        nunmberList.add(16);
        nunmberList.add(18);

    //     List <Integer> squareList = new ArrayList<>();
    //     for(Integer i : nunmberList){
    //         squareList.add(i*i);
    //     }
    //     System.out.println(squareList);

    // this is how streams work
    List <Integer> squareList = nunmberList.stream()
    .map(x -> x*x)//intermidiry methods
    .collect(Collectors.toList());//terminatory methods
    System.out.println(squareList);

    // Set <Integer> setss = new HashSet<>();
    //     for(Integer h : nunmberList){
    //         setss.add(50*h);
    //     }
    //     System.out.println(setss+" <--multipled these by 50");

    Set <Integer> setss = nunmberList.stream()
    .map(h->7765/h)
    .collect(Collectors.toSet());    
        System.out.println("This a stream execution that deals with division by 7765 "+setss);
    }
}

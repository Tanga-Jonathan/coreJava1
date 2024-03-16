package collections;

import java.util.*;

public class Stackss {
    public static void main(String[] args) {
        
        Stack <String> stack = new Stack<>();


        stack.push("Uganda");
        stack.push("Tanzania");
        stack.push("Kenya");

        System.out.println(stack);
        String poppy = stack.pop();
        System.out.println("I have popped: "+poppy);
        System.out.println(stack.peek());

    }
}

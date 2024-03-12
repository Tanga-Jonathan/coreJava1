public class nestedif {
    public static void main(String[] args) {
        int g = 50;
        if (g == 50){
            System.out.println("lessthan 60");
            if (g < 75){
                System.out.println("its less than 40");
                if(g < 55){
                    System.out.println("less than 80");
                }
            }
        }
    }
}

public class whileLoops {
    public static void main(String[] args) {
        int count = 0;

        while(count <= 10){
            System.out.print("Count is: "+count +" ");
            count++;
        }

        do{
            System.out.println("DoWhiileCount is: "+count);
            count++;
        }
        while(count <= 20);
        
    }
}

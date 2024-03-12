package arrayOperationss;

public class sum {
    public static void main(String[] args) {
        //write a java program to calculate the sum of elements in an array

        int [] stock = {3,5,3,6,2};

        int sums = 0;
        for (int i = 0; i<stock.length; i++)
        
        sums+=stock[i];
        System.out.println(sums);

        System.out.println("Average: " + sums/stock.length);

        int nums[] = new int[10]; 
       int min;
       int max;
        nums[0] = 99; 
        nums[1] = -10; 
        nums[2] = 100123; 
        nums[3] = 18; 
        nums[4] = -978; 
        nums[5] = 5623; 
        nums[6] = 463; 
        nums[7] = -9; 
        nums[8] = 287; 
        nums[9] = 49; 
        max = nums[0];
        min = nums[0]; 
        for(int i=1; i < 10; i++) {
             if(nums[i] < min) min = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}

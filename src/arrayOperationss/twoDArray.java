package arrayOperationss;

public class twoDArray {
    public static void main(String[] args) {
        int[][] b = {{2,4,3},{8,5,0},{1,6,3}};
        
        //the three brackets are 3 rows 
        System.out.println(b[2][1]);

        for(int g = 0; g<3;g++){
            for(int  k = 0;k<3;k++){
            System.out.print(b[g][k] + " ");
            }
            System.out.println();
        }
    }

}

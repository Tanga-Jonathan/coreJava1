public class nestedForloop {
    public static void main(String[] args) {
//Example 1        
        int[][] h = {{7,6,9},{7,6,2},{0,2,4}};

        for(int i = 0; i<3; i++){
            for(int g = 0; g<3; g++){
                System.out.print(h[i][g]+" ");
            }
            System.out.println();
        }
//example 2
        int[][] f = {{2,4,5,7,6,9},{7,6,9,7,6,9},{0,2,9,5,2,4}};

        for(int i = 0; i<6; i++){
            for(int g = 0; g<6; g++){
                System.out.print(f[i][g]+" ");
            }
            System.out.println();
        }
//Example 3 Not finished??
        int[][][] d = {{{2,4,5,7,6,9},{7,6,9,7,6,9}},{{0,2,9,5,2,4},{2,4,5,7,6,9}}};

        for(int i = 0; i<6; i++){
            for(int g = 0; g<6; g++){
                for(int l = 0; l<6; l++){
                    System.out.print(d[i][g][l]+" ");
                }
            }
            System.out.println();
        }

    }
}

public class threeDArray {
    public static void main(String[] args) {
        int [][][] b = { {{1,2,3,4}, {5,6,7}},  {{7,8,9,}, {10,3,4,5}} };

        //understand {brace1 {brace2{brace3}{brace3}} {brace2{brace3}{brace3}} } --> b[1][2][3]
        System.out.println(b[1][1][3]);

    }
}

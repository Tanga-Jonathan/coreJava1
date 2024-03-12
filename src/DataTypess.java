public class DataTypess {
    public static void main(String[] args) {

        char a = '7';
        byte b = 6;
        short c = 456;
        int d = 9834;
        long e = 23402375032L;
        double f = 2355.45;
        float g = 48389.435F;
        boolean h = true;

        String str = "test strings";
        String str1 = new String("testing strings");

        int[] arrayy = {5,4,6,3};


        System.out.println("char a: "+a);
        System.out.println("byte b: "+b);
        System.out.println("short c: "+c);
        System.out.println("int d: "+d);
        System.out.println("long e: "+e);
        System.out.println("double f: "+f);
        System.out.println("float g: "+g);
        System.out.println("boolean h: "+h);

        System.out.println("String line: "+str);
        System.out.println("String line: "+str1);
        System.out.println("arrays location: "+arrayy);
        System.out.println("arrays index: "+arrayy[2]);
    }
}

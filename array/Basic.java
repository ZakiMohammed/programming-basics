public class Basic {
    public static void main(String[] args) {
        
        int a[] = new int[5];

        a[0] = 300;     // a of zero is 300
        a[1] = 400;     // a of one is 400
        a[2] = 500;
        a[3] = 600;
        a[4] = 700;

        // a[5] = 800;  // Exception (Run time error)

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
    }
}
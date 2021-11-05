public class Declaration {
    public static void main(String[] args) {
        
        int a1[] = new int[3];              // this one
        int []a2 = new int[3];
        int[] a3 = new int[3];

        int a4[] = new int[] { 1, 2, 3, 4, 5 };
        int a5[] = { 10, 20, 30, 40 };      // this one (if you have data)

        int a6[];
        a6 = new int[3];

        a1[0] = 300;
        a2[0] = 400;
        a3[0] = 500;
        a4[0] = 600;
        a5[0] = 700;
        a6[0] = 800;

        System.out.println(a1[0]);
        System.out.println(a2[0]);
        System.out.println(a3[0]);
        System.out.println(a4[0]);
        System.out.println(a5[0]);
        System.out.println(a6[0]);
    }
}

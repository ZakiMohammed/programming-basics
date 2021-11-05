public class MatrixAddition {
    public static void main(String[] args) {

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("Enter matrix a");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Enter a [" + i + ", " + j  + "]: ");
                a[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        System.out.println("\nEnter matrix b");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Enter b [" + i + ", " + j  + "]: ");
                b[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        System.out.println("\nMatrix a");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix b");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // code for adding
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nMatrix c");
        for (int[] x : c) {
            for (int y : x) {
                System.out.println(y);
            }
        }

    }
}

/**
 * 1 2 3    -> x
 * 4 5 6    -> x
 * 7 8 9    -> x
 */
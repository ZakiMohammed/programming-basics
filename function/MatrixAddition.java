public class MatrixAddition {
    public static void main(String[] args) {

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];

        accept(a);
        accept(b);

        display(a, "\nMatrix a");
        display(b, "\nMatrix b");

        int[][] c = add(a, b);

        display(c, "\nMatrix c");
    }

    static void accept(int[][] a) {
        System.out.println("Enter matrix a");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Enter a [" + i + ", " + j  + "]: ");
                a[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
    }

    static void display(int[][] a, String message) {
        System.out.println(message);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }
}

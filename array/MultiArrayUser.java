public class MultiArrayUser {
    public static void main(String[] args) {
        
        int a[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Enter num [" + i + ", " + j  + "]: ");
                a[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
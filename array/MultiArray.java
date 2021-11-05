public class MultiArray {
    public static void main(String[] args) {
        
        int a1[][] = new int[3][3];
        int [][]a2 = new int[3][3];
        int[][] a3 = new int[3][3];

        int a4[][] = new int[][] { 
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
        };

        int a6[][];
        a6 = new int[3][3];

        a1[0][0] = 100;
        a1[0][1] = 200;
        a1[0][2] = 300;
        a1[1][0] = 400;
        a1[1][1] = 500;
        a1[1][2] = 600;
        a1[2][0] = 700;
        a1[2][1] = 800;
        a1[2][2] = 900;

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/**
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * 0,0      0,1     0,2
 * 1,0      1,1     1,2
 * 2,0      2,1     2,2
 */
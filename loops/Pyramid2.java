public class Pyramid2 {
    public static void main(String[] args) {

        int rows;

        System.out.print("Enter rows: ");
        rows = Integer.parseInt(System.console().readLine());
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j < rows - (i + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}

/*
    * 0 + 1 = 1 -> 5 - 1 = 4
   ** 1 + 1 = 2 -> 5 - 2 = 3
  *** 2 + 1 = 3 -> 5 - 3 = 2
 **** 3 + 1 = 4 -> 5 - 4 = 1
***** 4 + 1 = 5 -> 5 - 5 = 0
*/
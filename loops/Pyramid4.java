public class Pyramid4 {
    public static void main(String[] args) {

        int rows;

        System.out.print("Enter rows: ");
        rows = Integer.parseInt(System.console().readLine());

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(rows - (i + 1));
            }
            System.out.println();
        }
    }
}

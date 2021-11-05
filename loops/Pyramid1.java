public class Pyramid1 {
    public static void main(String[] args) {

        int rows;

        System.out.print("Enter rows: ");
        rows = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

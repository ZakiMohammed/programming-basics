public class UserInput2 {
    public static void main(String[] args) {

        int limit = 0;

        System.out.print("Enter limit of the array: ");
        limit = Integer.parseInt(System.console().readLine());

        int a[] = new int[limit];   // user input dependent

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

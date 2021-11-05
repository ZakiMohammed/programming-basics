public class AddWithMethod {
    public static void main(String[] args) {
        
        String exit;

        do {
            add();

            System.out.print("\nDo you want to exit (y/n): ");
            exit = System.console().readLine();

        } while (!exit.equalsIgnoreCase("y"));

        System.out.println("Bye");
    }

    static void add() {
        int num1, num2;

        System.out.print("\nEnter number 1: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter number 2: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println("Result: " + (num1 + num2));
    }
}
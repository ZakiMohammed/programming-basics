public class CalculatorWithMethod {
    public static void main(String[] args) {

        String exit;

        do {
            calculator();

            System.out.print("\nDo you want to exit (y/n): ");
            exit = System.console().readLine();

        } while (!exit.equalsIgnoreCase("y"));

        System.out.println("Bye");
    }

    static void calculator() {
        double num1 = 0, num2 = 0;
        int choice;

        System.out.println();
        System.out.println("-------------------");
        System.out.println("Calculator");
        System.out.println("-------------------");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice: ");
        choice = Integer.parseInt(System.console().readLine());

        if (choice > 0 && choice < 5) {
            System.out.print("\nEnter number 1: ");
            num1 = Double.parseDouble(System.console().readLine());

            System.out.print("Enter number 2: ");
            num2 = Double.parseDouble(System.console().readLine());
        }

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}

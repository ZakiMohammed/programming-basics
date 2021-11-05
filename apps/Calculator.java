public class Calculator {
    public static void main(String[] args) {

        int choice, num1 = 0, num2 = 0;
        boolean exit = false;

        do {
            System.out.println();
            System.out.println("-------------------");
            System.out.println("Calculator");
            System.out.println("-------------------");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = Integer.parseInt(System.console().readLine());

            if (choice > 0 && choice < 5) {
                System.out.print("\nEnter number 1: ");
                num1 = Integer.parseInt(System.console().readLine());

                System.out.print("Enter number 2: ");
                num2 = Integer.parseInt(System.console().readLine());
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
                case 5:
                    System.out.println("Bye");
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (exit == false);
    }
}

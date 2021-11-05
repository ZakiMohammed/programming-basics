public class Add {
    public static void main(String[] args) {
        
        int num1, num2, exit;

        do {
            
            System.out.print("\nEnter number 1: ");
            num1 = Integer.parseInt(System.console().readLine());

            System.out.print("Enter number 2: ");
            num2 = Integer.parseInt(System.console().readLine());

            System.out.println("Result: " + (num1 + num2));

            System.out.print("\nDo you want to exit (0/1): ");
            exit = Integer.parseInt(System.console().readLine());

        } while (exit != 1);

        System.out.println("Bye");
    }
}
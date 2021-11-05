public class BankAccount {
    public static void main(String[] args) {
        String exit;
        double balance = 1000;

        do {
            int choice;

            System.out.println();
            System.out.println("-------------------");
            System.out.println("Bank Account");
            System.out.println("-------------------");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Balance");

            System.out.print("Enter choice: ");
            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    balance = withdraw(balance);
                    showBalance(balance);
                    break;
                case 2:
                    balance = deposit(balance);
                    showBalance(balance);
                    break;
                case 3:
                    showBalance(balance);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

            System.out.print("\nDo you want to exit (y/n): ");
            exit = System.console().readLine();

        } while (!exit.equalsIgnoreCase("y"));

        System.out.println("Bye");
    }

    static void showBalance(double balance) {
        System.out.println("\nBalance: " + balance);
    }

    static double withdraw(double balance) {

        double amount;

        System.out.print("\nEnter amount to withdraw: ");
        amount = Double.parseDouble(System.console().readLine());

        if (balance < amount) {
            System.out.println("\nInsufficient Balance");
        } else {
            balance = balance - amount;
        }

        return balance;
    }

    static double deposit(double balance) {

        double amount;

        System.out.print("\nEnter amount to deposit: ");
        amount = Double.parseDouble(System.console().readLine());

        balance = balance + amount;

        return balance;
    }
}

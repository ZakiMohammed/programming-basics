// Print number is divisible by 5 but not by 3, accept number from user.

public class Question1 {
    public static void main(String[] args) {
        int num;

        System.out.print("Enter number: ");
        num = Integer.parseInt(System.console().readLine());

        if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}
public class IfElseLadder {
    public static void main(String[] args) {
        
        int num1, num2;

        System.out.print("Enter number 1: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter number 2: ");
        num2 = Integer.parseInt(System.console().readLine());

        if (num1 > num2) {
            System.out.print("Number 1 is greatest");
        } else if (num2 > num1) {
            System.out.print("Number 2 is greatest");
        } else {
            System.out.print("Both are equal");
        }
    }
}

/**
 * if (condition1) {
 * } else if (condition2) {
 * } else if (condition3) {
 * } else if (condition4) {
 * } else {
 * }
 */
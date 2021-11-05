public class IfElseCondition {
    public static void main(String[] args) {
        
        int num;

        System.out.print("Enter number: ");
        num = Integer.parseInt(System.console().readLine());

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

/**
 * if (condition) {
 *      your if code logic
 * } else {
 *      your else code logic
 * }
 */
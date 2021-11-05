public class IfCondition {

    public static void main(String[] args) {
        
        int num;

        System.out.print("Enter number: ");
        num = Integer.parseInt(System.console().readLine());

        if (num % 2 == 0) {
            System.out.println("Number is even");
        }
    }
}

/**
 * if (condition) {
 *      your code logic
 * }
 */
public class IfElseNested {
    public static void main(String[] args) {
        int num;

        System.out.print("Enter number: ");
        num = Integer.parseInt(System.console().readLine());

        if (num % 2 == 0) {
            if (num % 4 == 0) {
                System.out.println("Number is even and divisible by 4");
            } else {
                System.out.println("Number is even and not divisible by 4");
            }
        } else {
            if (num > 0) {
                System.out.println("Number is odd and positive");
            } else {
                System.out.println("Number is odd and negative");
            }
        }
    }
}

// if number is even then check if divisible by 4 or not
// if number is odd then check if number is +ve or -ve
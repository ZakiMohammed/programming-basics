public class IfElseLadder2 {
    public static void main(String[] args) {
        
        int num1, num2, num3;

        System.out.print("Enter number 1: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter number 2: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter number 3: ");
        num3 = Integer.parseInt(System.console().readLine());

        if (num1 > num2 && num1 > num3) {
            System.out.print("Number 1 is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("Number 2 is greatest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.print("Number 3 is greatest");
        } else {
            System.out.print("All are equal");
        }
    }
}
public class FibonacciSeries {
    public static void main(String[] args) {
        
        int num1 = 0, num2 = 1, num3 = 0;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        
        for (int i = 2; i < 8; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");

            num1 = num2;
            num2 = num3;
        }
    }
}

/**
 * F5: Continue
 * F10: Step Over (goes to next line)
 * F11: Step Into (goes inside a function)
 * Shift + F11: Step Out (get you out from a function)
 */
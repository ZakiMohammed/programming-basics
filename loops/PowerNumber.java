public class PowerNumber {
    public static void main(String[] args) {
        
        int num, power, result = 1;

        System.out.print("Enter num: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.print("Enter power: ");
        power = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= power ; i++) {
            result *= num;  // result = result * num;
        }

        System.out.println("Result: " + result);
    }
}

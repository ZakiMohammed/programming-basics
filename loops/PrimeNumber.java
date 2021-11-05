public class PrimeNumber {
    public static void main(String[] args) {

        int num;
        boolean isPrime = true;

        System.out.print("Enter number: ");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

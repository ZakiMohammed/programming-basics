public class Factorial {
    public static void main(String[] args) {
        
        int num, fact = 1;

        System.out.print("Enter number: ");
        num = Integer.parseInt(System.console().readLine());

        for (int i = num; i >= 1; i--) {
            fact *= i;  // fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
    }
}

// 5! = 5 x 4 x 3 x 2 x 1
// 4! = 4 x 3 x 2 x 1
// 1! = 1
// 0! = 1

// a += 1
// a -= 1
// a *= 1
// a /= 1
// a %= 1

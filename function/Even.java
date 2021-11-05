public class Even {
    public static void main(String[] args) {
        
        int num;

        System.out.print("Enter num: ");
        num = Integer.parseInt(System.console().readLine());

        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

// input: num (int)
// output: true/false (boolean)
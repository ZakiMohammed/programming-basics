public class SumOfNumbers {
    public static void main(String[] args) {
        
        int start, end, result = 0;

        System.out.print("Enter start: ");
        start = Integer.parseInt(System.console().readLine());

        System.out.print("Enter end: ");
        end = Integer.parseInt(System.console().readLine());

        for (int i = start; i <= end; i++) {
            result = result + i;
        }

        System.out.println(result);
    }
}

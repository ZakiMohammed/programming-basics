public class Table {
    public static void main(String[] args) {
        
        int num, limit;

        System.out.print("Enter number: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.print("Enter limit: ");
        limit = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= limit; i++) {
            System.out.println(num * i);
        }
    }
}

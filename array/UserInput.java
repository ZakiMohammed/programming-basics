public class UserInput {
    public static void main(String[] args) {
        
        int a[] = new int[3];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // a.length -> use this to get the length of the array any time
    }
}

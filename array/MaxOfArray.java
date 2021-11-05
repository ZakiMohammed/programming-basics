public class MaxOfArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int max = 0, min = 999999;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

        for (int num : a) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
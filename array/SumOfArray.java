public class SumOfArray {
    public static void main(String[] args) {
        
        int a[] = new int[5];
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < a.length; i++) {
            total = total + a[i];

            // for index location use: i
            // for value use: a[i]
        }

        // for (int num : a) {
        //     total = total + num;
        // }

        System.out.println("Total = " + total);
    }
}

// Find sum of integer array
// 0    1   2   3   4
// 10   20  30  40  50 = 150
// total = total + a[i] = 0 + 1 = 1
// total = total + a[i] = 1 + 2 = 3
// total = total + a[i] = 3 + 3 = 6
// total = total + a[i] = 6 + 4 = 10
// total = total + a[i] = 10 + 5 = 15
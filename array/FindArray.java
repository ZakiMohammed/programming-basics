public class FindArray {
    public static void main(String[] args) {

        int a[] = new int[5];
        int search = 0;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.print("Enter number to search: ");
        search = Integer.parseInt(System.console().readLine());

        for (int num : a) {
            if (num == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

// find number in an array
// 0 1 2 3 4
// 1 2 3 4 5
// num: 3
// Found
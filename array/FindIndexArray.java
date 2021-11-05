public class FindIndexArray {
    public static void main(String[] args) {

        int a[] = new int[5];
        int search = 0, foundIndex = -1;    // -1 is to denote that number is not present

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.print("Enter number to search: ");
        search = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex > -1) {
            System.out.println("Found at index " + foundIndex);
        } else {
            System.out.println("Not Found");
        }
    }
}

// find number in an array also the index location
// 0 1 2 3 4
// 1 2 3 4 5
// num: 1
// Found at index 0
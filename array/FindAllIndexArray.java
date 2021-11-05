public class FindAllIndexArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int foundIndexes[];
        int search = 0, foundCount = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.print("Enter number to search: ");
        search = Integer.parseInt(System.console().readLine());

        for (int num : a) {
            if (num == search) {
                foundCount++;
            }
        }

        if (foundCount != 0) {
            foundIndexes = new int[foundCount];
            for (int i = 0, j = 0; i < a.length; i++) {
                if (a[i] == search) {
                    foundIndexes[j++] = i;
                }
            }

            System.out.print("Found at indexes ");
            for (int index : foundIndexes) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("Not Found");
        }
    }
}

// find index location of all occurences of a number
// 0 1 2 3 4
// 1 3 3 3 5
// num: 3
// Found at indexes 1, 2, 3
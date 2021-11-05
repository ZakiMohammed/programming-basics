public class FindArray {
    public static void main(String[] args) {

        int a[] = new int[5];
        int search = 0;
        
        accept(a);
        
        System.out.print("Enter number to search: ");
        search = Integer.parseInt(System.console().readLine());

        if (find(a, search)) {
            System.out.println("Found at " + findIndex(a, search) + " index");
        } else {
            System.out.println("Not Found");
        }
    }

    static void accept(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            a[i] = Integer.parseInt(System.console().readLine());
        }

    }

    static boolean find(int[] a, int search) {
        int index = findIndex(a, search);
        return index != -1;
    }

    static int findIndex(int[] a, int search) {
        int foundIndex = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                foundIndex = i;
                break;
            }
        }

        return foundIndex;
    }
}

// input: array (int), search (int)
// output: boolean
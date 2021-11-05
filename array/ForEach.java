public class ForEach {
    public static void main(String[] args) {
        int array[] = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            array[i] = Integer.parseInt(System.console().readLine());
        }

        for (int num : array) {
            System.out.println(num);
        }
    }
}

/**
 * for (dataType variableName: arrayName) {
 * }
 */
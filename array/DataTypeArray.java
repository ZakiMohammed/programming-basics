public class DataTypeArray {
    public static void main(String[] args) {
        
        String names[] = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = System.console().readLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        boolean b[] = new boolean[3];

        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter bool " + (i + 1) + ": ");
            b[i] = Boolean.parseBoolean(System.console().readLine());
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

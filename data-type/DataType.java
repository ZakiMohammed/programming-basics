public class DataType {
    public static void main(String[] args) {
        // type safe language

        // numeric
        short a = 39;
        int b = 2873683;
        long c = 897897;

        System.out.println("Numeric");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // numeric: decimal
        float d = 39.3983f;
        double e = 3.48768746746784;

        System.out.println("\nNumeric: Decimal");
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // boolean
        boolean f = true;
        boolean g = false;

        System.out.println("\nBoolean");
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        // character
        char h = 'F';
        char i = 'o';

        System.out.println("\nCharacter");
        System.out.println("h = " + h);
        System.out.println("i = " + i);

        // string
        String name = "John" + " " + "Doe";
        String gender = "Male";

        System.out.println("\nString");
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
    }
}

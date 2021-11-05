public class Conversion {
    public static void main(String[] args) {

        // type casting
        
        // implicit conversion

        int a = 33;     // 33
        float b = a;    // 33.0

        System.out.println("Implicit Conversion");
        System.out.println(a);
        System.out.println(b);

        // explicit conversion

        float c = 22.5F;        // 22.5
        int d = (int)c;         // 22

        System.out.println("\nExplicit Conversion");
        System.out.println(c);
        System.out.println(d);

        // numeric to string

        int e = 100;
        // String f = Integer.toString(e);
        // String f = String.valueOf(e);
        String f = e + ""; 

        System.out.println("\nNumeric-String Conversion");
        System.out.println(e);
        System.out.println(f);

        // string to numeric
        String g = "200";
        int h = Integer.parseInt(g);

        System.out.println("\nString-Numeric Conversion");
        System.out.println(g);
        System.out.println(h);
    }
}
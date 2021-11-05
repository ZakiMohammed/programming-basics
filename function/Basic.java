public class Basic {
    public static void main(String[] args) {

        greet1();

        greet2("John", "Doe");

        String message1 = greet3();
        System.out.println(message1);

        String message2 = greet4("John", "Doe");
        System.out.println(message2);
    }

    static void greet1() {
        System.out.println("Hello World");
    }

    static void greet2(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static String greet3() {
        return "Hello World";
    }

    static String greet4(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
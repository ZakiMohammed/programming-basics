public class Helper {
    static void println(String message) {
        System.out.println(message);
    }

    static void print(String message) {
        System.out.print(message);
    }

    static String read() {
        return System.console().readLine();
    }

    static int readInt() {
        return Integer.parseInt(read());
    }
}

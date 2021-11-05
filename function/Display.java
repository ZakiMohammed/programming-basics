public class Display {
    public static void main(String[] args) {
        
        int num1, num2;

        Helper.print("Enter num 1: ");
        num1 = Helper.readInt();

        Helper.print("Enter num 2: ");
        num2 = Helper.readInt();

        Helper.println("Result: " + (num1 + num2));
    }
}

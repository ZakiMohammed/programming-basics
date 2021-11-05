public class Rectangle {
    public static void main(String[] args) {
        float length, width, result;
        
        System.out.print("Enter length: ");
        length = Float.parseFloat(System.console().readLine());

        System.out.print("Enter width: ");
        width = Float.parseFloat(System.console().readLine());

        result = length * width;

        System.out.println("Result: " + result);
    }
}

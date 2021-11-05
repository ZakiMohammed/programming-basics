public class Question2 {
    public static void main(String[] args) {

        int year;

        System.out.print("Enter year: ");
        year = Integer.parseInt(System.console().readLine());

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");   
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }
    }
}

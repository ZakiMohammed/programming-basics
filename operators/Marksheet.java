public class Marksheet {
    public static void main(String[] args) {
        
        int subject1, subject2, subject3, subject4, total;
        float percentage;
        
        System.out.print("Enter subject 1: ");
        subject1 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter subject 2: ");
        subject2 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter subject 3: ");
        subject3 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter subject 4: ");
        subject4 = Integer.parseInt(System.console().readLine());

        total = subject1 + subject2 + subject3 + subject4;
        percentage = (total / 400F) * 100;

        System.out.println("Total: " + total + "/400");
        System.out.println("Percentage: " + percentage);
    }
}

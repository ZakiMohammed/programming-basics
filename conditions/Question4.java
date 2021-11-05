public class Question4 {
    public static void main(String[] args) {
        
        int age;

        System.out.print("Enter age: ");
        age = Integer.parseInt(System.console().readLine());

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age >= 0 && age <= 14) {
            System.out.println("Childhood");
        } else if (age >= 15 && age <= 24) {
            System.out.println("Youth");
        } else if (age >= 25 && age <= 64) {
            System.out.println("Adulthood");
        } else {
            System.out.println("Seniority");
        }
    }
}

/**
1. Childhood (0 - 14)
2. Youth (15 - 24)
3. Adulthood (25 - 64)
4. Seniority (65 and above)
 */
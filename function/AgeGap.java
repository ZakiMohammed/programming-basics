public class AgeGap {
    public static void main(String[] args) {
        int age;

        System.out.print("Enter age: ");
        age = Integer.parseInt(System.console().readLine());

        System.out.println(getAgeGap(age));
    }

    static String getAgeGap(int age) {
        if (age < 0) {
            return "Invalid Age";
        } else if (age >= 0 && age <= 14) {
            return "Childhood";
        } else if (age >= 15 && age <= 24) {
            return "Youth";
        } else if (age >= 25 && age <= 64) {
            return "Adulthood";
        } else {
            return "Seniority";
        }
    }
}

// input -> age (int)
// output -> gap (string)
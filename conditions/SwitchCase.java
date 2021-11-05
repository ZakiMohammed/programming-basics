public class SwitchCase {
    public static void main(String[] args) {

        char grade;

        System.out.print("Enter grades: ");
        grade = System.console().readLine().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent Performance");
                break;
            case 'B':
                System.out.println("Good Performance");
                break;
            case 'C':
                System.out.println("Average Performance");
                break;
            case 'D':
                System.out.println("Bad Performance");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }
    }
}

/**
 * switch(choice) {
 *      case 1:
 *          break;
 *      case 2:
 *          break;
 *      ...
 *      case N:
 *          break;
 *      default:
 *          break;
 * }
 */

/*
if (grade == 'A') {
    System.out.println("Excellent Performance");
} else if (grade == 'B') {
    System.out.println("Good Performance");
} else if (grade == 'C') {
    System.out.println("Average Performance");
} else {
    System.out.println("Bad Performance");
}
*/
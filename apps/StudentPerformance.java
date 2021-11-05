import java.util.Arrays;

public class StudentPerformance {
    public static void main(String[] args) {
        String exit;
        double marks[] = new double[10];

        do {
            int choice;

            System.out.println();
            System.out.println("-------------------");
            System.out.println("Student Performance");
            System.out.println("-------------------");
            System.out.println("1. Add Marks");
            System.out.println("2. Show Marks");
            System.out.println("3. Total");
            System.out.println("4. Percentage");
            System.out.println("5. Maximum Marks");
            System.out.println("6. Minimum Marks");

            System.out.print("Enter choice: ");
            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    marks = add();
                    break;
                case 2:
                    System.out.println("Marks: " + Arrays.toString(marks));
                    break;
                case 3:
                    System.out.println("Total: " + getTotal(marks) + "/" + (marks.length * 100));
                    break;
                case 4:
                    System.out.println("Percentage: " + getPercentage(marks) + "%");
                    break;
                case 5:
                    System.out.println("Maximum: " + getMaximum(marks));
                    break;
                case 6:
                    System.out.println("Minimum: " + getMinimum(marks));
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

            System.out.print("\nDo you want to exit (y/n): ");
            exit = System.console().readLine();

        } while (!exit.equalsIgnoreCase("y"));

        System.out.println("Bye");
    }

    static double[] add() {
        int numberOfSubject;

        System.out.print("\nEnter number of subjects: ");
        numberOfSubject = Integer.parseInt(System.console().readLine());

        double marks[] = new double[numberOfSubject];

        accept(marks);

        return marks;
    }

    static void accept(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            a[i] = Double.parseDouble(System.console().readLine());
        }
    }

    static void show(double[] a) {
        System.out.print("Marks: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static double getTotal(double[] a) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total = total + a[i];
        }
        return total;
    }

    static double getPercentage(double[] a) {
        int numberOfSubject = a.length;
        double obtained = getTotal(a);
        double total = numberOfSubject * 100;

        double percentage = (obtained / total) * 100;

        return percentage;
        // return (getTotal(a) / (a.length * 100)) * 100;
    }

    static double getMinimum(double[] a) {
        double min = 999999;
        for (double num : a) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    static double getMaximum(double[] a) {
        double max = 0;
        for (double num : a) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
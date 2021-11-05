public class UserInput {
    public static void main(String[] args) {
        
        String name;
        int age;
        double pointers;
        char gender;

        System.out.print("Enter name: ");
        name = System.console().readLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(System.console().readLine());

        System.out.print("Enter gender: ");
        gender = System.console().readLine().toCharArray()[0];

        System.out.print("Enter pointers: ");
        pointers = Double.parseDouble(System.console().readLine());

        System.out.println("Hello " + name + " " + age + " " + gender + " " + pointers);
    }
}

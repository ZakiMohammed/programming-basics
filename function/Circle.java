public class Circle {
    public static void main(String[] args) {
        double radius, angle;

        System.out.print("Enter radius: ");
        radius = Double.parseDouble(System.console().readLine());

        System.out.print("Enter angle: ");
        angle = Double.parseDouble(System.console().readLine());

        System.out.println();
        System.out.println("Diameter: " + diameter(radius));
        System.out.println("Area: " + area(radius));
        System.out.println("Circumference: " + circumference(radius));
        System.out.println("Area of sector: " + areaOfSector(radius, angle));
        System.out.println("Length of arc: " + lengthOfArc(radius, angle));
    }

    static double diameter(double radius) {
        return radius * 2;
    }

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double areaOfSector(double radius, double angle) {
        return (angle / 360) * area(radius);
    }

    static double lengthOfArc(double radius, double angle) {
        return (angle / 360) * circumference(radius);
    }
}

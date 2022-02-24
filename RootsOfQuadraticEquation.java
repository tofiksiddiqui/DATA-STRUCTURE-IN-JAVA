
public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        double a = 4;
        double b = 8;
        double c = 1;
        double d = (b * b - 4 * a * c);
        double root1;
        double root2;

        if (d >= 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.format("Root1 = %.2f and Root2 is = %.2f", root1, root2);
            System.out.println("\n\n");
        } else {
            double real = (-b) / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.format("Root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("Root2 = %.2f-%.2fi", real, imaginary);

        }
        System.out.println("\n\n");
    }

}

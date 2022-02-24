
/**
 * !Overloading : Method overloading increases the readability of the program. Overloaded methods give programmers the flexibility to call a similar method for different types of data. Overloading is also used on constructors to create new objects given different amounts of data
 * * Mthod name and return type should be same
 * *there should be different type of argument
 * *or there should be different sequence in parameter.
 * *It is also uses the concept of inheritance.
 */

import java.util.*;

class Math {
    public void display(int a, int b) {
        System.out.println("Addition is : " + (a + b));
    }

    public void display(int b, float c) {
        System.out.println("Addition is : " + (b + c));
    }

    public void display() {
        System.out.println("No Parameter");
    }

    public void add(int b, int a) {
        System.out.println("Addtion is : " + (a + b));
    }

    public void display(float a, int b, double c) {
        System.out.println("Addition is : " + (a + b + c));
    }
}

public class Overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.print("Enter Integer number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter one double number : ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter one float number : ");
        float num4 = scanner.nextFloat();
        System.out.println("-------------------------------------------------");
        Math mt = new Math();
        mt.display(num1, num2);
        mt.display(num1, num4);
        mt.display();
        mt.display(num2, num1);
        mt.display(num4, num1, num3);
        System.out.println("-------------------------------------------------");

    }

}

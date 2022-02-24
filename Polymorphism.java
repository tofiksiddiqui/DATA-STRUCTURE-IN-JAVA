
/**
 * !Polymorphism :- A single entity can represent multiple behavior.
 ** It have two types :
 *? 1.Overloading(static/compile time polymorphism).
 *? 2.Overriding(dynamic/runtime polymorphism).
 */

import java.util.*;

class poly {
    public void add() {
        System.out.println("No Parameter");
    }

    public void add(int a, int b) {
        System.out.println("Addition of two number is : " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition of three number is : " + (a + b + c));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();
        System.out.println("Enter third number : ");
        int c = scanner.nextInt();
        System.out.println("----------------------------------------------------");

        poly pl = new poly();
        pl.add();
        pl.add(a, b);
        pl.add(a, b, c);
        System.out.println("----------------------------------------------------");

    }

}

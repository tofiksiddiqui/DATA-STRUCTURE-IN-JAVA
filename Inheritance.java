
/**
 *!Inheritance : Inheritance the method and variable should be declared as public
 ** Purpose : (1).To use the properties of another class
 ** Purpose : (2).To reusability of the code.We create the object of base class not th super class.
 */

import java.util.*;

class Math {
    int a;
    int b;
    int c;

    public void add(int x, int y) {
        a = x;
        b = y;

    }

    public void sub(int x, int y) {
        a = x;
        b = y;

    }

    public void mul(int x, int y) {
        a = x;
        b = y;

    }

    public void div(int x, int y) {
        a = x;
        b = y;

    }
}

class add extends Math {
    int total;

    public void addition() {
        total = a + b;
    }

    public void subtraction() {
        total = a - b;
    }

    public void multiplication() {
        total = a * b;
    }

    public void division() {
        total = a / b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.print("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int b = scanner.nextInt();
        add mt = new add();
        mt.add(a, b);
        mt.sub(a, b);
        mt.mul(a, b);
        mt.div(a, b);
        mt.addition();
        System.out.println("------------------------------------------------------");
        System.out.println("Addition of two number is : " + mt.total);
        mt.subtraction();
        System.out.println("Subtraction of two number is : " + mt.total);
        mt.multiplication();
        System.out.println("Multiplication of two number is : " + mt.total);
        mt.division();
        System.out.println("Division of three two is : " + mt.total);
        System.out.println("------------------------------------------------------");

    }
}

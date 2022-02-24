
/**
 * !Abstraction : The basic purpose of using abstract class or method is that to hide implementaion details.
 ** 1.Abstract is a keyword.
 ** 2.If a class is declared using abstract keyword then we can not create an object of this class but we can creater object of this class in sub class.
 ** 3.If a class is declared using abstract then we can not give the difinition of this class but we can give the difinition of this class in sub class.
 ** 4.In any normal we can not create the abstract method.
 ** 5.If class is declared using the keyword class then we can not create the abstract method.
 ** i.e 
 
 class abc{
     void def(){}
     abstract void def(); // It is incorrect
 } 
 */

import java.util.*;

abstract class Math {
    public void add(int a, int b) {
        System.out.println("Addition is : " + (a + b));
    }

    abstract void sub(int a, int b);

    abstract void mul(int a, int b);
}

abstract class Demo1 extends Math {
    void sub(int a, int b) {
        System.out.println("Subtraction is : " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication is : " + (a * b));
    }

    abstract void div(int a, int b);
}

class Demo2 extends Demo1 {
    void div(int a, int b) {
        System.out.println("Division is : " + (a / b));
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();
        System.out.println("----------------------------------------------------");

        Demo2 dm = new Demo2();
        dm.add(a, b);
        dm.sub(a, b);
        dm.mul(a, b);
        dm.div(a, b);
        System.out.println("----------------------------------------------------");

    }
}

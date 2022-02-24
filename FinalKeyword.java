/**
 * ! Final Keyword : (1).Used in final variable.
 * *                (2).Used in final method.
 * *                (3).Used in final class.
 * * If we declared a variable using final keyword then we can not change the value of that variable.
 * * Instance Variable : A variable which is declared inside the class but out of the method.
 * * Local variable : A variable which is declared inside the method of class.
 * * Class variable(Static Variable) :
 * * Parameterized variable: A variable which is used as parameter in method.
 * * Final keyword are used to avoid the method(Overriding)
 * * final keyword are used to avoid the inheritance.
 */
class finalKeyword {
    final int a; // Instance variable
    int b;
    final static int d;// Static variable
    static {
        d = 100;
    }

    finalKeyword() { // we can declare the variable using construtor if we did not initialized.
        a = 20;
    }

    void show() {
        final int b = 10; // Local variable
        System.out.println("The value of b is = " + a);
    }

    void show1(final int c) {
        b = c; // parameterized variable
        // c = c + 10; we can not change the final varibale value
        b = b + 10; // but we can chnage the value of b which is not final variable
        System.out.println("The value of b is = " + b);
    }

    void show2() {
        System.out.println("The value of d is = " + d);
    }
}

class A {

    void Display() {
        System.out.println("Hello to java ");
    }
}

class B extends A {
    void Display() {
        System.out.println("Hello to Java Programming ");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        finalKeyword fOb = new finalKeyword();
        fOb.show();
        fOb.show1(30);
        fOb.show2();
        B bOb = new B();
        bOb.Display();
    }
}

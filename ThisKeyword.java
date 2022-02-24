
/**
 * ! This Keyword : (1).Used to reference variable.
 * *                (2).Used to refer any member of current class.
 * *                (3).Used to invoke current class constructor.
*/

import java.util.*;

class myKeyword {
    int a;
    int b;

    public void setData(int a, int b) {
        a = a;
        b = b;
    }

    public void show() {
        System.out.println("A value is : " + a);
        System.out.println("B value is : " + b);
    }
}

class myKeyword1 {
    int a;
    int b;

    public void setData1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void show1() {
        System.out.println("A value is : " + a);
        System.out.println("B value is : " + b);
    }
}

class myKeyword2 {
    int a;
    int b;
    int c;

    myKeyword2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    myKeyword2(int a, int b, int c) {
        this(a,b);//Used to invoke current class constructor.
        this.c = c;
    }

    public void show2() {
        System.out.println("The value of a is = " + a);
        System.out.println("The value of b is = " + b);

    }

    public void show3() {
        System.out.println("The value of a is = " + a);
        System.out.println("The value of b is = " + b);
        System.out.println("The value of c is = " + c);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();
        myKeyword myOb = new myKeyword();
        myKeyword1 myOb1 = new myKeyword1();
        myOb.setData(num1, num2);
        myOb.show();
        System.out.println("-----------------------------------------");
        myOb1.setData1(num1, num2);
        myOb1.show1();
        System.out.println("-----------------------------------------");
        myKeyword2 myOb2 = new myKeyword2(num1, num2);
        myOb2.show2();
        System.out.println("-----------------------------------------");
        System.out.print("Enter the third number : ");
        int num3 = scanner.nextInt();
        myKeyword2 myOb3 = new myKeyword2(num1, num2, num3);
        myOb3.show3();
        System.out.println("-----------------------------------------");
    }
}

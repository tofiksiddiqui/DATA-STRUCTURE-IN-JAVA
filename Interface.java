/**
 *!Interface :(1)Interface is a collection of abstract method and constant field.
 *(2) Interface is used to implement multiple inhertitance in java.
 *(3)In Interfcace threre is no need to create an object of any class while in class we create an object for every class.
 *(4)we use the key keyword interface while creating.
 *(5)We use the keyword implment to inherit any interface if that is interface.
 *(6)If that is class then we use the extends keyword to inherit.
 *(7)In interface all the variable are to be constant
 *         For example : 
 *          interface abc{
 *           constant variable
 *           abstract method
 *           }
 *
 *          int a = 100;
 *           public static final int a = 100;
 *           int a() or abstract public int a() both are right in case of interface
 *           Both statement are correct becuase in interface variable always constant and method always abstract
 *
 * */
 import java.util.*;
 interface addition{
     void add(int a, int b);
 }

 interface subtraction{
     void sub(int a, int b);
 }

 interface multiplication{
     void mul(int a,int b);
 }

 interface division{
     void div(int a, int b);
 }

 class allContain implements addition,subtraction,multiplication,division{
    public void add(int a, int b){
        System.out.println("Addition of Two number is = "+(a + b));
    }
    public void sub(int a, int b){
        System.out.println("Subtraction of two number is = "+(a - b));
    }
    public void mul(int a, int b){
        System.out.println("Multiplication of two number is = "+(a * b));
    }
    public void div(int a, int b){
        System.out.println("Division of two number is = "+(a / b));
    }
 }

 class ThreeNumber{
    public void largeThree(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("a is the largest number : "+a);
        }else if(b > c){
            System.out.println("b is the largest number : "+b);
        }else{
            System.out.println("c is the largest number : "+c);
        }
    }
 }

 interface TwoNumber{
    void largeTwo(int a, int b);
 }

 class TwoThreeNumber extends ThreeNumber implements TwoNumber{
    public void largeTwo(int a, int b){
        if(a > b){
            System.out.println("a is the largest number : "+a);
        }else{
            System.out.println("b is the largest number : "+b);
        }
    }
 }

 class Interface{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = scanner.nextInt();
        System.out.println("------------------------------------------");
        allContain allOb = new allContain();
        allOb.add(num1, num2);
        allOb.sub(num1, num2);
        allOb.mul(num1, num2);
        allOb.div(num1, num2);
        System.out.println("------------------------------------------\n");
        TwoThreeNumber ttOb = new TwoThreeNumber();
        ttOb.largeThree(num1, num2, num3);
        System.out.println("------------------------------------------\n");
        ttOb.largeTwo(num1, num2);
        System.out.println("-------------------------------------------\n\n");
    }
 }



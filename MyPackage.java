/**
 * ! Package : It is container that contains different sub-packages and similar type of class and inteface.
 * * while creating java we can not create two with public keyword it will create an error.
 * * Java package is used to cotegorized the classes and interfaces so that they can be easily maintained.
 * * java Package provide access protection.
 * * Java package removes naming collision.
 * */
import myPackage.*;
import java.util.*;
 class MyPackage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = scanner.nextInt();
        int d = LargestThreeNumber.Largest(num1, num2, num3);
        System.out.println("-------------------------------------");
        System.out.println("Largest number among three number is = "+d);
        System.out.println("-------------------------------------");
        int e = LargestTwoNumber.Largest(num1, num2);
        System.out.println("The largest number among two number is = "+e);
        System.out.println("-------------------------------------");
        System.out.print("Enter the size of an array : ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the element : ");
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Before sorting : ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
        System.out.print("After sorting : ");
        myBubbleSort.mySort(a, n);
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
        
    }
 }
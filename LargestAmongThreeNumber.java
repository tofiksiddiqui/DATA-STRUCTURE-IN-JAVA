import java.util.Scanner;

class LargestAmongThreeNumber {
    public static int Largest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number : ");
        int c = scanner.nextInt();
        System.out.println("-----------------------------------------");
        int larg = LargestAmongThreeNumber.Largest(a, b, c);
        System.out.println("The Largest number among three number is : " + larg);
        System.out.println("------------------------------------------\n");
    }
}
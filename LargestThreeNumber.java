import java.util.Scanner;
class LargestThreeNumber{
	public static int Largest(int a,int b,int c){
	if( a >b && a > c){
		return a;
	}else if(b>c){
		return b;
	}else{
		return c;
	}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.print("Enter the first number : ");
		int a = scanner.nextInt();
		System.out.print("Enter the second number : ");
		int b = scanner.nextInt();
		System.out.print("Enter the third number : ");
		int c = scanner.nextInt();
		int d = LargestThreeNumber.Largest(a,b,c);
		System.out.print("Largest among three number is : "+d);
		System.out.println();
		System.out.println("-------------------------------------------\n");
	}
}
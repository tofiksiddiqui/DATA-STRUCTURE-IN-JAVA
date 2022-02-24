/**
 * Types of error : (1)Compile-time error (2)Run-time error
 * Exception : Run-time error(unusual condition)
 * Examples of exception :
 * (1)ArithmeticEception
 * (2)ArrayIndexOutOfBoundException
 * (3)IOException
 * (4)NullPointerException
 * To handle all type of exception we use try and catch block
 * Perspective : (1).Handling Exception (2).Supress the exception
 * 
 * 
 * throws keyword are used to supress the exception and throws keyword always we write netx to the method.
 * for example : class s {
 * public static void main(String args[]) throws ArithmeticException, IOException{
 * int a = 10;
 * int b = 100;
 * int c = 10;
 * int d = 1 / (a - c);
 * System.out.print(d);
 *  }
 * }
 * 
 * 
 * throw keyword are used to explicitly or forcefully create an exception.
 * throw keyword always use in try-catch block where throws key never used in try-catch block
 * for example : 
 * class s{
 * public static void main(String[] args) {
 	int i = 10;
 	int j = 0;
 	int k;
 	try{
	k = i * j;
	if(k > 10){
	throw new ArithmeticException();
	}
	System.out.println(k);
 	}catch(ArithmeticExceptione){
	
 	}
 	System.out.println("Hello JavaProgramming");
 }
 * }
 * 
 * 
 * */
 
 import java.util.*;
 import java.lang.*;
 import java.io.*;
 class myException{
 	/*public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		System.out.println("-------------------------------------------------");
 		try{
 			int a = 10;
 			int b = 200;
 			int c = 10;
 			int d = (b / (a - c));
 		}catch(ArithmeticException e){
 			System.out.println(e);
 		}
 		public static void main(String args[]) throws ArithmeticException, IOException{
         int a = 10;
         int b = 100;
         int c = 10;
         int d = 1 / (a - c);
         System.out.print(d);
          }
          */
 	public static void main(String[] args) {
 		int i = 10;
 		int j = 20;
 		int k;
 		try{
 			k = i * j;
 			if(k > 300){
 				throw new ArithmeticException();
 			}
 			System.out.println(+k);
 		}
 		catch(ArithmeticException e){}
 		System.out.println("Hello JavaProgramming");
 	}
 		
 }
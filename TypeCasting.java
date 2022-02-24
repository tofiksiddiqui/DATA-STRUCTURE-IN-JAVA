/**
 * ! Type Casting types : 
 * * (1).Implicit Conversion or Widening Conversion(Done automaticall by Compiler).
 * * (2).Explicit Conversion or Narrowing Conversion(Done forcefully by Programmer).
 * 
 * */



class TypeCasting{
	public static void main(String[] args) {
		int a = 10;
		double d = a;
		float f = a;
		byte b = (byte)a;
		System.out.println("The double value of d is = "+d);
		System.out.println("The float value is = "+f);
		System.out.println("The byte value of b is = "+b);
		System.out.println("\n\n");
	}
}
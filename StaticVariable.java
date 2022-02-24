/**
 * ! Static Variable : (1).If a varibale is declared as static then it will add previous value on each iteration.
 * *                   (2).If a variable is declared as int then it will display same value as previous.
 * 
 * */

class myStaticClass{
	int a = 10;
	static int b = 5;
	int c = 10;
	int d = 5;
	void Display(){
		a = a + 10; 
		b = b + 20; 
		System.out.println("Value of a is = "+a);
		System.out.println("Value of b is = "+b);
	}
	void Display1(){
		c = c + 10;
		d = d + 20;
		System.out.println("Value of c is = "+c);
		System.out.println("Value of d is = "+d);
	}
}

class StaticVariable{
	public static void main(String[] args) {
		myStaticClass msob = new myStaticClass();
		msob.Display();
		System.out.println("----------------------------------------------");
		myStaticClass msob1 = new myStaticClass();
		msob1.Display();
		System.out.println("----------------------------------------------");
		myStaticClass msob11 = new myStaticClass();
		msob11.Display();
		System.out.println("----------------------------------------------");
		myStaticClass msob2 = new myStaticClass();
		msob2.Display1();
		System.out.println("----------------------------------------------");
		myStaticClass msob3 = new myStaticClass();
		msob3.Display1();
	}
}
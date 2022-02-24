/**
 * Super keyword : 
 * (1)Used in the concept of inheritance.
 * (2)Used to access parent class member or method.
 * (3)Used to call parent class constructor.
 * 
 * 
 * */

 class A{
 	int a;
 }

 class B extends A{
 	void Display(){
     int a = 10;     //variable of sub class B
     super.a = 100;  //variable of parent class A
     System.out.println("Sub class value is = "+a);
     System.out.println("Parent class value is = "+(super.a));
 	}
 }

 class C {
 	void show(){
 		System.out.println("This is Parent class : show()");
 	}
 }

 class D extends C{
 	void show(){
     System.out.println("This is sub class : show()");
 	}
 	void merge(){
 		show(); //this is sub class method
 		super.show(); //This is parent class method
 	}
 }

 class E{
 	int a = 1000;
 	E(int a){
 		this.a = a;
 	}
 }

class F extends E{
	int a = 5000;
	F(int g, int f){
		super(g);
		a = f;
	}

	void msg(){
		System.out.println("Sub class : a = "+a);
		System.out.println("Parent class : super.a = "+(super.a));
	}
}
 class superKeyword{
 	public static void main(String[] args) {
 		System.out.println("-------------------------------------------------");
 		B ob = new B();
 		ob.Display();
 		System.out.println("-------------------------------------------------");
 		D ob1 = new D();
 		ob1.merge();
 		System.out.println("-------------------------------------------------");
        F ob2 = new F(10, 20);
        ob2.msg();
 		System.out.println("-------------------------------------------------\n");
		 System.out.println("Java is a good Programming Language As per my opinion ask to expert");
 	}
 }
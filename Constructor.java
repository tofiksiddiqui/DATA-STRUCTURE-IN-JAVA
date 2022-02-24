
/**
 * ! Constructor : It is a block of code similar to the method.
 * * Propertis : (1)It is same as class name.
 * * (2)It does not have any return type.
 * * (3)When there is not constructor then system will create default construtor.
 * * (4)We can overload the constructor
 */
import java.util.*;

class myConstructor {
    String name;
    String addrs;
    int rollno;

    /* This is default constructor because it is not taking any parameter */
    myConstructor() {

    }

    /* This is parameterized constructor because it is taking the parameter */
    myConstructor(String n, String a, int r) {
        this.name = n;
        this.addrs = a;
        this.rollno = r;
    }

    public void Display() {
        System.out.println("The name of student is : " + name);
        System.out.println("The address of student is : " + addrs);
        System.out.println("The rollno of student is : " + rollno);
    }

    public void Display1() {
        System.out.println("--------------------------------");
        System.out.println("This is default constructor");
        System.out.println("--------------------------------");
    }
}

class Constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.print("Enter the name of the student : ");
        String name = scanner.nextLine();
        System.out.print("Enter the address of the student : ");
        String addrs = scanner.nextLine();
        System.out.print("Enter the rollno of the student : ");
        int rollno = scanner.nextInt();
        myConstructor consOb = new myConstructor(name, addrs, rollno);
        myConstructor consOb1 = new myConstructor();
        consOb1.Display1();
        consOb.Display();
        System.out.println("-----------------------------------------------");

    }
}

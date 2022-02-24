import myPackage.mySubPackage.mySubSubPackage.*;
import java.util.*;
public class myStudentDetails{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.print("Enter the name of the student : ");
		String name = scanner.nextLine();
		System.out.print("Enter the registration number : ");
		int regno = scanner.nextInt();
		System.out.print("Enter the rollno : ");
		int rollno = scanner.nextInt();
		System.out.print("Enter the address : ");
		String addrs = scanner.next();
		System.out.print("Enter the semester : ");
		int sem = scanner.nextInt();
		System.out.print("Enter the cgpa : ");
		float cgpa = scanner.nextFloat();
		System.out.println("--------------------------------------------------------");
		StudentDetails.details(name, regno, rollno, addrs, sem, cgpa);
		System.out.println("--------------------------------------------------------\n\n");
	}
}
import java.util.*;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println(year + "\tIs not a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + "\tIt is a century year(Century year is also a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + "\tIt is not a leap year");
        } else {
            System.out.println(year + "\tIt is a leap year");
        }

    }
}

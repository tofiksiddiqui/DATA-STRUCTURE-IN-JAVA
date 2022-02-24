import java.util.*;

public class InterestAndCompound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time;
        double rateOfInterest;
        double amount;
        double SimpleInterest;
        double CompoundInterest;
        double principalAmount;
        System.out.println("Enter the principal amount(P) :");
        principalAmount = scanner.nextDouble();
        System.out.println("Enter the rate of interest(r) : ");
        rateOfInterest = scanner.nextDouble();
        System.out.println("Enter the time(t)");
        time = scanner.nextInt();
        SimpleInterest = (principalAmount * rateOfInterest * time) / 100;
        System.out.println("Simple Interest is : " + SimpleInterest);
        amount = principalAmount * (Math.pow((1 + rateOfInterest / 100), time));
        System.out.println("Total amount is = " + amount);
        CompoundInterest = amount - principalAmount;
        System.out.println("Compound Interest is = " + CompoundInterest);

    }
}

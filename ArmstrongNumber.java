public class ArmstrongNumber {
    public static void main(String[] args) {
        int num1 = 152;
        int rem;
        int OriginalNum = num1;
        int ArmstrongNumber = 0;
        while (OriginalNum != 0) {
            rem = OriginalNum % 10;
            ArmstrongNumber = ArmstrongNumber + rem * rem * rem;
            OriginalNum = OriginalNum / 10;
        }
        if (ArmstrongNumber == num1) {
            System.out.println(num1 + " is armstrong number ");
        } else {
            System.out.println(num1 + " is not an armstrong number");
        }
    }
}

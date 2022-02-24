public class FactorOfANumber {
    public static void main(String[] args) {

        int num1 = 60;
        int i = 1;
        while (i <= num1) {
            if (num1 % i == 0) {
                System.out.println("Factor of " + num1 + "are = " + i);
            }
            i++;
        }

        System.out.println("\n\n");
        System.out.println("----------Factor Of Negative Number-----------------\n");
        int number = -60;
        System.out.print("Factors of " + number + " are: ");

        // run loop from -60 to 60
        for (int j = number; j <= Math.abs(number); ++j) {

            // skips the iteration for i = 0
            if (j == 0) {
                continue;
            } else {
                if (number % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }

}

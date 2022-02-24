
public class PrimeNumber {
    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        int n = 1;// it is the number to be checked
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }

        System.out.println("------------Generating Prime Number------------------\n");
        int low = 20;
        int high = 50;
        while (low < high) {
            int flag1 = 0;
            for (int j = 2; j <= low / 2; j++) {
                if (low % j == 0) {
                    flag1 = 1;
                    break;
                }
            }
            if (flag1 == 0 && low != 0 && low != 1) {
                System.out.println(low + " ");
            }
            low++;
        }

    }
}

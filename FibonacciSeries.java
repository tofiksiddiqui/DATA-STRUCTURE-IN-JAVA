public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 10;
        int firstTerm = 0;
        int secondterm = 1;
        int i = 1;
        System.out.println("Fibonacci series till " + num1 + "terms");
        while (i <= num1) {
            System.out.println(firstTerm + ",");
            int nextTerm = firstTerm + secondterm;
            firstTerm = secondterm;
            secondterm = nextTerm;
            i++;
        }
    }
}

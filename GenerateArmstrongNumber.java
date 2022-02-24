public class GenerateArmstrongNumber {
    public static void main(String[] args) {
        int low = 1;
        int high = 154;
        for (int number = low + 1; low < high; number++) {
            int countDigits =0;
            int result = 0;
            int OriginalNum = number;

            while(OriginalNum !=0){
                OriginalNum = OriginalNum / 10;
                countDigits++;
            }
            OriginalNum = number;
            while(OriginalNum != 0){
                int rem = OriginalNum % 10;
                result +=Math.pow(rem,countDigits);
                OriginalNum /= 10;
            }
            if(result == number){
                System.out.println(number+" ");
            }
        }
    }
}

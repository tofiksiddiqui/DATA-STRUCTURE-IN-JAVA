import java.util.*;

class ReverseStringUsingArray {

    public void ReverseString(String stringName) {

        if (stringName == null || stringName.length() <= 0) {
            System.out.print(stringName);
        } else {
            System.out.print(stringName.charAt(stringName.length() - 1));
            ReverseString(stringName.substring(0, (stringName.length() - 1)));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------\n");
        System.out.print("Enter any string : ");
        String str = scanner.nextLine();
        String revString = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }
        System.out.println("Reverse String is : " + revString);
        System.out.println("-----------------------------------------------------\n");
        System.out.print("Enter any String : ");
        String name = scanner.nextLine();
        char arr[] = name.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        System.out.print("Reversed String is : ");
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (char ch : arr) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("-----------------------------------------------------\n");
        ReverseStringUsingArray st = new ReverseStringUsingArray();
        System.out.print("Enter the String name : ");
        String myString = scanner.nextLine();
        System.out.print("Reverse String is : ");
        st.ReverseString(myString);
        System.out.println();
        System.out.println("-----------------------------------------------------\n");

    }
}
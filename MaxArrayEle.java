import java.util.*;

class MaxArrayEle{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------------------------------------------");
		System.out.print("Enter the size of an array : ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the element of an array : ");
		for(int i = 0; i < n; i++){
			arr[i] = scanner.nextInt();
		}
        
        int max = 0;
		for(int i = 0; i < n; i++){
              if(arr[i] > max){
              	max = arr[i];
              }
		}
		System.out.println();
		System.out.print("The maximum element is : " + max);
		System.out.println();
		System.out.println("--------------------------------------------------\n\n");
	}
}
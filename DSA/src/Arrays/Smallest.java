package Arrays;
import java.util.Scanner;

public class Smallest {
   public static int bruteforce(int[] arr) {
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = bruteforce(arr);
        System.out.println("The second smallest element is: " + result);
    }
}
  


package Arrays;

import java.util.Scanner;

public class LeftRotationByKvalue {
    public static void solution(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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
    System.out.print("Enter number of rotations (k): ");
    int k = sc.nextInt(); 


    solution(arr, k);
    System.out.println("Array after left rotation by " + k + ":");
    for (int num : arr) {
        System.out.print(num + " ");
    }
     sc.close();
       
    
    }
  
}

package Arrays;

import java.util.Scanner;

public class LeftroatationByK {
  public static void solution(int[] arr, int k) {
    int n = arr.length;
    k = k % n; // In case k is greater than n
    int[] temp = new int[k];
    for (int i = 0; i < k; i++) {
        temp[i] = arr[i];
    }
    for (int i = k; i < n; i++) {
        arr[i - k] = arr[i];
    }
    int j=0;
    for (int i = n - k; i < n; i++) {
        arr[i] = temp[j];
        j++;
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

package Arrays;

import java.util.Scanner;

public class LeftRoatationByone { 
    public static void leftRotateByOne(int[] arr) {
        if (arr.length == 0) return; // Handle empty array

        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
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

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        leftRotateByOne(arr);

        System.out.println("Array after left rotation by one:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

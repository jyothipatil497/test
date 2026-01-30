package Arrays;

import java.util.Scanner;

public class ArraysIO {
    public static void main(String[] args) {
    int[] arr = new int[100];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {
      System.out.print("Enter the element at index :" +i);
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < size; i++) {
      System.out.println(arr[i] + " ");
    }
  
}
}

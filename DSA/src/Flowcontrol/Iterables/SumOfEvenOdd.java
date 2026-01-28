package Iterables;

public class SumOfEvenOdd {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();
    int evenSum = 0;
    int oddSum = 0;

    System.out.println("Enter " + n + " numbers:");
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num % 2 == 0) {
        evenSum += num;
      } else {
        oddSum += num;
      }
    }

    System.out.println("Sum of even numbers: " + evenSum);
    System.out.println("Sum of odd numbers: " + oddSum);
    sc.close();
  }
  
}

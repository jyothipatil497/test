package Iterables;

public class PrimeNumbers {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter a number to check if it's prime:");
    int n = sc.nextInt();
    boolean isPrime = true;

    if (n <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    if (isPrime) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number.");
    }
    sc.close();
  }
}
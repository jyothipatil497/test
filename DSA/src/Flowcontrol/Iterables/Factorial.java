package Iterables;

public class Factorial {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter a number to calculate its factorial:");
    int n = sc.nextInt();
    long factorial = 1;

    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }

    System.out.println("Factorial of " + n + " is: " + factorial);
    sc.close();
  }

  
}

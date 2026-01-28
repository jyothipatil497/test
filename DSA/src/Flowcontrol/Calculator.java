package Flowcontrol;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for addition:");
        System.out.println("2 for subtraction:");
        System.out.println("3 for multiplication:");
        System.out.println("4 for division:");
        
        System.out.println("Enter the number:");
        
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("Enter the choice:");
        int choice = sc.nextInt();

        
      double result=0;

      switch (choice) {
        case 1:
          result = a + b;
          break;
        case 2:
          result = a - b;
          break;
        case 3:
          result = a * b;
          break;
        case 4:
          result = a / b;
          break;
        default:
          System.out.println("Invalid choice");
          return;
      }

      System.out.println("Result: " + result);
    }
  
}

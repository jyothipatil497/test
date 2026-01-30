package Iterables;

import java.util.Scanner;

public class ArmStrongNumber {
 public static double count(double n) {
      int count=0;
      while(n>0){
        count++;
        n=n/10;
      }
      return count;
    }
  public static boolean isArmStrong(int n) {
    double count = count((double) n);
    double sum = 0;
    double corrent=n;

    while(corrent>0){
      double digit=corrent%10;
      sum=sum+Math.pow(digit,count);
      corrent=corrent/10;
    }
    return sum==n;
  }
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  double num=sc.nextDouble();
  boolean result=isArmStrong(num);
    System.out.print("Enter a number: ");
  
    if (isArmStrong(num)) {
      System.out.println(num + " is an Armstrong number.");
    } else {
      System.out.println(num + " is not an Armstrong number.");
    }
    sc.close();
  }
    


  
}

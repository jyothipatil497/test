package Arrays;

public class SumofTwoArrays {
    public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6}; 
    int n = arr1.length;
    int[] sumArray = new int[n];
    for (int i = 0; i < n; i++) {
      sumArray[i] = arr1[i] + arr2[i];
      System.out.print(sumArray[i] + " ");
        
        
    }
  }
}

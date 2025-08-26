/*
6. Fibonacci of n Number.
solution :- public static  int Fib(int num){
        if(num < 2){
            return num;
        }
      return Fib(num -1) + Fib(num-2);
    }   

    int num=10;
    for(int i=0;i<num;i++){
      System.out.print(Fib(i)+" ");
    }

7.Recursive Binary Search in a Sorted Array
solution : int arr[] ={1,2,3,5,6,7,8};
        int left =0;
        int right = arr.length-1;
        int target = 3;
        
    int res =   binarySearch(arr,left,right,target);
      if(res != -1){
      System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found");
        }

      public static int binarySearch(int arr[],int left,int right,int target){
      int mid = (left + right)/2;
      if(left > right){
        return -1;
      }
      if(target == arr[mid]){
      return mid;
    }
    else if(arr[mid] < target){
        return binarySearch(arr, mid+1, right, target);
    }else{
      return binarySearch(arr, left,mid-1, target);
    }
  }
 #  Tail Recusion:
solution:  int num = 5;
      int result = factorialTail(num, 1);  // Start with acc = 1
      System.out.println("Factorial of " + num + " is: " + result);
     
      public static int factorialTail(int n, int acc) {
        if (n == 0) return acc;  // base case
        return factorialTail(n - 1, acc * n);  // tail-recursive call
    }
 */

public class RecursionPractice{
      public static void main(String[] args) {
    System.out.println("Happy Coding!");
   }
}

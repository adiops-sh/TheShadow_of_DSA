/*

 1. Factorial of a Number
 solution:-  int result = factorialOfNumber(5);
        System.out.println("Factorial is: " + result); 
 
        public static int factorialOfNumber(int num){
        int fact=1;
        if(num==0){
            return 1;
        }
         return fact = num * factorialOfNumber(num-1);
     }

2. Sum of First N Natural Numbers.
solution: int result = sumOfNaturalNumber(5);
        System.out.println("Sum Of Natural Number is: " + result); 

    public static int sumOfNaturalNumber(int num){
        if(num == 0){
            return 0;
        }
         return num + sumOfNaturalNumber(num-1);
     }

3. Print Numbers from N to 1
solution:  int num = 17;
        printNumber(num);

        public static void printNumber(int num){
            if(num==0){
                return;
            }
            System.out.print(num+" ");
            printNumber(num-1);
        }

4.Print Numbers from 1 to N.
solution : int num = 17;
        printNumber(num);

        public static void printNumber(int num){
            if(num==0){
                return;
            }
            printNumber(num-1);
            System.out.print(num+" ");
            
        }

5. Binary Search Using Recursion.
solution:-  int[] arr = {2, 4, 7, 10, 15, 20, 25};
            int target = 15;

            int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

         public static int binarySearch(int [] arr, int left , int right , int target){
         if(left > right){
          return -1;
        }
          int mid = left + (right - left) / 2;
          if(arr[mid] == target){
            return mid;
          }else if(arr[mid] < target){
            return binarySearch(arr,mid+1 , arr.length-1, target);
          }else{
            return binarySearch(arr,left, mid -1,target);
          }
        }
       
 */

public class RecursionProblem{
    public static void main(String[] args) {
          System.out.println("Happy Coding!");
 }
}
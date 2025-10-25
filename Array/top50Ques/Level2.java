import java.util.Arrays;

public class Level2 {
/*
    Level 2: Moderate (Logic Building)
==============================================================================================
11. Remove duplicate elements from a sorted array (in-place).
Solution: 
    private static void removeDuplicate(int [] arr) {
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[index]){ 
                index++;
                arr[index] = arr[i];
            }
        }

        for(int i=0;i<=index;i++){
            System.out.print(arr[i]+" ");
        }  
    }
==============================================================================================
12. Move all zeros to the end without using another array.
Solution:
private static void moveZerosAtTheEnd(int[] arr) {
        int index = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length){
            arr[index++]=0;
        }

        System.out.println(Arrays.toString(arr));
    }

==============================================================================================
13. Find the missing number from 1 to N.
Solution:
private static int missingNumber(int[] arr, int n) {
        int sumOfArray = 0;
        int sumOfN = (n*(n+1))/2;
        for(int x :arr ){
            sumOfArray += x;
        }
        return sumOfN - sumOfArray;
    }
==============================================================================================
14. Find the duplicate element in an array of size n (where numbers are 1 to n-1).
Solution: for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]); // get index
            if (arr[index] < 0) {
                
                System.out.println(index);
            } else {
                arr[index] = -arr[index];
            }
        }
==============================================================================================
15. Count even and odd numbers in an array.
Solution: 
private static void countOddNumber(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if(num%2!=0){
                count++;
        }
    }
        System.out.println("Count of Odd Numbers: " + count);
}

private static void countEvenNumber(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if(num%2==0){
                count++;
        }
    }
        System.out.println("Count of Even Numbers: " + count);
    }
==============================================================================================
16. Find the sum of positive and negative numbers separately.
Solution:
private static void positiveIntegerSum(int[] arr) {
        int sum = 0;
            for (int i : arr) {
                if(i > 0){
                    sum+=i;
                }
            }
            System.out.println("Sum of Positive Integers: " + sum);
    }

private static void negativeIntergerSum(int[] arr) {
        int sum =0;
            for (int i : arr) {
                if(i < 0){
                    sum+=i;
                }
            }
            System.out.println("Sum of Negative Integers: " + sum);
    }           
==============================================================================================
17. Find the pair of elements whose sum equals a given number(Target).
Solution: private static void pairSumFinder(int[] arr, int tar) {
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == tar){
                    System.out.println("Pair is: (" + arr[i] + ", " + arr[j] + ")");
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("No such pair found.");
    }
}
==============================================================================================
18. Find maximum product of two integers in an array.
Solution:
==============================================================================================
19. Find common elements in two arrays.
Solution:
==============================================================================================
20. Merge two sorted arrays into one sorted array.
Solution:
==============================================================================================

*/    
    public static void main(String[] args) {
        System.out.println("This is Level 2 Java file.");
        int arr[] = {1,2,3,3,4,5};
        int n = 7;
        // removeDuplicate(arr);
        // moveZerosAtTheEnd(arr);
        // System.out.println(missingNumber(arr, n));
        // countEvenNumber(arr);
        // countOddNumber(arr);
        //  positiveIntegerSum(arr);
        //  negativeIntergerSum(arr);
        // pairSumFinder(arr,6);
    }
}

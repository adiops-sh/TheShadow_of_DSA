/*
        Level 3: Intermediate (Pattern + DSA thinking)

21. Rotate array by K positions Left rotate by two.
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int ele=arr[0];
            int ele2=arr[1];
            for(int i=0;i<arr.length-2;i++){
                arr[i]=arr[i+2];
            }
                arr[arr.length-2]=ele;
                arr[arr.length-1]=ele2;
            System.out.println(Arrays.toString(arr));

22. Find leaders in an array (element greater than all elements to its right).
solution: 

23. Find majority element (> n/2 times).
solution: 

24. Sort an array of 0s, 1s, and 2s (Dutch National Flag algorithm).
solution: 

25. Find the maximum subarray sum (Kadane’s Algorithm).
solution: 

26. Find the longest increasing subarray length.
solution: 

27. Find peak element in an array.
solution: 

28. Find the index of first repeating and first non-repeating element.
solution: 

29. Count pairs with a given difference.
solution: 

30. Find the equilibrium index (sum of left = sum of right).
solution: 

 */

import java.util.Arrays;

public class Level3{
    public static void main(String[] args) {
      System.out.println("hello Level 3");
    }
    
}
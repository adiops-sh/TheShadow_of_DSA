// import java.util.Arrays;

public class Level1 {
/*
    Level 1: Basics (Build Foundation)
==================================================================================
1. Find the maximum and minimum element in an array.
solution:  
    public static int maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
            for (int i : arr) {
                if(i > max){
                    max=i;
                }
            }
        return max;
    }

    public static int minEle(int[] arr) {
        int min = Integer.MAX_VALUE;
            for (int i : arr) {
                if(i < min){
                    min=i;
                }
            }
        return min;
    }
=====================================================================================        
2. Find the sum of all elements in an array.
Solution:
    private static int sumOfArray(int [] arr) {
        int sum=0;
        for (int x : arr) {
            sum+=x;
        }
        return sum;
    }
=====================================================================================
3. Calculate the average of all elements.
Solution: 
    private static double avgOfArray(int[] arr) {
        int sum=0;
        for (int x : arr) {
            sum+=x;
        }
        double avg = (double) sum/arr.length;
        return avg;
    }
=====================================================================================
4. Search an element in an array at particular Index (Linear Search).
Solution:
    private static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
=====================================================================================
5. Count frequency of a given element.
Solution:
private static int freq(int[] arr, int target) {
        int count = 0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                flag= true;
                count++;
            }
        }
        if(flag == false){
            return -1;
        }
        return count;
    }   
=====================================================================================
6. Check if an array is sorted or not.
Solution:
private static boolean arrayISSorted(int[] arr) {
        boolean asc = true;
        boolean des = true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                asc = false;
            }

            if(arr[i] < arr[i+1]){
                des =  false;
            }
        }
        return asc || des;
    }
=====================================================================================
7. Reverse an array in-place. (without using any extra spaces)
Solution:
    private static void reverse(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            arr[i] = arr[arr.length-1-i] + arr[i];
            arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];
            arr[i] = arr[i] - arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arr));
    }
=====================================================================================
8. Copy one array to another array.
Solution: 
    private static void copyOfArray(int[] arr) {
        int arr2 [] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
=====================================================================================
9. Find the second largest element (without sorting).
Solution:
    private static int secLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;         
    }
=====================================================================================
10. Find the second smallest element (without sorting).
Solution:
private static int secSmallest(int[] arr) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }else if(arr[i] < secondSmallest && arr[i] != firstSmallest){
                secondSmallest = arr[i];
            }
    }

    if (secondSmallest == Integer.MAX_VALUE) {
        System.out.println("No second smallest element!");
    } else {
        System.out.println(secondSmallest);
    }

    return secondSmallest;        
}
=====================================================================================

 */
    public static void main(String[] args) {
        // int arr[] = {5,5,5};

        // System.out.println(maxEle(arr));
        // System.out.println(minEle(arr));
        // System.out.println(sumOfArray(arr));
        // System.out.println(avgOfArray(arr));
        // System.out.println(linearSearch(arr, 2));
        // System.out.println(freq(arr,12));
        // System.out.println(arrayISSorted(arr));
        // reverse(arr);
        // copyOfArray(arr);
        // System.out.println(secLargest(arr));
        // System.out.println(secSmallest(arr));
    }
}

public class BinarySearch {

     public static int findIndex(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // avoid integer overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found  
     }

   public static int findFloor(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int floor = -1; // default if no floor is found

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // exact match is also a floor
            } else if (arr[mid] < target) {
                floor = arr[mid]; // potential floor
                left = mid + 1;   // move right
            } else {
                right = mid - 1;  // move left
            }
        }

        return floor;
    }

     public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12, 14}; // Array must be sorted
        int target = 7;

    // Task 1: Find and return the index of the first occurrence of the target element in the array.
        
        int result = findIndex(arr, target);
        if (result != -1) {
            System.out.println("Target Element found at index " + result);
        } else {
            System.out.println("Target Element not found.");
        } 
        

     //   Task 2: Find the Floor of a Target Number in a Sorted Array
     /*
       int result = findFloor(arr, target);

        if (result != -1) {
            System.out.println("Floor of " + target + " is: " + result);
        } else {
            System.out.println("No floor found for " + target);
        } 
      */
        

     }
}

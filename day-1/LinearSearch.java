public class LinearSearch{
    
    public static int findIndex(int [] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
       return -1;
    }

    public static int findMax(int[] arr){
         int maxElement = arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxElement < arr[i]){
                 maxElement = arr[i];
            }
        }
          return maxElement;
    }

     public static void main(String[] args){
         int [] arr = {5, 10, 15, 10, 20};
         int target = 15;

/*   Task 1: Find and return the maximum (largest) number in the array.
         int maxElement = findMax(arr);
         System.out.println("Maximum Element: " + maxElement);
 */
    
 
 
  // Task 2: Find and return the index of the first occurrence of the target element in the array.
       int result = findIndex(arr, target);

         if(result != -1){
             System.out.println("Target Element found at index "+ result);
         }else{
           System.out.println("Target Element not found.");
         }
    
         
  

     }
}
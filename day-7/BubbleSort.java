/*

1. Arrange is Ascending Order
solution:  int arr [] = {6,4,2,8,3,1};
        for(int i=0;i<arr.length-1;i++){
        
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=t;
                }  
            }
        }
        for(int x:arr){
        System.out.print(x+" ");
        }
//==========================================================
2. Optimized Bubble Sort (Early Exit if Already Sorted)
solution:  int arr [] = {1,2,3,4,5,6};
           int n= arr.length;
           boolean swap;
        for(int i=0;i<arr.length-1;i++){
          swap = false
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=t;
                swap=true;
                }  
            }
            if (!swap) break;  // If no two elements were swapped, the array is already sorted
        }
        for(int x:arr){
        System.out.print(x+" ");
        }

 */

public class BubbleSort{
    public static void main(String[] args) {
    System.out.println("Happy Coding!");
    }
}
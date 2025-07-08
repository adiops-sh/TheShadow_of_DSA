/*
 1. Arrange in Ascending Order.
 solution: int arr[] ={6,9,4,2,8,3,1,5};
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    for(int x :arr){
    System.out.print(x+" ");
    }

//===================================================
2. Arrange in Descending Order.
 solution: int arr[] ={6,9,4,2,8,3,1,5};
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    for(int x :arr){
    System.out.print(x+" ");
    }

//==============================================

 */

public class SelectionSort {
     public static void main(String[] args) {
      System.out.println("Happy Coding!");
    }
}

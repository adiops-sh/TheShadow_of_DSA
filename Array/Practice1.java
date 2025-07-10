/*
1. Read index of bigger element from an array which contains 10 elements?
Solution: int arr [] ={2,3,7,3,1,2,5,9,4,4};
        int maxIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex=i;
            }
        }
        System.out.println(maxIndex);

2. Read index of smaller element from an array which contains 10 elements?
Solution: int arr [] ={2,3,7,3,1,2,5,9,4,4};
        int minIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[minIndex]){
                minIndex=i;
            }
        }
        System.out.println(minIndex);

3. Read index of bigger even element from an array which contains 10 elements?
Solution:  int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
        int maxEvenEleValue = Integer.MIN_VALUE;
        int maxEvenEleIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                if(arr[i] > maxEvenEleValue){
                    maxEvenEleValue = arr[i];
                    maxEvenEleIndex = i;
                    
                }
            }
        }
        System.out.println(maxEvenEleIndex);

4. Read index of smaller even element from an array which contains 10 elements?
Solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
        int minEvenEleValue = Integer.MAX_VALUE;
        int minEvenEleIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                if(arr[i] < minEvenEleValue){
                    minEvenEleValue = arr[i];
                    minEvenEleIndex = i;
                    
                }
            }
        }
        System.out.println(minEvenEleIndex);

5. Read index of bigger odd element from an array which contains 10 elements?
Solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
        int BiggerOddValue = Integer.MIN_VALUE;
        int BiggerOddEleIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                if(arr[i] > BiggerOddValue){
                    BiggerOddValue = arr[i];
                    BiggerOddEleIndex = i;
                }   
            }

        }
        System.out.println(BiggerOddEleIndex);

6. Read index of smaller odd element from an array which contains 10 elements?
solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
        int SmallerOddValue = Integer.MAX_VALUE;
        int SmallerOddEleIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                if(arr[i] < SmallerOddValue){
                    SmallerOddValue = arr[i];
                    SmallerOddEleIndex = i;
                }   
            }

        }
        System.out.println(SmallerOddEleIndex);

7. Read indexes of all even elements from an array which contains 10 elements?
solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
        for(int i=0;i<arr.length;i++){
           if(arr[i] % 2 == 0){
             System.out.print(i+" ");
          }
        }

8. Read indexes of all odd elements from an array which contains 10 elements?
solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
        for(int i=0;i<arr.length;i++){
           if(arr[i] % 2 != 0){
             System.out.print(i+" ");
          }
        }

9. Read all the elements which are next to even elements?
solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
          for(int i=0;i<arr.length-1;i++){
            if(arr[i] % 2 == 0){
              System.out.print(arr[i+1]+" ");
            }
          }

10. Read all the elements which are next to odd elements?
solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
          for(int i=0;i<arr.length-1;i++){
            if(arr[i] % 2 != 0){
              System.out.print(arr[i+1]+" ");
            }
          }

*/
public class Practice1{
     
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
    }
}
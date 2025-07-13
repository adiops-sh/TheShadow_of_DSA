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

11. Read all the elements which are in between 6 and 25 from an array which contains 10 elements?
solution: int arr[] = {11, 4, 7, 22, 5, 18, 3, 6, 9, 2};
           for(int i=0;i<arr.length;i++){
            if(arr[i] >=6 && arr[i] <=25 ) {
             System.out.print(arr[i]+" ");
            }
           }

12. Read all the elements which are in between 15 and 25 and in between 35 and 60 from an array which contains 10 elements? 
solution:  int arr[] = {12, 18, 24, 33, 42, 59, 61, 5, 37, 26};
        for(int i=0;i<arr.length;i++){
            if((arr[i] >=15 && arr[i] <=25) || (arr[i] >=35 && arr[i] <=60)) {
            System.out.print(arr[i]+" ");
            }
        }

13. Read all the elements from the starting to ending?
solution: int arr[] = {12, 18, 24, 33, 42, 59, 61, 5, 37, 26};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 

14. Read first half of the elements from an array which contains 10 elements?
solution: int arr[] = {12, 18, 24, 33, 42, 59, 61, 5, 37, 26};
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }

15. Read 2nd half of the elements from an array which contains 10 elements?
solution: int arr[] = {12, 18, 24, 33, 42, 59, 61, 5, 37, 26};
        for(int i=arr.length/2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

16. Read every element in the reverse order?
solution: int arr[] = {10,9,8,7,6,5,4,3,2,1};
        for(int i=0;i<arr.length/2;i++){
              int t = arr[i]; //12
              arr[i] = arr[arr.length-i-1]; // 26
            arr[arr.length-i-1]=t;
         
        }
        System.out.println(Arrays.toString(arr));

17. Read first half of the elements in the reverse order from an array which contains 10 elements?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = arr.length/2 - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
         }
          
18. Read 2nd half of the elements in the reverse order from an array which contains 10 elements?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = arr.length-1; i>=arr.length/2; i--) {
           System.out.print(arr[i] + " ");
        }

19. Read all the elements from an array except first element?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
          for(int i = 1; i<arr.length; i++) {
           System.out.print(arr[i] + " ");
        }


20. Read all the elements from an array except first 3 elements?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
          for(int i = 3; i<arr.length; i++) {
           System.out.print(arr[i] + " ");
        }

21. Read all the elements from an array except last element?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<arr.length-1; i++) {
        System.out.print(arr[i] + " ");
        }

22. Read all the elements from an array except last 3 elements?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<arr.length-3; i++) {
        System.out.print(arr[i] + " ");
        }

23. Read all the elements from an arrayexcept first and last elements?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 1; i<arr.length-1; i++) {
        System.out.print(arr[i] + " ");
        }

24. Read all the elements from an array except middle element?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int mid = arr.length/2;
        for(int i = 0; i<arr.length; i++) {
        if(mid != i){
            System.out.print(arr[i] + " ");
        }else{
          continue;
        }
        }
26. Read the min value from an array?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
            min=arr[i];
            }
        }
            System.out.println(min);

27. Read the max value from an array?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
            max=arr[i];
            }
        }
            System.out.println(max);

28. Read the elements which are 5 multiples from array?
solution: int arr[] = {1, 5, 10, 12, 15, 22, 25, 30, 33, 40};
    for(int i=0;i<arr.length;i++){
        if(arr[i] %5==0){
            System.out.print(arr[i]+" ");
        }
    }

29. Read the elements which are not 5 multiples from array?
solution: int arr[] = {1, 5, 10, 12, 15, 22, 25, 30, 33, 40};
    for(int i=0;i<arr.length;i++){
        if(arr[i] % 5 != 0){
            System.out.print(arr[i]+" ");
        }
    }

30. Read the min even value from an array? 
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
            if(arr[i] < min){
            min=arr[i];
            }
            }
        }
    System.out.println(min);  
        
*/
public class Practice1{
     
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
    }
}
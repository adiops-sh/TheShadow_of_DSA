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

31. Read the max even value from an array?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
            if(arr[i] > max){
            max=arr[i];
            }
            }
        }
    System.out.println(max);  

32. Read the min odd value from an array?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2!=0){
            if(arr[i] < min){
            min=arr[i];
            }
            }
        }
    System.out.println(min);  

33. Read the max odd value from an array?
solution: int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
            if(arr[i] > max){
            max=arr[i];
            }
            }
        }
    System.out.println(max);

34. Read middle 3 values from an array which contains odd number of elements
solution: int arr[] = {1,2,3,4,5,6,7};
          if(arr.length %2 != 0 &&  arr.length >= 3){
          int mid = arr.length/2;
            System.out.println(arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]);
          }else{
            System.out.println("Array doesn't have odd number of elements or has less than 3 elements.");
          }

35. Read middle 5 values from an array which contains odd number of elements
solution: int arr[] = {1,2,3,4,5,6,7};
          if(arr.length %2 != 0 &&  arr.length >= 5){
          int mid = arr.length/2;
            System.out.println(arr[mid-2]+" "+arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]+" "+arr[mid+2]);
          }else{
            System.out.println("Array doesn't have odd number of elements or has less than 5 elements.");
          }

36. Read middle 4 values from an array which contains even number of elements
solution: int arr[] = {1,2,3,4,5,6,7,8};
        if(arr.length %2 == 0 &&  arr.length >= 4){
        int mid = arr.length/2;
            System.out.println(arr[mid-2]+" "+arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]);
        }else{
            System.out.println("Array doesn't have even number of elements or has less than 4 elements.");
        }

37. Read middle 6 values from an array which contains even number of elements
solution: int arr[] = {1,2,3,4,5,6,7,8};
        if(arr.length %2 == 0 &&  arr.length >= 6){
        int mid = arr.length/2;
            System.out.println(arr[mid-3]+" "+arr[mid-2]+" "+arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]+" "+arr[mid+2]);
        }else{
            System.out.println("Array doesn't have even number of elements or has less than 6 elements.");
        }

38. Read all odd values from an array in between 10 and 25
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 != 0 && arr[i]>=10 && arr[i] <= 25){
            System.out.print(arr[i]+" ");
          }
        }

39. Read all even values from an array in between 10 and 25
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 == 0 && arr[i]>=10 && arr[i] <= 25){
            System.out.print(arr[i]+" ");
          }
        }

40. Read all odd values from an array which are less than 10 or greater than 30
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 != 0 && (arr[i]<10 || arr[i] >30)){
            System.out.print(arr[i]+" ");
          }
        }

41. Read all even values from an array which are less than 10 or greater than 30
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 == 0 && (arr[i]<10 || arr[i] >30)){
            System.out.print(arr[i]+" ");
          }
        }

42. Find out sum of all the elements
solution:  int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
             for(int x:arr){
              sum +=x; 
             }
               System.out.println(sum);

43. Find out sum of all the even elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum = 0;
             for(int i=0;i<arr.length;i++){
              if(arr[i] %2==0){
               sum+=arr[i];
              }
             }
               System.out.println(sum);

44. Find out sum of all the odd elements
solution:  int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2!=0){
             sum+=arr[i];
            }
        }
            System.out.println(sum);

45. Find out sum of all the elements except first and last elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
            for(int i=1;i<arr.length-1;i++){
            sum+=arr[i];
            }
            System.out.println(sum);

46. Find out sum of all the elements except first, last and middle elements (total elements are odd)
solution:  int arr[] =  {5, 10, 15, 20, 25, 30, 35};
            int  sum=0;
             int mid=arr.length/2;
            for(int i=1;i<arr.length-1;i++){
             if(mid != i){
               sum+=arr[i];
             }
            }
            System.out.println(sum);

47. Find out avg of all the elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
            for(int x:arr){
            sum +=x; 
            }
            double avg = (double) sum / arr.length;
            System.out.println(avg);

48. Find out avgof all the even elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0,count=0;
            for(int x:arr){
             if(x %2==0){
               sum +=x; 
               count++;
             }
           
            }
            double avg = (double) sum / count;
            System.out.println(avg);

49. Find out avgof all the odd elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0,count=0;
            for(int x:arr){
             if(x %2!=0){
               sum +=x; 
               count++;
             }
           
            }
            double avg = (double) sum / count;
            System.out.println(avg);

50. Find out avgof all the elements except first and last elements
solution:  int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
            for(int i=1;i<arr.length-1;i++){
            sum+=arr[i];
            }
            double avg = ((double) sum/arr.length)-2;
            System.out.println(avg);

*/
public class Practice1{
     
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
    }
}
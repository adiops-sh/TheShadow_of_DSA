/*
1. Find out total number of elements in an array
Solution :-  int [] arr ={5,10,15,20,25};
            int totalNumberOfElement=arr.length;
            System.out.println(totalNumberOfElement);

2. Read 2nd element and 3rd element from an array which contains 10 elements?
solution :- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            int secEle = arr[1], thirdEle=arr[2];
            System.out.println("Second Element is : "+secEle);
            System.out.println("Third Element is : "+thirdEle);

3. Read 2nd element and 4th element from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            int secEle = arr[1], fourthEle=arr[3];
            System.out.println("Second Element is : "+secEle);
            System.out.println("Fourth Element is : "+fourthEle);

4. Read first element from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            int firstEle = arr[0];
            System.out.println("First Element is : "+firstEle);

5. Read last element from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            int lastEle = arr[arr.length-1];
            System.out.println("Last Element is : "+lastEle);

6. Read last two elements from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            int firstLastEle = arr[arr.length-1],secondLastEle = arr[arr.length-2];
            System.out.println("First Last Element is : "+firstLastEle);
            System.out.println("Second Last Element is : "+secondLastEle);

7. Read first 5 elements from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
          for(int i=0;i<arr.length/2;i++){
                System.out.print(arr[i]+" ");
            }

8. Read last 4 elements from an array which contains 17 elements?
solution:- int [] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170};

            for(int i=arr.length-4;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

9. Read first element and last element from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            int firstEle = arr[0];
            int lastEle = arr[arr.length-1];
            System.out.println("First Element is : "+firstEle);
            System.out.println("Last Element is : "+lastEle);

10. Read first 2 elements and last 2 elements from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            int firstEle = arr[0];
            int secondEle = arr[1];
            int lastEle = arr[arr.length-1];
            int secondLastEle = arr[arr.length-2];
            System.out.println("First Element is : "+firstEle);
            System.out.println("Second Element is : "+secondEle);
            System.out.println("Last Element is : "+lastEle);
            System.out.println("Second Last Element is : "+secondLastEle);

11. Read first 2 elements and last 5 elements from an array which contains 10 elements?
Solution:- int [] arr ={10,20,30,40,50,60,70,80,90,100};
            System.out.print("First Two Element: ");
          for(int i=0;i<2;i++){
            System.out.print(arr[i]+" ");
            }
        
        System.out.println("\nLast Five Element: ");
            for(int i=arr.length-5;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
            

12. Read first 5 elements and last 2 elements from an array which contains 10 elements?
solution :- int [] arr ={10,20,30,40,50,60,70,80,90,100};
        System.out.print("First Five Element: ");
            for(int i=0;i<5;i++){
              System.out.print(arr[i]+" ");
            }
        
        System.out.println("\nLast Two Element: ");
            for(int i=arr.length-2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
            

13. Read first even element from an array which contains 10 elements?
solution: int [] arr = {11, 21, 33, 49, 55, 67, 79, 89, 99, 149};
            boolean found = false;

              for(int num : arr) {
                if(num % 2 == 0){
                  System.out.println("first even element is : "+num);
                  found = true;
                  break;
                }
              }
          if(!found){
            System.out.println("No Even Element Found");
          }

14. Read last even element from an array which contains 10 elements?
solution: int [] arr = {11, 21, 33, 49, 55, 67, 79, 89, 99, 149};
            boolean found = false;

              for(int i=arr.length-1;i>=0;i--) {
                if(arr[i] % 2 == 0){
                  System.out.println("last even element is : "+arr[i]);
                  found = true;
                  break;
                }
              }
          if(!found){
            System.out.println("No Even Element Found");
          }

15. Read first odd element from an array which contains 10 elements?
solution: int [] arr = {11, 21, 33, 49, 55, 67, 79, 89, 99, 149};
            boolean found = false;

              for(int num : arr) {
                if(num % 2 != 0){
                  System.out.println("first odd element is : "+num);
                  found = true;
                  break;
                }
              }
          if(!found){
            System.out.println("No Odd Element Found");
          }

16. Read last odd element from an array which contains 10 elements?
solution: int [] arr = {11, 21, 33, 49, 55, 67, 79, 89, 99, 149};
            boolean found = false;

              for(int i=arr.length-1;i>=0;i--) {
                if(arr[i] % 2 != 0){
                  System.out.println("last odd element is : "+arr[i]);
                  found = true;
                  break;
                }
              }
          if(!found){
            System.out.println("No Odd Element Found");
          }

17. Read 3rd odd element from an array which contains 10 elements?
solution:   public static void main(String[] args) {
    int [] arr = {11, 21, 33, 49, 55, 67, 79, 89, 99, 149};
          int count=0;
          
            for(int num : arr) {
                if(num % 2 != 0){
                  count++;
                  if(count == 3){
                  System.out.println("3rd Odd Element is : "+num);
                  return;
                  }
                }
              }
            
            System.out.println("No 3rd Odd Element Found");
          }

18. Read 2nd even element from an array which contains 10 elements?
solution: public static void main(String[] args) {
        int [] arr = {11, 21, 48, 49, 55, 67, 79, 89, 99, 149};
          int count=0;
            for(int num : arr) {
                if(num % 2 == 0){
                  count++;
                  if(count == 2){
                  System.out.println("2nd Even Element is : "+num);
                  return;
                  }
                }
              }
            System.out.println("No 2nd Even Element Found");
        }

19. Find out total number of elements, total number of odd elements and total number of even elements from an array
solution: int [] arr = {11, 21, 48, 49, 55, 67, 79, 88, 99, 149};
          int totalNumberOfElement = arr.length;
          int totalNumberOfEvenElement = 0;
          int totalNumberOfOddElement = 0;

          for(int num:arr){
          if(num % 2 ==0){
            totalNumberOfEvenElement++;
          }else{
            totalNumberOfOddElement++;
          }
          }
          System.out.println("total number of elements is : "+totalNumberOfElement);
          System.out.println("total number of Even elements is : "+totalNumberOfEvenElement);
          System.out.println("total number of Odd elements is : "+totalNumberOfOddElement);

20. Read middle element from an array which contains odd number of elements
solution : int [] arr = {11, 21, 48, 49, 55, 67, 79, 88, 99};
            int middleEle = arr[arr.length/2];
            System.out.println(middleEle);

21. Read middle elements from an array which contains even number of elements
solution : int [] arr = {11, 21,48, 49, 55, 67, 79, 88, 99,100};
          int mid1 = (arr.length/2)-1;
          int mid2 = (arr.length/2);
          System.out.println("Middle Element is :"+ mid1 +" "+ mid2);


22. Read the index of first even number from an array which contains 10 elements?
solution:  int [] arr = {11, 21,23, 33, 49, 58, 79, 89, 99, 149};
            boolean found = false;
            for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 ==0){
                System.out.println("index of first even number is: "+i);
                found = true;
                break;
            }
          }
              if(!found){
              System.out.println("Even numbr not present ");
              }
            
23. Read the index of first odd number from an array which contains 10 elements?
solution:  int [] arr = {11, 21,23, 33, 49, 57, 79, 89, 99, 149};
            boolean found = false;
            for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 !=0){
                System.out.println("index of first Odd number is: "+i);
                found = true;
                break;
            }
          }
              if(!found){
              System.out.println("Odd numbr not present ");
              }
            
24. Read the index of 2nd even number from an array which contains 10 elements?
solution:  int [] arr = {11, 21,23, 38, 49, 57, 78, 89, 99, 149};
            boolean found = false;
            int count =0;
            for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 ==0){
              count++;
              if(count ==2){
              System.out.println("index of Second even number is: "+i);
                found = true;
                break;
              } 
            }
          }
              if(!found){
              System.out.println("Even numbr not present ");
              }

25. Read the index of 3rd odd number from an array which contains 10 elements?
Solution : public static void main(String[] args) {
    int [] arr = {11, 21, 33, 49, 55, 67, 79, 89, 99, 149};
          int count=0;
          
            for(int  i=0;i<arr.length;i++) {
                if(arr[i] % 2 != 0){
                  count++;
                  if(count == 3){
                  System.out.println("Index of 3rd Odd Element is : "+i);
                  return;
                  }
                }
              }
            
            System.out.println("No 3rd Odd Element Found");
          }

26. Read the index of last even number from an array which contains 10 elements?
Solution : public static void main(String[] args) {
    int [] arr = {11, 21, 33, 49, 55, 67, 78, 89, 99, 149};
      for(int i=arr.length-1;i>=0;i++){
        if(arr[i] %2==0){
          System.out.println("Index of last even Element is : "+i);
              return;
        }
      }
        System.out.println("even element not found");
  }

27. Read the index of last odd number from an array which contains 10 elements?
Solution : public static void main(String[] args) {
    int [] arr = {11, 21, 33, 49, 55, 67, 78, 89, 99, 149};
      for(int i=arr.length-1;i>=0;i++){
        if(arr[i] %2 !=0){
          System.out.println("Index of last Odd Element is : "+i);
              return;
        }
      }
        System.out.println("Odd element not found");
  }

28. Read the index of last 2nd even number from an array which contains 10 elements?
Solution : public static void main(String[] args) {
     int [] arr = {11, 21, 33, 49, 55, 67, 78, 89, 99, 149};
      int count =0;
       for(int i=arr.length-1;i>=0;i++){
         if(arr[i] %2 == 0){
         count++;
          if(count ==2){
           System.out.println("Index of Second last even Element is : "+i);
              return;
          }
         
         }
       }
         System.out.println("Second last even element not found");
   }

29. Read the index of last 3rd odd number from an array which contains 10 elements?
Solution : public static void main(String[] args) {
     int [] arr = {11, 21, 33, 49, 55, 67, 78, 89, 99, 149};
      int count = 0;
       for(int i=arr.length-1;i>=0;i++){
         if(arr[i] %2 != 0){
         count++;
          if(count == 3){
           System.out.println("Index of third last odd Element is : "+i);
              return;
          }
         
         }
       }
         System.out.println("Third  last Odd element not found");
   }

30. Read the indexes of last 3rd odd number and first even number from an array which contains 10 elements?
solution: public static void main(String[] args) { 
       int[] arr = {11, 21, 33, 49, 55, 67, 78, 89, 99, 149};

        int oddCount = 0;
        int thirdLastOddIndex = -1;
        int firstEvenIndex = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                oddCount++;
                if (oddCount == 3) {
                    thirdLastOddIndex = i;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }

          if (thirdLastOddIndex != -1) {
            System.out.println("Index of third last odd number is: " + thirdLastOddIndex);
        } else {
            System.out.println("Third last odd number not found.");
        }

        if (firstEvenIndex != -1) {
            System.out.println("Index of first even number is: " + firstEvenIndex);
        } else {
            System.out.println("First even number not found.");
        }
  }

 */

public class ArrayLogicalCoding {
     public static void main(String[] args) {
            System.out.println("Happy Coding");
     }
}

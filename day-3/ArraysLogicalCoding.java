/*
31. Read all even elements from an array which contains 10 elements?
solution:- int [] arr = {1,2,3,4,5,6,7,8,9,10};
          for (int num : arr) {
             if(num %2 == 0){
               System.out.print(num+" ");
             }
          }

32. Read all odd elements from an array which contains 10 elements?
solution :- int [] arr = {1,2,3,4,5,6,7,8,9,10};
          for (int num : arr) {
             if(num % 2 != 0){
               System.out.print(num+" ");
             }
          }

33. Read alternative elements from an array starting from first element.
solution:-  int [] arr = {1,2,3,4,5,6,7,8,9,10};
          for(int i=0;i<arr.length;i+=2){
           System.out.print(arr[i]+" ");
          }

34. Read alternative elements from an array in the reverse order and starting from last element.
solution:-  int [] arr = {1,2,3,4,5,6,7,8,9,10};
          for(int i=arr.length-1;i>=0;i-=2){
           System.out.print(arr[i]+" ");
          }

35. Read alternative elements from an array starting from 2nd element.
solution:-  int [] arr = {1,2,3,4,5,6,7,8,9,10};
          for(int i=1;i<arr.length;i+=2){
           System.out.print(arr[i]+" ");
          }

36. Read alternative elements from an array in the reverse order and starting from 2nd last element.
solution:-  int [] arr = {1,2,3,4,5,6,7,8,9,10};
          for(int i=arr.length-2;i>=0;i-=2){
           System.out.print(arr[i]+" ");
          }

37. There are even numbers of elements in an array. Read 2nd half of the elements in the reverse order.
solution:  int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};
        for(int i=arr.length-1; i>=arr.length/2;i--){
            System.out.print(arr[i]+" ");
        }

38. There are even numbers of elements in an array. Read 1st half of the elements in the reverse order and an alternative elements.
solution:  int[] arr = {11, 22, 33, 44, 55, 66, 77, 88,99,110};
           for(int i=(arr.length/2)-1; i>=0;i-=2){
            System.out.print(arr[i]+" ");
        }

39. Read the Indexes Whose Elements Are Bigger Than Their Right-Side Element.
solution: int[] arr = {5, 10, 7, 12, 6, 9};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                System.out.println("Index: " +i);
            }
        }

40. Read the indexes whose elements are bigger than their both neighbors.
solution: int[] arr = {3, 8, 5, 12, 7, 6};
        for(int i=1;i<=arr.length-2;i++){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                System.out.println("index "+i);
            }
        }
            
41. Find the indexes of three continues elements which are in the increasing order?
solution: int[] arr = {2,3,5,1,4,6,8,2};
        for(int i=0;i<arr.length-2;i++){
             if(arr[i] < arr[i+1] && arr[i+1] <arr[i+2]){
                  System.out.println(i);
             }
        }

42. Find the Occurrences Where the Sum of Two Continuous Elements Equals the Third Element.
solution: int[] arr = {2, 3, 5, 9, 4, 13, 17, 6, 23};
          for(int i=0;i<arr.length-2;i++){
           if(arr[i]+arr[i+1]==arr[i+2]){
            System.out.println(i);
           }
        }

43. Read the elements from both the ends of an array. read and print the elements alternately from both the ends — i.e., first from the beginning, then from the end, then second from the beginning, then second last from the end, and so on.
solution:-  int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            System.out.print(arr[i]+" ");
            i++;
            if(i <= j) {
                System.out.print(arr[j]+" ");
                j--;
            }
        }

44. Read the elements from both the ends of an array and should start from the middle and keep moving towards to
the ends..
Start reading elements from the **middle** of the array.
- Then move **outward alternately** towards both ends — first left, then right, then left-1, then right+1, and so
on.
solution : int[] arr = {10, 20, 30, 40, 50, 60};
int n = arr.length;

System.out.print("Output: ");

if (n % 2 == 0) {
    int left = n / 2 - 1;
    int right = n / 2;

    while (left >= 0 && right < n) {
        System.out.print(arr[left] + " ");
        System.out.print(arr[right] + " ");
        left--;
        right++;
    }
} else {
    int mid = n / 2;
    System.out.print(arr[mid] + " ");

    int gap = 1;
    while (mid - gap >= 0 || mid + gap < n) {
        if (mid - gap >= 0)
            System.out.print(arr[mid - gap] + " ");
        if (mid + gap < n)
            System.out.print(arr[mid + gap] + " ");
        gap++;
    }
}

45. Read the Biggest Element from an Array which Contains 10 Elements.
solution: int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
          int max=arr[0];
          for(int num:arr){
            if(max<num){
              max=num;
            }
          }
            System.out.println(max);

46. Read the Smallest Element from an Array which Contains 10 Elements
solution: int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
          int min=arr[0];
          for(int num:arr){
            if(min > num){
              min=num;
            }
          }
            System.out.println(min);

47. Read the Biggest Even Element from an Array which Contains 10 Elements
solution:   int[] arr = {15, 22, 37, 40, 51, 68, 29, 74, 13, 32};
            int biggestEvenEle=Integer.MIN_VALUE;
            boolean found = false;
          for(int num:arr){
             if(num%2==0){
                if(num > biggestEvenEle){
                    biggestEvenEle=num;
                    found = true;
                }
             }
          }
          if(found){
           System.out.println(biggestEvenEle);
          }else{
              System.out.println("No even element found.");
          }

48. Read the Smallest Even Element from an Array which Contains 10 Elements
solution:   int[] arr = {15, 22, 37, 40, 51, 68, 29, 74, 13, 32};
            int smallestEvenEle=Integer.MAX_VALUE;
            boolean found = false;
          for(int num:arr){
             if(num%2==0){
                if(num < smallestEvenEle){
                    smallestEvenEle=num;
                    found = true;
                }
             }
          }
          if(found){
           System.out.println(smallestEvenEle);
          }else{
              System.out.println("No even element found.");
          }

49. Read the Biggest Odd Element from an Array which Contains 10 Elements
solution:   int[] arr = {15, 22, 37, 40, 51, 68, 29, 74, 13, 32};
            int biggestOddEle=Integer.MIN_VALUE;
            boolean found = false;
          for(int num:arr){
             if(num%2!=0){
                if(num > biggestOddEle){
                    biggestOddEle=num;
                    found = true;
                }
             }
          }
          if(found){
           System.out.println(biggestOddEle);
          }else{
              System.out.println("No Odd element found.");
          }
              
50. Read the Smallest Odd Element from an Array which Contains 10 Elements
int[] arr = {15, 22, 37, 40, 51, 68, 29, 74, 13, 32};
            int smallestOddEle=Integer.MAX_VALUE;
            boolean found = false;
          for(int num:arr){
             if(num%2!=0){
                if(num < smallestOddEle){
                    smallestOddEle=num;
                    found = true;
                }
             }
          }
          if(found){
           System.out.println(smallestOddEle);
          }else{
              System.out.println("No Odd element found.");
          }
 */

public class ArraysLogicalCoding {
    public static void main(String[] args) {
       System.out.println("Happy Coding");
    }
}

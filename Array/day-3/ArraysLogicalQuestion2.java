/*
 81. Read the max even value from an array?
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

82. Read the min odd value from an array?
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

83. Read the max odd value from an array?
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

84. Read middle 3 values from an array which contains odd number of elements
solution: int arr[] = {1,2,3,4,5,6,7};
          if(arr.length %2 != 0 &&  arr.length >= 3){
          int mid = arr.length/2;
            System.out.println(arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]);
          }else{
            System.out.println("Array doesn't have odd number of elements or has less than 3 elements.");
          }

85. Read middle 5 values from an array which contains odd number of elements
solution: int arr[] = {1,2,3,4,5,6,7};
          if(arr.length %2 != 0 &&  arr.length >= 5){
          int mid = arr.length/2;
            System.out.println(arr[mid-2]+" "+arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]+" "+arr[mid+2]);
          }else{
            System.out.println("Array doesn't have odd number of elements or has less than 5 elements.");
          }

86. Read middle 4 values from an array which contains even number of elements
solution: int arr[] = {1,2,3,4,5,6,7,8};
        if(arr.length %2 == 0 &&  arr.length >= 4){
        int mid = arr.length/2;
            System.out.println(arr[mid-2]+" "+arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]);
        }else{
            System.out.println("Array doesn't have even number of elements or has less than 4 elements.");
        }

87. Read middle 6 values from an array which contains even number of elements
solution: int arr[] = {1,2,3,4,5,6,7,8};
        if(arr.length %2 == 0 &&  arr.length >= 6){
        int mid = arr.length/2;
            System.out.println(arr[mid-3]+" "+arr[mid-2]+" "+arr[mid-1] +" "+ arr[mid] +" "+ arr[mid+1]+" "+arr[mid+2]);
        }else{
            System.out.println("Array doesn't have even number of elements or has less than 6 elements.");
        }

88. Read all odd values from an array in between 10 and 25
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 != 0 && arr[i]>=10 && arr[i] <= 25){
            System.out.print(arr[i]+" ");
          }
        }

89. Read all even values from an array in between 10 and 25
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 == 0 && arr[i]>=10 && arr[i] <= 25){
            System.out.print(arr[i]+" ");
          }
        }

90. Read all odd values from an array which are less than 10 or greater than 30
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 != 0 && (arr[i]<10 || arr[i] >30)){
            System.out.print(arr[i]+" ");
          }
        }

91. Read all even values from an array which are less than 10 or greater than 30
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
        for(int i=0;i<arr.length;i++){
          if(arr[i] %2 == 0 && (arr[i]<10 || arr[i] >30)){
            System.out.print(arr[i]+" ");
          }
        }

92. Find out sum of all the elements
solution:  int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
             for(int x:arr){
              sum +=x; 
             }
               System.out.println(sum);

93. Find out sum of all the even elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum = 0;
             for(int i=0;i<arr.length;i++){
              if(arr[i] %2==0){
               sum+=arr[i];
              }
             }
               System.out.println(sum);

94. Find out sum of all the odd elements
solution:  int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2!=0){
             sum+=arr[i];
            }
        }
            System.out.println(sum);

95. Find out sum of all the elements except first and last elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
            for(int i=1;i<arr.length-1;i++){
            sum+=arr[i];
            }
            System.out.println(sum);

96. Find out sum of all the elements except first, last and middle elements (total elements are odd)
solution:  int arr[] =  {5, 10, 15, 20, 25, 30, 35};
            int  sum=0;
             int mid=arr.length/2;
            for(int i=1;i<arr.length-1;i++){
             if(mid != i){
               sum+=arr[i];
             }
            }
            System.out.println(sum);

97. Find out avg of all the elements
solution: int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
            for(int x:arr){
            sum +=x; 
            }
            double avg = (double) sum / arr.length;
            System.out.println(avg);

98. Find out avgof all the even elements
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

99. Find out avgof all the odd elements
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

100. Find out avgof all the elements except first and last elements
solution:  int arr[] = {11, 13, 15, 17, 20, 22, 23, 25};
            int  sum=0;
            for(int i=1;i<arr.length-1;i++){
            sum+=arr[i];
            }
            double avg = ((double) sum/arr.length)-2;
            System.out.println(avg);
            
 */
public class ArraysLogicalQuestion2 {
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
    }
}

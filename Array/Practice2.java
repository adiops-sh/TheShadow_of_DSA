/*
101. Find out avgof all the elements except first, last and middle elements (total elements are odd)
solution: int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int mid=arr.length/2;
    int sum=0;
    int count=0;
        for(int i=1;i<arr.length-1;i++){
            if(mid != i){
                sum+=arr[i];
                count++;
            }
        }
    double avg = (double) sum/count;
    System.out.println(avg);

102. Find out sum of all the even indexed elements
solution: int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                sum+=arr[i];
            }
        }
    System.out.println(sum);

103. Find out sum of all the even elements from even indexes
solution:int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                if(arr[i] % 2 == 0){
                    sum+=arr[i];
                }
            }
        }
    System.out.println(sum);

104. Find out sum of all the odd elements from even indexes
solution: int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                if(arr[i] % 2 != 0){
                    sum+=arr[i];
                }
            }
        }
    System.out.println(sum);

105. Find out sum of all the elements except first and last elements and also even index elements
solution: int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0;
        for(int i=1;i<arr.length-1;i++){
            if(i % 2 != 0){
                    sum+=arr[i];
            }
        }
    System.out.println(sum);

106. Find out sum of all the elements except first, last and middle elements (total elements are odd) and also even index elements
solution:int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0,mid=arr.length/2;
        for(int i=1;i<arr.length-1;i++){
            if( mid != i && i%2!=0 ){
                    sum+=arr[i];
            }
        }
    System.out.println(sum);


107. Find out avg of all the elements from even index
solution: int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
                count++;
            }
        }
    double avg = (double) sum/count;        
    System.out.println(avg);

108. Find out avg of all the even elements from odd index
solution: int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(i % 2 != 0){
                if(arr[i] %2 ==0){
                    sum+=arr[i];
                    count++;
                }
                
            }
        }
    double avg = (double) sum/count;        
    System.out.println(avg);


109. Find out avg of all the odd elements from even index
solution: int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                if(arr[i] %2 !=0){
                    sum+=arr[i];
                    count++;
                }
                
            }
        }
    double avg = (double) sum/count;        
    System.out.println(avg);

110. Find out avg of all the elements except first and last elements and also from even index
solution:int arr[] = {12, 25, 37, 40, 45, 50, 60};
    int sum=0,count=0;
        for(int i=1;i<arr.length-1;i++){
            if(i % 2 != 0){
                    sum+=arr[i];
                    count++;
                
            }
        }
    double avg = (double) sum/count;        
    System.out.println(avg);

*/

class Practice2{
    public static void main(String[] args) {
        System.out.println("hello ");
        int arr[] = {12, 25, 37, 40, 45, 50, 60};
        int mid=arr.length/2;
        int sum=0;
        int count=0;
        for(int i=1;i<arr.length-1;i++){
         if(mid != i){
          sum+=arr[i];
          count++;
         }
        }
         double avg = (double) sum/count;
         System.out.println(avg);
    }
}
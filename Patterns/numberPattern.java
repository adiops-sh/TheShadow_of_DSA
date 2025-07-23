/*
1.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
solution: int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


2.            1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


3.       1
        212
       32123
      4321234
       32123
        212
         1


4.    1
      2  3
      4  5  6
      7  8  9  10
      11 12 13 14 15
solution: int n=5;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

5.    1
      0 1
      1 0 1
      0 1 0 1
      1 0 1 0 1
solution: int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              if((i+j) %2 ==0){
                System.out.print("1 ");
              }else{
                System.out.print("0 ");
              }
                
            }
            System.out.println();
        }

6.    1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
solution: int n=6;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

7.    1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11


8.          1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5


9.      4 4 4 4 4 4 4  
        4 3 3 3 3 3 4   
        4 3 2 2 2 3 4   
        4 3 2 1 2 3 4   
        4 3 2 2 2 3 4   
        4 3 3 3 3 3 4   
        4 4 4 4 4 4 4   

10.   1      1
      12    21
      123  321
      12344321
 */
public class numberPattern {
     public static void main(String[] args) {
        System.out.println("Happy Coding!");
     }
}

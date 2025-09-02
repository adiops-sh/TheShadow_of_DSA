/*
1.  *****
    *****
    *****
    *****
    *****
solution: int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

2.  *
    **
    ***
    ****
    *****
solution: int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

3.  *****
    ****
    ***
    **
    *
solution: int n=5;
       for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

4.       *
        **
       ***
      ****
     *****
solution: int n=5;
    for(int i=1;i<=n;i++){
        for(int sps =0;sps<n-i;sps++){
            System.out.print(" ");
        }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
    }    

5.   *****
      ****
       ***
        **
         *
solution: int n=5;
    for(int i=1;i<=n;i++){
        for(int sps=0;sps<i;sps++){
            System.out.print(" ");
        }
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
    }

6.      *
       ***
      *****
     *******
    *********
solution: int n=5;
    for(int i=1;i<=n;i++){
        for(int sps=0;sps<n-i;sps++){
            System.out.print(" ");
        }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
    }

7.  *********
     *******
      *****
       ***
        *
solution: int n=5;
    for(int i = 0; i < n; i++) {
    for(int sps = 0; sps < i; sps++) {
        System.out.print(" ");
    }

    for(int j = 0; j < (2 * (n - i) - 1); j++) {
        System.out.print("*");
    }

    System.out.println();
}

8.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
solution: int n=5;
        for(int i=1;i<n*2;i++){
            int print = (i <= n) ? i : (2*n-i);
            for(int j=1;j<=print;j++){
                System.out.print("*");
            }
            System.out.println();
        }

9.       *
        * *
       * * *
      * * * *
     * * * * *
solution: int n=5;
    for(int i = 1; i <= n; i++) {
        for(int sps = 0; sps < n-i; sps++) {
            System.out.print(" ");
        }
        for(int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

10.  * * * * *
      * * * *
       * * *
        * *
         *
solution: int n=5;
    for(int i = 1; i <= n; i++) {
        for(int sps = 0; sps < i; sps++) {
            System.out.print(" ");
        }
        for(int j = 0; j<=n-i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

11.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
solution:  int n=5;
        for(int i=0;i<n*2;i++){
            int print = (i < n) ? n-i : i-n+1;
            int sp = (i < n) ? i : (2*n-i)-1;
            for(int sps=0;sps<sp;sps++){
                System.out.print(" ");
            }
            for(int j=0;j < print;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

12.      *
        * *
       *   *
      *     *
     *********
solution: int n = 5; // height of the triangle

        for (int i = 1; i <= n; i++) {
            // print spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars with hollow inside
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line
        }

13.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
solution:  int n=5;
    for(int i = 1; i <= n*2; i++) {
        int sp = (i <= n) ? (n-i) : (i-n);
        for(int sps=0;sps < sp;sps++){
            System.out.print(" ");
        }

        int print = (i <= n) ? i : (2*n-i);

        for(int j = 1; j <= print; j++) {
            if(j == 1 || j == print) {
                System.out.print("* ");
            }else{
                System.out.print("  "); // double sps for better allignment
            }
        }
        System.out.println();
    }


14.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
solution: int n=5;
        for(int i=0;i<n*2;i++){
            int stars = (i < n) ? n-i : i-n+1;
             int sps = (n-stars) * 2;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            for(int j=0;j<sps;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            System.out.println();
        }

15.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
solution: int n=5;
        for(int i=1;i<n*2;i++){
            int print = ( i<=n ) ? i : (2*n-i) ;
            int spaces = (n - print) * 2;  //8 //6 //2 //0 //2 ...

             //left stars
            for(int j=1;j<=print;j++){
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //right stars
            for(int j=1;j<=print;j++){
                System.out.print("*");
            }

            System.out.println();
        }

16.    ****
       *  *
       *  *
       *  *
       ****
solution: int n=5;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j<=n; j++) {
            if(j==1 || i==1 || i==5 || j==5){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }


17.        *      *
         *   *  *   *
       *      *      *


19.       *****
         *   *
        *   *
       *   *
      *****
solution: int n=5;
    for(int i = 1; i <= n; i++) {
        for(int sps=0;sps<n-i;sps++){
            System.out.print(" ");
        }
        for(int j = 1; j<=n; j++) {
            if(j==1 || i==1 || i==5 || j==5){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

20.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
solution: int n=5;
    for(int i = 1; i <= n*2; i++) {
        int sp = (i <= n) ? (n-i) : (i-n);
        for(int sps=0;sps < sp;sps++){
            System.out.print(" ");
        }

        int print = (i <= n) ? i : (2*n-i);

        for(int j = 1; j <= print; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

21. *     * 
    **    *  
    * *   * 
    *  *  *
    *   * *
    *    **
    *     *
solution: int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

22. *     *
     *   * 
      * *  
       *   
      * *  
     *   * 
    *     *
solution: int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   

 */

public class starPattern{
    public static void main(String[] args) {
        System.out.println("Happy Coding!"); 
        
    }
        
}
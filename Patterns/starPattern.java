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
solution: for(int i = 0; i < n; i++) {
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


9.       *
        * *
       * * *
      * * * *
     * * * * *

10.  * * * * *
      * * * *
       * * *
        * *
         *


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


12.      *
        * *
       *   *
      *     *
     *********


13.  *********
      *     *
       *   *
        * *
         *


14.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *



15.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********


16.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *


17.    ****
       *  *
       *  *
       *  *
       ****



18.        *      *
         *   *  *   *
       *      *      *

19.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

20.       *****
         *   *
        *   *
       *   *
      *****


21.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

22.      
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

 */
public class starPattern{
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
        int n=5;

for(int i = 0; i < n; i++) {
    for(int sps = 0; sps < i; sps++) {
        System.out.print(" ");
    }

    for(int j = 0; j < (2 * (n - i) - 1); j++) {
        System.out.print("*");
    }

    System.out.println();
}

        

    }
}
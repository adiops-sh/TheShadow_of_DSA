/*
1.  E
    D E
    C D E
    B C D E
    A B C D E

2.  a
    B c
    D e F
    g H i J
    k L m N o

3.  E D C B A
    D C B A
    C B A
    B A
    A

4.  A B C D E
    A B C D
    A B C
    A B
    A
solution: int n = 5;
        for (int i = 0; i <n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n-i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

5.  A
    B A
    C B A
    D C B A
    E D C B A
solution: 

6.     A
      A B
     A B C
    A B C D
   A B C D E
solution:  int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

7.  a
    A b
    B c A
    C d B a
    D e C b A

8.  Z
    Y Z
    X Y Z
    W X Y Z
    V W X Y Z

9.  A 
    A B
    A B C
    A B C D
    A B C D E    
solution:  int n = 5;
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }   
    
 */
public class alphabetPattern {
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
        
        int n = 5;
        for (int i = 0; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }


    }
}

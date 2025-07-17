/*
8. print N to 1 Number using Recursion.
solution: int n = 5;
            Print_N(n);

    public static void Print_N(int n){
    if(n == 1){
        return;
    }
    System.out.print(n+" ");
    Print_N(n-1);
}
//===================================================================
9. print 1 to N Number using Recursion.
solution: int n = 5;
        Print_N(1,n);

    public static void Print_N(int c , int n){
    if(c > n){
        return;
    }
    System.out.print(c+" ");
    Print_N(c + 1 , n);
}
//===================================================================
10. print Product of N to 1 Number using Recursion.
solution: int n = 5;
        int res = product(n);
        System.out.println(res);
        
        public static int product(int n){
        if(n==1){
            return 1;
        }

      return n * product(n-1);
}
//===================================================================
11. print Sum of N to 1 Number using Recursion.
solution: int n = 5;
        int res = sum(n);
        System.out.println(res);
        
        public static int sum(int n){
        if(n == 1){
            return 1;
        }
      return n + sum(n-1);
}
//===================================================================
12. print Sum of Digit umber using Recursion.
solution :  int n = 123;
        int res = sumOfDigit(n);
        System.out.println(res);

        public static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        int lastDigit = n % 10;
       return lastDigit + sumOfDigit(n/10);
}
//===================================================================
13. print Product of Digit umber using Recursion.
solution: int n = 12345;
        int res = productOfDigit(n);
        System.out.println(res);

    public static int productOfDigit(int n){
        if(n == 1){
            return 1;
        }
        int lastDigit = n % 10;
       return lastDigit * productOfDigit(n/10);
}
//===================================================================
14. print Reverse a Number using Recursion.
solution: int n = 12345;
        int res = reverseOfNumber(n);
        System.out.println(res);
 
    public static int reverseOfNumber(int n){
        return reverseHelper(n,0);
    }

    public static int reverseHelper(int n, int rev){
    if(n == 0){
    return rev;
    }

    int r = n% 10;
    rev = rev*10 +r;
    return reverseHelper(n/10, rev);
 }
//===================================================================
15. Find number Palindrome is or NOT. using Recursion.
solution:  int n = 12321;
        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome.");
        } else {
            System.out.println(n + " is NOT a Palindrome.");
        }

    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

     public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverse(n / 10, rev);
    }

 */

public class RecursionQuesionLevel_1 {
       public static void main(String[] args) {
        System.out.println("Happy Coding!");
    }
}

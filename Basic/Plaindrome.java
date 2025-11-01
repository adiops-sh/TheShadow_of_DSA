import java.util.Scanner;
public class Plaindrome {
    public static void main(String [] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp = n,rev=0;
        while(n>0){
            int r= n%10;
            rev = (rev*10)+r;
            n=n/10;
        }
        if(temp==rev)
            System.out.println("Given number is a palindrome");
        else
            System.out.println("Given number is not a palindrome");

        sc.close();
    }
}
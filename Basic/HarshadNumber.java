import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[]args){
        System.out.print("Enter the Number: ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp = n;
        while(n>0){
            int r = n%10;
            sum+=r;
            n=n/10;
        }
        if(temp % sum == 0){
            System.out.println( temp +" Harshad(Niven) Number");
        }else{
            System.out.println(temp +" Not a Harshad(Niven) Number");
        }
        sc.close();
    }
}
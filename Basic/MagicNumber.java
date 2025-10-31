import java.util.Scanner;
class MagicNumber{
    public static void main(String[] args) {
        System.out.print("Enter The Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0,temp=n;

        while (temp > 0) {
            int r = temp%10;
            sum+=r;
            temp=temp/10;
        }
        
        if (sum % 9 == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not a Magic Number");
        }
        sc.close();
    }
}
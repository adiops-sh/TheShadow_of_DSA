import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int original = n;
        int count = 0, sum = 0;
        while (n>0) {
            n=n/10;
            count++;
        }
        while (temp>0) {
            int r = temp %10;
            sum += (int)Math.pow(r, count);
            temp=temp/10;
        }
        if(sum==original){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not ArmStrong");
        }

        sc.close();
    }
}

import java.util.Scanner;
public class Automorphic {
public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        int temp = n;
        int nCount = 0;
        while (temp > 0) {
            temp = temp / 10;
            nCount++;
        }
        int pow = (int) Math.pow(10, nCount);
        if (sq % pow == n)
            System.out.println(n + " is an Automorphic, Curious Number.");
        else
            System.out.println(n + " is NOT an Automorphic,Curious Number.");
        
            sc.close();
}
}

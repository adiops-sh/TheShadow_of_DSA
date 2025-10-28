import java.util.Scanner;
class Strong{
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int nSum = 0;

        while (n > 0) {
            int r = n % 10;
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            nSum += fact;        // add factorial to sum
            n = n / 10;          // remove last digit
        }

        if (nSum == temp) {
            System.out.println(temp + " is a Strong Number.");
        } else {
            System.out.println(temp + " is NOT a Strong Number.");
        }
        sc.close();
    }
}
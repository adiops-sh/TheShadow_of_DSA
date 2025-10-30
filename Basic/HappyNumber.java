import java.util.Scanner;

class HappyNumber{
    static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHappy(num))
            System.out.println(num + " is a Happy Number");
        else
            System.out.println(num + " is Not a Happy Number.");
        sc.close();
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        // Using Floyd's cycle detection
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }
}
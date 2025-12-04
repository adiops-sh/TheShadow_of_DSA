public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 152;
        int temp =n;
        int sum = 0;
        while (n > 0){
            int r = n%10;
            sum += r*r*r;
            n = n / 10;
        }
        if (sum == temp){
            System.out.println("ArmStrong Number");
        } else {
            System.out.println("Not an ArmStrong Number");
        }
    }
}

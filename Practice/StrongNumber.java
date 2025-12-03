public class StrongNumber{
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;

        while (n > 0) {
            sum = sum + fact(n % 10);
            n=n/10;
        }

        if(temp == sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }

    public static int fact(int n) {
        if(n == 0 || n==1 ){
            return 1;
        }
        return n * fact(n-1);
    }
}

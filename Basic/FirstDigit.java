public class FirstDigit{
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(getFirstDigit(n));
    }

    private static int getFirstDigit(int n) {
        int f=0;
        while(n>0){
            f=n%10;
            n=n/10;
        }
        return f;
    }
}
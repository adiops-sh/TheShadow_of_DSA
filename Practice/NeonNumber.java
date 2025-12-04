public class NeonNumber {
    public static void main(String[] args) {
        int n=9;
        int sq = n*n;
        int sum=0;
        while(sq > 0){
            int r = sq %10;
            sum = sum + r;
            sq = sq/10;
        }
        if(n == sum){
            System.out.println(n + " is a Neon Number");
        } else {
            System.out.println(n + " is not a Neon Number");
        }
    }
}

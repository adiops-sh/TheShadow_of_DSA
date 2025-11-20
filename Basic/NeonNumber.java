public class NeonNumber {
    public static void main(String[] args) {
        int n = 9,sum=0;
        int sq = n*n;
        while (sq > 0) {
            sum += sq%10;
            sq=sq/10;
        }
        if(sum == n){
            System.out.println("Given Number is Neon.");
        }else{
            System.out.println("Given Number is NOT Neon.");
        }
    }
}

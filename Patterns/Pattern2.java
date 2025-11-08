public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j==1 || i==n || i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
System.out.println("====================================");
        for (int i=1;i<=n;i++){
            for (int j=n;j>=1;j--){
                if(j==1 || i==n || i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
System.out.println("====================================");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j==1 || i==1 || i+j == n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }
}

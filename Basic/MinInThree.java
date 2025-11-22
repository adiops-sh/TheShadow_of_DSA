public class MinInThree {
      public static void main(String[] args) {
        int a = 10, b = 5, c = 8;
        
        if(a < b && a < c){
            System.out.println("A is smallest");
        } else if(b < c){
            System.out.println("B is smallest");
        } else {
            System.out.println("C is smallest");
        }
    }
}

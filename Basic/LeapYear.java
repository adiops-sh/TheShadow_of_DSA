import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the Year: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n % 400 == 0  || ( n % 4 == 0 && n % 100 != 0 ) ){
            System.out.println(n+" is a Leap Year");

        }else{
            System.out.println(n+" is not a Leap Year");
        }
        sc.close();
    }
}

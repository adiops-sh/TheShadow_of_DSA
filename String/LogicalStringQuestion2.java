import java.util.Scanner;

public class LogicalStringQuestion2 {
    public static void main(String[] args) {
       System.out.println("Enter the Size: ");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int [][] arr = new int[size][size];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = (int)(Math.random()*9)+1;
            }
        }
        for(int [] x : arr){
            for(int x1: x){
                System.out.print(x1+" ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int [] x : arr){
            for(int x1: x){
                System.out.print(x1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

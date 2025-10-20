public class Ques1 {
    public static void main(String[] args) {
        int arr[] ={1,2,300,4,5,8,90};
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>max){
                max=i;
            }
        }
        System.out.println("Largest element of the array is : "+max);
    }
}

public class Ques9 {
    public static void main(String[] args) {
        int n=9;
        int arr[]= {1,2,3,4,5,6,7,9};
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number of the array is: " + missingNumber);
    }

    private static int findMissingNumber(int[] arr, int n) {

        int sumOfArray=0;
        for (int x : arr) {
            sumOfArray+=x;
        }
        return (n*(n+1))/2 - sumOfArray;
    }
}

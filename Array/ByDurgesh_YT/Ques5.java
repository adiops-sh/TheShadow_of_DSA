public class Ques5{
    public static void main(String[] args) {
        int arr[] = {10, 20, 4, 45, 99, 909};

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if(num>largest){
                secLargest=largest;
                largest=num;
            }else if (num > secLargest && num != largest) {
                // update only second largest
                secLargest = num;
            }
        }

        if (secLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element is: " + secLargest);
        }
        
    }
}
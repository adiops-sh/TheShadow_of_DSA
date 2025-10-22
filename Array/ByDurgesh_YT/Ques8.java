public class Ques8 {
    public static void main(String[] args) {
    int arr[] = {1, 2, 2, 3, 3, 4, 5, 5};
        
        int j = 0; // index for unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) { 
                j++;
                arr[j] = arr[i];
            }
        }

        // Print unique elements
        System.out.println("After removing duplicates:");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

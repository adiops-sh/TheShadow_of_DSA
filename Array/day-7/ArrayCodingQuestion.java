/*
161. Assume an array with 10 elements. Insert a new element at the beginning and make total 11 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length + 1];
            newArray[0] = 999;

            for (int i = 0; i < oldArray.length; i++) {
                newArray[i + 1] = oldArray[i];
            }
            System.out.println(Arrays.toString(newArray));

162. Assume an array with 10 elements. Insert a new element at the 2nd place and make total 11 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length + 1];
            newArray[0]=oldArray[0];
            newArray[1] = 999;

            for (int i = 1; i < oldArray.length; i++) {
                newArray[i+1] = oldArray[i];
            }
            System.out.println(Arrays.toString(newArray));

163. Assume an array with 10 elements. Insert a new element at the index number 5 and make total 11 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length + 1];
            newArray[5]=999;

            for (int i = 0; i < oldArray.length; i++) {
                if(i < 5){
                    newArray[i] = oldArray[i]; // 10 20 30 40 50
                }else{
                        newArray[i + 1] = oldArray[i];
                }
                
            }
            System.out.println(Arrays.toString(newArray));

164. Assume an array with 10 elements. Insert a new element at the middle and make total 11 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length + 1];
            int mid = newArray.length/2;
            newArray[mid]=999;

            for (int i = 0; i < oldArray.length; i++) {
                if(i < mid){
                    newArray[i] = oldArray[i];
                }else{
                    newArray[i+1] = oldArray[i];
                }
            
            }
            System.out.println(Arrays.toString(newArray));

165. Assume an array with 10 elements. Insert two elements at the middle and make total 12 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length + 2];
            int mid1 = (newArray.length/2)-1; //5
            int mid2 = newArray.length/2; //6
            newArray[mid1]=888;
            newArray[mid2]=999;

            for (int i = 0; i < oldArray.length; i++) {
                if(i < mid1){
                    newArray[i] = oldArray[i];
                }else{
                    newArray[i+2] = oldArray[i];
                }
            
            }
            System.out.println(Arrays.toString(newArray));

166. Assume an array with 10 elements. Insert two elements at the beginning and make total 12 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length + 2];
            newArray[0]=888;
            newArray[1]=999;

            for (int i = 0; i < oldArray.length; i++) {
                    newArray[i+2] = oldArray[i];
                }
            
            }
            System.out.println(Arrays.toString(newArray));

167. Assume an array with 10 elements. Insert two elements at the index number 7 and make total 12 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length + 2];
            newArray[7]=888;
            newArray[8]=999;

            for (int i = 0; i < oldArray.length; i++) {
                if(i < 7)
                    newArray[i] = oldArray[i];
                }else{
                    newArray[i+2] = oldArray[i];
                }
            
            }
            System.out.println(Arrays.toString(newArray));

168. Assume an array with 10 elements. Remove first element and make a total 9 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length-1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i]=oldArray[i+1];
            }
            System.out.println(Arrays.toString(newArray));

169. Assume an array with 10 elements. Remove last element and make a total 9 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length-1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i]=oldArray[i];
            }
            System.out.println(Arrays.toString(newArray));

170. Assume an array with 10 elements. Remove element at index number 4 and make a total 9 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length-1];
        for (int i = 0; i < newArray.length; i++) {
                if (i < 4) {
                newArray[i] = oldArray[i];
            } else {
                newArray[i] = oldArray[i + 1];  // Shift remaining elements
            }
        }
            System.out.println(Arrays.toString(newArray));

171. Assume an array with 10 elements. Remove element at index number 7 and make a total 9 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length-1];
        for (int i = 0; i < newArray.length; i++) {
                if (i < 7) {
                newArray[i] = oldArray[i];
            } else {
                newArray[i] = oldArray[i + 1];  // Shift remaining elements
            }
        }
            System.out.println(Arrays.toString(newArray));

172. Assume an array with 10 elements. Remove middle two elements and make a total 8 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length-2];
            int mid1 = oldArray.length/2-1; //4
            int mid2 = oldArray.length/2; //5

            for(int i=0;i<newArray.length;i++){
                if(i < mid1){
                    newArray[i]=oldArray[i];
                }else{
                    newArray[i]=oldArray[i+2];
                }
            }
                System.out.println(Arrays.toString(newArray));

173. Assume an array with 10 elements. Remove middle 4 elements and make a total 6 elements.
solution: int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int[] newArray = new int[oldArray.length-4];
            int mid1 = (oldArray.length/2)-2; //3
            int mid2 = (oldArray.length/2)-1; //4
            int mid3 = (oldArray.length/2); //5
            int mid4 = (oldArray.length/2)+1; //6

            for(int i=0;i<newArray.length;i++){
                if(i < mid1){
                    newArray[i]=oldArray[i];
                }else{
                    newArray[i]=oldArray[i+4];
                }
            }
                System.out.println(Arrays.toString(newArray));

174.  Check if an array is a palindrome
solution: int[] arr = {10, 20, 30, 40, 30, 20, 10};
        boolean isPalindrome = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Array is a palindrome");
        } else {
            System.out.println("Array is NOT a palindrome");
        }


175. Write a program to check if elements of an array are same or not while reading from front or back
{10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10}
solution: int arr [] ={10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10}; 
        boolean flag = true;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-i-1]){
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("Same (Array is symmetric)");
        }else{
            System.out.println("Not same (Array is not symmetric)");
        }

176. Find the Missing Number
{2, 4, 8, 16, ?, 64}
solution: int arr[] = {2, 4, 8, 16, -1, 64};
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1] == -1){
                    arr[i+1] = arr[i]*2;
                    break;
                }
            }
                System.out.println(Arrays.toString(arr));
                
177. Find the second largest element in an array without sorting.
solution: public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}

 */

public class ArrayCodingQuestion {
    public static void main(String [] args){
        System.out.println("Happy Coding!");
    }
}

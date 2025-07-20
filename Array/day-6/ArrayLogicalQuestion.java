/*
141. Assume an array with 10 elements. Left shift by one
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int firstEle = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
            arr[arr.length-1]=firstEle;
        System.out.println(Arrays.toString(arr));    

142. Assume an array with 10 elements. Left shift by two
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int firstEle = arr[0];
        int secEle = arr[1];
        for(int i=0;i<arr.length-2;i++){
            arr[i]=arr[i+2];
        }
            arr[arr.length-1]=secEle;
            arr[arr.length-2]=firstEle;
        System.out.println(Arrays.toString(arr));    

143. Assume an array with 10 elements. Left shift by three
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int firstEle = arr[0];
        int secEle = arr[1];
        int thirdEle = arr[2];
        for(int i=0;i<arr.length-3;i++){
            arr[i]=arr[i+3];
        }
            arr[arr.length-1]=thirdEle;
            arr[arr.length-2]=secEle;
            arr[arr.length-3]=firstEle;
        System.out.println(Arrays.toString(arr)); 

144. Assume an array with 10 elements. Left shift by one only in the first half
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int firstEle=arr[0];
        for(int i=0;i<(arr.length/2)-1;i++){
            arr[i]=arr[i+1];
        }
            arr[(arr.length/2)-1]=firstEle;
        System.out.println(Arrays.toString(arr));

145. Assume an array with 10 elements. Left shift by one only in the 2nd half
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int secHalfFristEle=arr[arr.length/2];
            for(int i=arr.length/2;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=secHalfFristEle;
            System.out.println(Arrays.toString(arr));

146. Assume an array with 10 elements. Left shift by two only in the 2nd half
solution:  int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int secHalfFirstEle=arr[arr.length/2];
            int secHalfSecondEle=arr[arr.length/2+1];
            for(int i=arr.length/2;i<arr.length-2;i++){
                arr[i]=arr[i+2];
            }
                arr[arr.length-2]=secHalfFirstEle;
                arr[arr.length-1]=secHalfSecondEle;
            System.out.println(Arrays.toString(arr));

147. Assume an array with 10 elements. Left shift by two only in the first half
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int firstEle=arr[0];
            int secEle=arr[1];
            for(int i=0;i<(arr.length/2)-2;i++){
                arr[i]=arr[i+2];
            }
                arr[(arr.length/2)-2]=firstEle;
                arr[(arr.length/2)-1]=secEle;
            System.out.println(Arrays.toString(arr));

148. Assume an array with 10 elements. Left rotate by one
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int ele=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
                arr[arr.length-1]=ele;
            System.out.println(Arrays.toString(arr));

149. Assume an array with 10 elements. Left rotate by two
solution: int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int ele=arr[0];
            int ele2=arr[1];
            for(int i=0;i<arr.length-2;i++){
                arr[i]=arr[i+2];
            }
                arr[arr.length-2]=ele;
                arr[arr.length-1]=ele2;
            System.out.println(Arrays.toString(arr));

150. Assume an array with 10 elements. Left rotate by three
solution:int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            int ele=arr[0];
            int ele2=arr[1];
            int ele3=arr[2];
            for(int i=0;i<arr.length-3;i++){
                arr[i]=arr[i+3];
            }
                arr[arr.length-3]=ele;
                arr[arr.length-2]=ele2;
                arr[arr.length-1]=ele3;
            System.out.println(Arrays.toString(arr));

151. Assume an array with 10 elements. right shift by one
solution:

152. Assume an array with 10 elements. rightshift by two
solution:

153. Assume an array with 10 elements. rightshift by three
solution:

154. Assume an array with 10 elements. rightshift by one only in the first half
solution:

155. Assume an array with 10 elements. rightshift by one only in the 2nd half
solution:

156. Assume an array with 10 elements. rightshift by two only in the 2nd half
solution:

 */

public class ArrayLogicalQuestion {
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
    }
}

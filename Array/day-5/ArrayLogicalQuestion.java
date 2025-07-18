/*
121. Define an array with 11 accommodations. Store 25 in the middle.
solution: int arr[] =  new int [11];
    arr[5]=25;
    System.out.println(Arrays.toString(arr));

122. Define an array with 10 accommodations. Store 25 and 200 in the middle.
solution: int arr[] =  new int [10];
    arr[4]=25;
    arr[5]=200;
    System.out.println(Arrays.toString(arr));

123. Assume these are the elements in the array.
{10, 20, 30, 400, 500, 110, 540}
Try swapping first two elements and make an array as
{20, 10, 30, 400, 500, 110, 540}
Solution: int arr [] = {10, 20, 30, 400, 500, 110, 540};
    int t = arr[0];
    arr[0]=arr[1];
    arr[1]=t;
    System.out.println(Arrays.toString(arr));

124. Assume these are the elements in the array.
{10, 20, 30, 400, 500, 110, 540}
Try swapping first element with 3rd elements and make an array as
{30, 20, 10, 400, 500, 110, 540}
Solution: int arr [] = {10, 20, 30, 400, 500, 110, 540};
    int t = arr[0];
    arr[0]=arr[2];
    arr[2]=t;
    System.out.println(Arrays.toString(arr));

125. Assume these are the elements in the array.
{10, 20, 30, 400, 500, 110, 540}
Try swapping first element with 4th elements and make an array as
{400, 20, 30, 10, 500, 110, 540}
Solution: int arr [] = {10, 20, 30, 400, 500, 110, 540};
    int t = arr[0];
    arr[0]=arr[3];
    arr[3]=t;
    System.out.println(Arrays.toString(arr));

126. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try swapping first element with 5th element and make an array as
{500, 20, 30, 400, 10, 110, 540}
Solution: int arr [] = {10, 20, 30, 400, 500, 110, 540};
    int t = arr[0];
    arr[0]=arr[4];
    arr[4]=t;
    System.out.println(Arrays.toString(arr));

127. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try swapping last element with 4th element and make an array as
{10, 20, 30, 540, 500, 110, 400}
solution: int arr [] = {10, 20, 30, 400, 500, 110, 540};
    int t = arr[arr.length-1];
    arr[arr.length-1]=arr[3];
    arr[3]=t;
    System.out.println(Arrays.toString(arr));

128. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try swapping first element with last element and make an array as
{540, 20, 30, 400, 500, 110, 10}
solution: int arr [] = {10, 20, 30, 400, 500, 110, 540};
    int t = arr[0];
    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=t;
    System.out.println(Arrays.toString(arr));

129. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try multiplying every element with 10
solution: int arr[] = {10, 20, 30, 400, 500, 110, 540};
    for(int x:arr){
        System.out.print(x*10+" ");
    }

130. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try adding every element with 10
solution: int arr[] = {10, 20, 30, 400, 500, 110, 540};
    for(int x:arr){
        System.out.print(x+10+" ");
    }

131. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try replacing current element with sum of prev two elements
132. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try replacing current element with sum of next two elements
133. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try replacing current element with difference of prev two elements
134. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try replacing current element with differenceof next two elements
135. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try replacing every element by reducing 1 unit
136. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540}
Try replacing every element by increasing 1 unit
137. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540, 90}
Try replacing every element by increasing 1 unit in the first half and replacing every element by reducing one unit
138. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540, 90}
Try replacing middle elements with a first element
139. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540, 90}
Try replacing middle elements with a last element
140. Assume these are the element in the array.
{10, 20, 30, 400, 500, 110, 540, 90}
Try replacing middle elements with a sum of first last element    

 */

public class ArrayLogicalQuestion {
    public static void main(String[] args) {
        System.out.println("Happy Coding!");
    }
}

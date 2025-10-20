public class Ques4 {
    public static void main(String[] args) {
        int [] arr={10,30,20,20,50,30,50,60,30};
        int target = 10;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println("Occurence of  the target ele is :"+ count);

    }
}

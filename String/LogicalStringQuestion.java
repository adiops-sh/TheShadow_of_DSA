
/*
1. Find out the total number of characters in the given string?
solution: String str = "Elon musk";
            System.out.println(str.length());

2. Print the first char from the given string?
solution: String str = "Elon musk";
            if(!str.isEmpty()){
                System.out.println(str.charAt(0));
            }else{
                System.out.println("String is empty");
            }

3. Print the 2nd char from the given string?
solution: String str = "Elon musk";
            if((!str.isEmpty()) && (str.length()>= 2)){
                System.out.println(str.charAt(1));
            }else{
                System.out.println("String is too short");
            }

4. Print the 3rd char from the given string?
solution: String str = "Elon musk";
            if((!str.isEmpty()) && (str.length()>= 3)){
                System.out.println(str.charAt(2));
            }else{
                System.out.println("String is too short");
            }

5. Print the last char from the given string?
solution:   String str = "Elon musk";
            System.out.println(str.charAt(str.length()-1));
            
6. Print the last 2nd char from the given string?
solution: String str = "Elon musk";
            if (str.length() >= 2) {
                System.out.println(str.charAt(str.length() - 2));
            } else {
                System.out.println("String is too short");
            }

7. Find out the index of ‘G’ from the given string?
solution: String str = "Elon Musk";
        int index = str.indexOf('G');

        if(index != -1){
            System.out.println("'G' found at index: " + index);
        } else {
            System.out.println("'G' not found in the string.");
        }

8. Find out the index of ‘K’ from the given string?
solution: String str = "Elon Musk";
        int index = str.indexOf('K');

        if(index != -1){
            System.out.println("'K' found at index: " + index);
        } else {
            System.out.println("'K' not found in the string.");
        }

9. Find out the index of ‘E’ from the given string?
solution: String str = "Elon Musk";
        int index = str.indexOf('E');

        if(index != -1){
            System.out.println("'E' found at index: " + index);
        } else {
            System.out.println("'E' not found in the string.");
        }

10. Find out the index of first space?
solution: String str = "Elon Musk";
        int index = str.indexOf(' ');  // space character

        if(index != -1){
            System.out.println("First space found at index: " + index);
        } else {
            System.out.println("No space found in the string.");
        }

11. Find out the index of last space?
solution: String str = "Elon Musk";
        int index = str.lastIndexOf(' ');  // last space

        if(index != -1){
            System.out.println("Last space found at index: " + index);
        } else {
            System.out.println("No space found in the string.");
        }

12. Find out the index of ‘M’ from the given string?
solution: String str = "Elon Musk";
        int index = str.indexOf('M');  // last space

        if(index != -1){
            System.out.println("Last space found at index: " + index);
        } else {
            System.out.println("No space found in the string.");
        }
    
13. Print the first 10 characters through a for loop?
solution: String str = "Elon Musk Tesla";
            for(char i= 0; i<str.length();i++){
                    System.out.print(str.charAt(i)+" ");
            }

14. Print the first 10 characters through a while loop?        
solution: String str = "Elon Musk Tesla";
                int i = 0;
            while(i<str.length()){
                System.out.print(str.charAt(i)+" ");
                i++;
            }

15. Print the first 10 characters through a do while loop?
solution: String str = "Elon Musk Tesla";
            int i=0;
            do{
                System.out.print(str.charAt(i)+" ");
                i++;
            }while(i<10)
 */

public class LogicalStringQuestion {
    public static void main(String [] args){
        System.out.println("Happy Coding!");

    }
}

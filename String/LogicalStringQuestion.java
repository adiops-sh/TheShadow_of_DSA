
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
            }while(i<10);

16. Print the first 10 characters through a for loop but except white spaced?
solution:   String str = "Elon Musk Tesla";
            int count =0;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i) != ' '){
                        System.out.print(str.charAt(i)+" ");
                        count++;
                    }
                        if(count==10){
                            break;
                        }
                }


17. Print the first 10 characters through a while loop but except white spaced?
solution:  String str = "Elon Musk Tesla";
            int count = 0;
            int i=0;
            while(i<str.length()){
                if(str.charAt(i) != ' '){
                    System.out.print(str.charAt(i)+" ");
                        count++;
                        if(count==10){
                            break;
                        }
                }
                    i++;
            }


18. Print the first 10 characters through a do while loop but except white spaced?
solution:  String str = "Elon Musk Tesla";
            int i=0;
            int count = 0;
            do{
                if(str.charAt(i) != ' '){
                    System.out.print(str.charAt(i)+" ");
                        count++;
                        if(count==10){
                            break;
                        }
                }
                        i++;
            }while(i<str.length());


19. Print all the characters through a for loop?
solution:  String str = "Elon Musk Tesla";
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i)+" ");
            }


20. Print all the characters through a while loop? 
solution:  String str = "Elon Musk Tesla";
            int i=0;
            while(i<str.length()){
                System.out.print(str.charAt(i)+" ");
                i++;
            }

21. Print all the characters through a do-while loop?
solution:   String str = "Elon Musk Tesla";
            int i=0;
            do{
                System.out.print(str.charAt(i)+" ");
                i++;
            }while(i<str.length());

22. Print the last 10 characters through a while loop?
solution:  String str = "Elon Musk Tesla";
            int i=str.length()-10;
            while(i<str.length()){
                System.out.print(str.charAt(i) + " ");
                i++;
            }

23. Print the last 10 characters through a do while loop?
solution:  String str = "Elon Musk Tesla";
            int i=str.length()-10;
            do{
                System.out.print(str.charAt(i) + " ");
                i++;
            }while(i<str.length());

24. Print the last 10 characters through a for loop?
solution:  String str = "Elon Musk Tesla";
            for (int i = str.length() - 10; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }

25. Print all the characters in the reverse order through a for loop?
solution:  String str = "Elon Musk Tesla";
            for(int i=str.length()-1; i>=0;i--){
                System.out.print(str.charAt(i)+" ");
            }

26. Print all the characters in the reverse order through a while loop?
solution: String str = "Elon Musk Tesla";
            int i=str.length()-1;
            while(i>=0){
                System.out.print(str.charAt(i)+" "); 
                i--; 
            }

27. Print all the characters in the reverse order through a do-while loop?
solution: String str = "Elon Musk Tesla";
            int i=str.length()-1; 
            do{
                System.out.print(str.charAt(i)+" "); 
                i--;
            }while(i>=0);

28. Print the last 10 characters in the reverse order through a while loop?
solution: String str = "Elon Musk Tesla";
            int i=str.length()-1;
            int count=0;
            while(i>=0){
                System.out.print(str.charAt(i)+" "); 
                count++;
                i--;
                if(count==10){
                    break;
                }
            }

29. Print the last 10 characters in the reverse order through a do while loop?
solution: String str = "Elon Musk Tesla";
            int i=str.length()-1;
            int count=0;
            do{
                System.out.print(str.charAt(i)+" "); 
                count++;
                i--;
                if(count==10){
                    break;
                }
            }while(i>=0);

30. Print the last 10 characters in the reverse order through a for loop?
solution:  String str = "Elon Musk Tesla Infinite";
            int count=0;
            for(int i=str.length()-1;i>=0;i--){
                System.out.print(str.charAt(i)+" ");
                count++;
                if(count==10){
                    break;
                } 
            }

31. Print the 12th index to 3rd index characters through a while loop?
solution: String str = "ElonMuskTeslaInfinite";
            int i=12;
            while(i>=3){
                System.out.print(str.charAt(i)+" ");
                i--;
            }

32. Print the 12th index to 3rd index characters through a do-while loop?
solution: String str = "ElonMuskTeslaInfinite";
            int i=12;
            do{
                System.out.print(str.charAt(i)+" ");
                i--;
            }while(i>=3);

33. Print the 12th index to 3rd index characters through a for loop?
solution: String str = "ElonMuskTeslaInfinite";
            for(int i=12;i>=3;i--){
                System.out.print(str.charAt(i)+" ");
            }

34. Write a program to count the number of vowels in a given string.
solution: public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

        
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }
        String input = "Hello World";
        int result = countVowels(input);
        System.out.println("Number of vowels: " + result);
 */

public class LogicalStringQuestion {
    public static void main(String [] args){
        System.out.println("Happy Coding!");
        
    }
}

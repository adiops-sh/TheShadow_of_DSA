
/* 
Question 1: Reverse a String
    Solution: String s = "Aaditya";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }

Question 2: write a program to  change string to uppercase.
solution:   String s = "Aaditya";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
                if(ch >='a' && ch<='z'){
                    ch = (char)(ch-32);
                }
                System.out.print(ch);
        }

Question 3: write a program to  change string to LowerCase.
solution:  String s = "AadItYa";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
                if(ch >='A' && ch<='Z'){
                    ch = (char)(ch+32);
                }
                System.out.print(ch);
        }  
Question 4: write a program to count number of digits, alphabets and special characters in a string.  
solution: String s = "AadItY63192^&)%#a"; 
        int num=0, alpha=0, specialChar=0;  
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if( ch >='A' && ch<='Z' || ch >='a' && ch<='z'){
                alpha++;
            }
            else if(ch >='0' && ch<='9'){
                num++;
            }
            else{
                specialChar++;
            }
        }
        System.out.println(num+" "+alpha+" "+specialChar);

Question 5: write a program to remove Duplicate.
solution:   String s = "AadItYa";
            String temp ="";
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(!temp.contains(ch+"")){
                temp+=ch;
            }
        }
    System.out.println(temp);

Question 5: write a program to reverse the sentence.
solution: String s = "welcome aditya gupta";
            String [] s1= s.split(" ");
            String temp ="";
        for(int i=s1.length-1;i>=0;i--){
            temp+=s1[i]+" ";
        }
        temp = temp.trim();
        System.out.println(temp);

Question 6: string is palindrome or not.    
solution: String s = "naman";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != s.charAt(s.length()-1-i)){
                System.out.println("not palinderome");
                return;          
            }else{
                System.out.println("palindrome");
                return;
            }
        } 
Question 7: Count Words in a String.
solution: String s = "Aadi loves Java";
        String words[] = s.trim().split("\\s+");
        System.out.println("Words: " + words.length);               
*/
public class levelOne {
    public static void main(String[] args) {
     System.out.println("Hello World!");   
    }
}

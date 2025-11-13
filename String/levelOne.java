
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
String s = "AadItY63192^&)%#a"; 
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


*/
public class levelOne {
    public static void main(String[] args) {
        
    }
}

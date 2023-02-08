package ReplitAssign;

public class Assignment99 {
    /* Write code that will take in a String input and check to see if it is a palindrome or not.
A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
Examples of palindromes:
- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star
Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
Your program will print out "true" if it's a palindrome and "false" if not.  */

    public static void main(String[] args) {
        String str="bob";
        //for (int i = str.length()-1; i >=0; i--) {
          //  System.out.print(str.charAt(i));
String str1="Bob";
boolean palindrome;
palindrome=str.equalsIgnoreCase(str1);
            System.out.println(palindrome);

        }

      //  System.out.println();
       // StringBuilder str1=new StringBuilder("never odd");
       // System.out.println(str1.reverse());
       // System.out.println();
       // StringBuilder str2= new StringBuilder("tac a was I");
      //  System.out.println(str2.reverse());
    }




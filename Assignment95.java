package ReplitAssign;

import java.util.Scanner;

public class Assignment95 {
    /* Using Scanner class input string value.

Print out the following: "The first 3 letters of \_\_\_ is ___"
For example, if the input is "banana", your output should be:
"The first 3 letters of banana is ban". */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please give the word");
        String word= scan.next();
        System.out.println(word.substring(0,3));
    }
}

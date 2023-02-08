package ReplitAssign;

import java.util.Scanner;

public class Assignment96 {
    /* You have Scanner class to input string value.
If language is Java it should print the: "Java is a programming language".
If language is C it should print the:"C is a procedural programming language"
If language is C++ it should print the:"C++ is a middle-level programming language"
If any other should print:"Doesn't match any programming language"
 */

    public static void main(String[] args) {

        String l1="";
        l1="Java is a programming language";
        String l2="";
        l2="C is a procedural programming language";

        String l3="";
        l3="C++ is a middle-level programming language";
        Scanner scan=new Scanner(System.in);
        System.out.println(" Please enter the language");
        String language= scan.nextLine();
        if(language.contentEquals("Java")) {
            System.out.println(l1);
        } else if (language.contentEquals("C")) {
            System.out.println(l2);
        } else if (language.contentEquals("C++")) {
            System.out.println(l3);
        }else{
            System.out.println("entry doesn't matach any language");

        }

    }


    }



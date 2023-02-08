package ReplitAssign;

public class Assignment101 {

    public static void main(String[] args) {
        /*  Inputs:
String word;
```Write a for loop that will print out every other letter in a String,
starting with the first letter.
These letters should be printed all on one line with no space in between.
Sample input/outputs
In: hello
hlo
In: SSyynnttaaxxTTeecchhnnoollooggiieess
SyntaxTechnologies
``` */
String str="SSyynnttaaxxTTeecchhnnoollooggiieess";
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                System.out.print(str.charAt(i));
            }

        }

    }
}

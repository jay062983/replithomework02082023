package ReplitAssign;

public class Assignment102 {
    public static void main(String[] args) {
        /*  Inputs:String word;
```Write a for loop that will loop through every character of a word and print out each character, each on a separate line
Sample inputs/outputs:
In: hello
h
e
l
l
o
In: zimbabwe
z
i
m
b
a
b
w
e*/

  String word="hello";
  String word2="zimbabwe";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));

        }

    }
}

package ReplitAssign;

public class Assignment100 {

    public static void main(String[] args) {
        /*  Given the following inputs:
String s;
```Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam
`In: processor
rossecorp
In: racecar
racecar
```  */

        String str = "manhattan";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
          System.out.println();
         StringBuilder str1=new StringBuilder("processor");
         System.out.println(str1.reverse());
         System.out.println();
         StringBuilder str2= new StringBuilder("racecar");
         System.out.println(str2.reverse());
    }
}

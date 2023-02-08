package ReplitAssign;

import java.util.Scanner;

public class Assign104 {
    /*   Create an array of names that will hold 5 String elements.

Names must be taking from a user.

Print out the first three characters of each element of the array, one per line.

Note: every array element must be at least 3 characters long.

Input Example:

John

Jane

Jimmy

Mike

Emily

```
Expected Output:
```

**Joh**

**Jan**

**Jim**

**Mik**

**Emi** */
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
        System.out.println("please enter 5 names");
        String[]names=new String[5];
        names[0]= scan.next();
        names[1]= scan.next();
        names[2]= scan.next();
        names[3]= scan.next();
        names[4]= scan.next();
        for(String name:names)
        System.out.println(name.substring(0,3));
    }
}

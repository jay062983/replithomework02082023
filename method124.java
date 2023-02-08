package ReplitAssign;

public class method124 {

    /*  Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
**Expected Output:**
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
```*/
public String name;

public method124(String Schoolname){
    name=Schoolname;
    System.out.println(name);


}

    public static void main(String[] args) {
        method124 MT124=new method124("Syntax Technologies");

    }
void schoolName(String name){
    System.out.println(name);
}
}

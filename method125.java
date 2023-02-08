package ReplitAssign;

public class method125 {
    /*
Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
Print out **number** using class name and using instance
**Expected Output:**
200
200
*/

static int a=200;
void num(){
    System.out.println(a);
}

}
class methods125{
    public static void main(String[] args) {
        method125 MT125=new method125();
        method125 MT1255=new method125();
        MT125.num();
        method125.a=200;
        MT1255.num();
    }
}
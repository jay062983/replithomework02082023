package ReplitAssign;

public class Assign107 {
    /*  How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"
Expected Output: sdneirF olleH*/

    public static void main(String[] args) {
        StringBuilder strB=new StringBuilder("Hello Friends");
        strB.reverse();
        System.out.println(strB);
    }
}

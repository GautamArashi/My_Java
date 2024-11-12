import java.util.*;
/*
A unary operator is an operator that takes only one operand and does not have any side effects or affect the program's behavior externally
 */
public class Unary{
    public static void main(String[] args){
    //    int a = 10;
    //    int b = a++;
    //    int c = ++a;
    int a = 10;
       int b = a--;
       int c = --a;
       System.out.println("Value of a  " + a);
       System.out.println("Value of b: " + b);
       System.out.println("Value of c: " + c);
}
};
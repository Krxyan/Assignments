//this application displays some math facts
 //import package
public class DebugThree2
{
public static void main(String[] arg) //[] must be used with datatype
{
int a=2, b=5, c=10;
add(a,b);
add(b,c);
subtract(c,a);
}
public static void add(int a,int b) //datatype for all variables must be specified
{
System.out.println("The sum of "+a+" and "+b+" is " +(a+b));//in single-line
}
public static void subtract(int a,int b)
{
System.out.println("The dierence between "+a+" and "+b+" is " +(a-b));
//formula is a-b
}
}

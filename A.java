import java.lang.*;
import java.math.*;
class A
{
public void show()throws Exception
{
System.out.println("parent class");
}
}
class B extends A
{
public void show()throws Exception
{
System.out.println("child class");
}
public static void main(String args[])
{
try
{
B b=new B();
b.show();
}
catch(Exception e)
{
System.out.println("hai");
}
}
}

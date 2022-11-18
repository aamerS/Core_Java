class Parent
{
    void m1()
    {
        System.out.println("I am in m1 method of Parent");
    }
}

class Child extends Parent
{
 void m1()
 {
     System.out.println("I am in m1 method of Child");
 }
}

public class Inheritance
{
   public static void main(String[] args) 
   {
    Child ob=new Child();
    ob.m1();   
   } 
}

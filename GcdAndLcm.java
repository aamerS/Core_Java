import java.util.*;

public class Gcd 
{
   public static void main(String[] args)
   {

    int n1,n2,t1,t2,gcd,lcm;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers");
    n1=sc.nextInt();
    n2=sc.nextInt();
    t1=n1; 
    t2=n2;
    while(n1 != n2)
    {
        if(n1>n2)
        {
            n1=n1-n2;
        }
        else
        {
            n2=n2-n1;
        }
    }
    gcd=n1;
    lcm=t1*t2/gcd;
    
    System.out.println("GCD= "+gcd+"\nLCM= "+lcm);
   } 
}

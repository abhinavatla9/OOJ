import java.util.*;
class ClassDemo 
{
   public static void main(String args[])   
   {   
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the radius:");
       double rad= s.nextDouble();      
       double  a=area(rad);
       double  p=peri(rad);
       System.out.println("\n\n\n--------- THE DETAILS ARE AS FOLLOWS ---------");
       System.out.println("\nThe radius of circle is: " + rad);
       System.out.println("\nArea of Circle is: " + a); 
       System.out.println("\nCircumference of Circle is: " + p);      
    }
    static double area(double r)
    {
       return (22*r*r)/7;
    }
    static double peri(double r)
    {
       return (2*22*r)/7;
    }
}
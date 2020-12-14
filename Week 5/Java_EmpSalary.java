import java.util.*;
class Employee
{
  public static double empgross;
  public static String empname;
  public static String empid;
  public static double da;
  public static double hra;
  public static double it;
  public static double basic;
  public static int toth;
  public static int oth;
  Scanner in = new Scanner (System.in);
  void accept ()
  {
    System.out.println ("Enter details");
    System.out.println ("Name: ");
    empname = in.next ();
    System.out.println ("ID:");
    empid = in.next ();
    System.out.println ("Basic salary in Rs.");
    basic = in.nextDouble ();
    System.out.println ("DA HRA and IT in %");
    da = in.nextDouble ();
    hra = in.nextDouble ();
    it = in.nextDouble ();
    System.out.println ("Enter the total no of hours worked including OT");
    toth = in.nextInt ();
    System.out.println ("OT hours");
    oth = in.nextInt ();
  }
  void gross ()
  {
    empgross = basic * (da + hra - it + 100) / 100;
  }
  void calculation ()
  {
    empgross = empgross + (oth * 100);
    if (toth >= 200)
      {
	empgross = empgross + ((toth - 200) * 100);
      }
    else
      {
	empgross = empgross - ((200 - toth) * 100);
      }
    display ();
  }
  void display ()
  {
    System.out.println ("Name: " + empname);
    System.out.println ("Gross Salary: Rs." + empgross);
  }
}

class Main
{
  public static void main (String[]args)
  {
    Employee e1 = new Employee ();
      e1.accept ();
      e1.gross ();
      e1.calculation ();
  }
}
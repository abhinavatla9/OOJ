import java.util.*;
class Age
{
  public String name;
  public int years;
  public int months;
  Scanner in = new Scanner (System.in);
  void accept ()
  {
    System.out.println ("Enter name");
    name = in.nextLine ();
    System.out.println ("Enter the age in years and months");
    years = in.nextInt ();
    months = in.nextInt ();
    System.out.println ("----------------");
  }
}
class Main
{
  public static void main (String args[])
  {
    Age p1 = new Age ();
    Age p2 = new Age ();
      p1.accept ();
      p2.accept ();
    if (p1.years > p2.years)
        System.out.println (p1.name + " is elder than " + p2.name);
    else if (p1.years == p2.years)
      {
	if (p1.months > p2.months)
	  System.out.println (p1.name + " is elder than " + p2.name);
	else if (p1.months == p2.months)
	  System.out.println (p1.name + " and " + p2.name +
			      " are of same age");
	else
	  System.out.println (p2.name + " is elder than " + p1.name);
      }
    else
        System.out.println (p2.name + " is elder than " + p1.name);
  }
}
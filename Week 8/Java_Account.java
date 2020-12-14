import java.util.Scanner;

abstract class Account
{
  String cName, accType;
  long accNo;
  double bal;
  final double minBal = 1000.0;
  Account (String cName, long accNo, double bal, String  accType)
  {
    this.accNo = accNo;
    this.cName = cName;
    this.bal = bal;
    this.accType = accType;
  } 
  abstract void addBal (double amt);
  abstract void dispBal ();
  abstract void withBal (double amt);
} 
class Curr_acct extends Account
{
  Curr_acct (String cName, long accNo, double bal)
  {
    super (cName, accNo, bal, "Current");
    System.out.println ("name: " + cName + "\taccno: " + accNo +"\tbal: " + bal + "\ttype: " + accType);
  } 
  void addBal (double amt)
  {
    this.bal += amt;
  } 
  void dispBal ()
  {
    System.out.println ("Your balance is: " + this.bal);
  } 
  void withBal (double amt)
  {
    if (this.bal == 0 || amt > this.bal)
      {
      System.out.println ("withdrawal not possible");
      }
    else
      {
	    this.bal -= amt;
	    checkBal ();
      }
  }
  void checkBal ()
  {
    if (this.bal < minBal)
      {
	    this.bal -= this.bal * 0.02;
      }
  }
}

class Sav_acct extends Account
{
  Sav_acct (String cName, long accNo, double bal)
  {
    super (cName, accNo, bal, "Savings");
    System.out.println ("name: " + cName + "\taccno: " + accNo +"\tbal: " + bal + "\ttype: " + accType);
  } 
  void addBal (double amt)
  {
    this.bal += amt;
    addIntr ();
  } 
  void addIntr ()
  {
    this.bal += this.bal * 0.07;
  } 
  void dispBal ()
  {
    System.out.println ("Your balance is: " + this.bal);
  } 
  void withBal (double amt)
  {
    if (this.bal == 0 || amt > this.bal)
      {
      System.out.println ("withdrawal not possible");
      }
    else
      {
      this.bal -= amt;
      }
  }
}

class Account_test
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Double amt;
    int flag = 0;
    while (flag == 0)
      {
      System.out.println ("1:Current acc.\n2:Savings acc.\ndefault:exit");
      int ch = sc.nextInt ();
      String nam;
      long acno;
      double balan;
      switch (ch)
      {
      case 1:
	      System.out.println ("Enter name, acc no, initial balance in order:");
	      nam = sc.next ();
	      acno = sc.nextLong ();
	      balan = sc.nextDouble ();
	      Curr_acct c = new Curr_acct (nam, acno, balan);
	      System.out.println ("\nCurrent_acct\n");
	      int flag1 = 0;
	      while (flag1 == 0)
	      {
        System.out.println ("1:Addamount\n2:displayBalance\n3:withdraw\ndefault:exit");
		    int ch1 = sc.nextInt ();
		    switch (ch1)
        {
        case 1:
          System.out.println ("enter amt to be added:");
		      amt = sc.nextDouble ();
		      c.addBal (amt);
		      break;
		    case 2:
		      c.dispBal ();
		      break;
		    case 3:
		      System.out.println ("enter amt to be withdrawn:");
		      amt = sc.nextDouble ();
		      c.withBal (amt);
		      break;
		    default:
		      flag1 = 1;
          }
	      }
	    break;
	  case 2:
	    System.out.println ("\nSavings_acct\n");
	    System.out.println ("Enter name, acc no, initial balance in order:");
	    nam = sc.next ();
	    acno = sc.nextLong ();
	    balan = sc.nextDouble ();
	    Sav_acct s = new Sav_acct (nam, acno, balan);
	    int flag2 = 0;
	    while (flag2 == 0)
	     {
        System.out.println ("1:AddBal\n2:displayBal\n3:withdraw\ndefault:exit");
		    int ch2 = sc.nextInt ();
		    switch (ch2)
        {
        case 1:
		      System.out.println ("enter amt to be added:");
		      amt = sc.nextDouble ();
		      s.addBal (amt);
		      break;
		    case 2:
		      s.dispBal ();
		      break;
		    case 3:
		      System.out.println ("enter amt to be withdrawn:");
		      amt = sc.nextDouble ();
		      s.withBal (amt);
		      break;
		    default:
		      flag2 = 1;
          }
	      }
	      break;
	  default:
	    flag = 1;
      }
    }
  }
}
©
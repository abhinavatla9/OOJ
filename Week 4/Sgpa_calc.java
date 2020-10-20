import java.util.*;
class student
{
String usn,name;
static int credits[];
static double marks[];
void input(int n)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Usn and Name ");
  usn=sc.nextLine();
  name=sc.nextLine();
  System.out.println("Enter marks and credits");
for(int i=0;i<n;i++)
{
  marks[i]=sc.nextDouble();
  credits[i]=sc.nextInt();
  System.out.println();
}
}
double calculate(int n)
{
  int c,cred=0;
  double tot,total=0.0;
  for(int i=0;i<n;i++)
{
tot=marks[i];
if(tot>=90) 
            c=10;
            else if(tot>=80)
            c=9;
            else if(tot>=70)
            c=8;
            else if(tot>=60)
            c=7;
            else if(tot>=50)
            c=6;
            else if(tot>=40)
c=4;
   else
c=0;
   total=total+(c*credits[i]);
cred=cred+credits[i];
}
total=total/cred;
return(total);
}
void display(int n,double total)
{
  System.out.println("Student Name : "+name);
  System.out.println("Student USN : "+usn);
  System.out.println("Marks of the Student with Credits");
for(int i=0;i<n;i++)
{
  System.out.println(marks[i]+"   "+credits[i]);
}
  System.out.println("SGPA: "+total);
}
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  student obj=new student();
  System.out.println("Number of Credits: ");
  int n=sc.nextInt();
  credits=new int[n];
  marks=new double[n];
  obj.input(n);
  double total=obj.calculate(n);
  obj.display(n,total);
}
}

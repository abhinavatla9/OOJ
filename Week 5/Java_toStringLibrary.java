import java.util.Scanner;
class Library
{
    private String title;
    private String author;
    private double price;
    private int nop;
    Library()
    {
        title=null;
        author=null;
         price=0.0;
         nop=0;
    }
    void getdetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Title of the Book: ");
        title=s.next();      
        System.out.println("Author of the Book: ");
        author=s.next();
        System.out.println("Price of the Book: ");
        price=s.nextDouble();
        System.out.println("No.of Pages: ");
        nop=s.nextInt();
    }
     public String toString()
    {
        return("Title of the Book:"+title+"   "+"Author:"+author+"   "+"Price: "+price+"    "+" Number of Pages:"+nop);
}
}
class Bookmain
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the No.of Books:");
        int n=ss.nextInt();
        Library b[]=new Library[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Details: "+(i+1));
            b[i]=new Library();
            b[i].getdetails();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Details: "+(i+1));
            System.out.println(b[i]);        
        }
}
}

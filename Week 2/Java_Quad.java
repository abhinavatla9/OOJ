import java.util.Scanner;
class quadratic
{
	public static void main(String args[]){
	 Scanner ss = new Scanner(System.in);

	 System.out.println("Enter the value of A");
	 double a = ss.nextDouble();

	 System.out.println("Enter the value of B");
	 double b = ss.nextDouble();

	 System.out.println("Enter the value of c");
	 double c = ss.nextDouble();

	   double det, r1, r2;
        det = (b*b) - (4*a*c);
        if(det<0) {
             System.out.println("No Real Roots");
            System.exit(0);
			}
         System.out.println("The Roots are Real");{
         r1= ((-b) + Math.sqrt(det))/(2*a);
         r2 = ((-b) - Math.sqrt(det))/(2*a);

         System.out.println("The Solutions of the Quadratic Equaltion are : \n"+r1+"\n"+r2);
		 }


     }
}

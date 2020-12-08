class Thread11 implements Runnable
{ Thread t;
   Thread11()
   {
     t=new Thread(this, "NThread");
	   t.start();
   }
   public void run()
   {
	   try
	   {
		   for(int n=5;n>0;n--)
		   {
			 System.out.println("CSE");
			 Thread.sleep(2000);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("CSE Thread Interrupted");
	   }
	   System.out.println("CSE Thread quitting");
   }
}
class Thread11Main
{
	public static void main(String args[])
	{
		Thread11 t1=new Thread11();
		try
		{
			for(int n=5;n>0;n--)
			{
				System.out.println("BMS College Of Engineering");
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("BMSCE Thread interrupted");
		}
		System.out.println("BMSCE Thread quitting");
	}
}
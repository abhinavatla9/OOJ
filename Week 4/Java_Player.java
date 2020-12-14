import java.util.*;

class Player
{
	int id, no_matches_played;
	int[] scores;
	String name;
	Player(String na, int i, int n, int[] s)
	{
		name = na;
		id = i;
		no_matches_played = n;
		scores = s;
	}
	Player()
	{
		name=null;
		id=0;
		no_matches_played = 0;
	}

	double avg()
	{
		int score=0;
		for(int i=0;i<no_matches_played; i++)
			score += scores[i];
		double avg_score = (score*1.0)/no_matches_played;
		return avg_score;
	}

	void display()
	{
		System.out.println("Name:	"+name);
		System.out.println("I.D. :	"+id);
		System.out.println("No. of Matches played:	"+no_matches_played);
		System.out.print("Scores:	");
		for(int i=0;i<no_matches_played;i++)
			System.out.print(scores[i]+" ");
	}
}
class player
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name of player");
		String na = sn.nextLine();
		System.out.println("Enter the ID");
		int id = sn.nextInt();
		System.out.println("Enter the Number of matches played");
		int n = sn.nextInt();
		System.out.println("Enter the scores");
		int[] s = new int[n];
		for(int i =0;i<n;i++)
			s[i] = sn.nextInt();
		Player p1 = new Player(na, id, n, s);
		double a1 = p1.avg();
		na = sn.nextLine();
		System.out.println("Enter the name of player");
		na = sn.nextLine();
		System.out.println("Enter the ID");
		id = sn.nextInt();
		System.out.println("Enter the Number of matches played");
		n = sn.nextInt();
		int[] si = new int[n];
		System.out.println("Enter the scores");
		for(int i =0;i<n;i++)
			si[i] = sn.nextInt();
		Player p2 = new Player(na, id, n, si);
		double a2 = p2.avg();
		if(a1>a2)
			p1.display();
		else
			p2.display();
	}
}
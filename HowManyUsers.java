import java.util.Scanner;
public class HowManyUsers {
	String howmanyusers;
	public int players;
		Scanner users =new Scanner(System.in);
			public int used () {
				System.out.println("Will there be 1 or 2 users playing the game?");
				do{
					howmanyusers= users.next();
					if(howmanyusers.equals("1"))
					{
						players=1;
					}
					else if(howmanyusers.equals("2"))
					{
						players=2;
					}
					else
					{
						players=3;
					}
				}
				while (players==(3));
				return players;
		}	
}
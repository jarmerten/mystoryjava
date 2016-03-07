import java.util.Scanner;
import java.util.Random;
public class cards 
{
public static void main(String args[]) {
	
			HowManyUsers user = new HowManyUsers();
			user.used();
			int playersused=user.players;
	
				Person introduction = new Person();
				introduction.speak();
				
			FindsCardInTwentyOne playerhand = new FindsCardInTwentyOne();
			playerhand.yourHand();
			int howcloseto21= playerhand.firstrandom;
	
	if(playersused==1)
	{
	}
	else
	{	
		System.out.println("Its your turn to go Player 2.");
		FindsCardInTwentyOne player2hand = new FindsCardInTwentyOne();
		player2hand.yourHand();
		int player2hand1= player2hand.firstrandom;
		System.out.println("Player one total is "+ howcloseto21 + ". Player 2 total is " + player2hand1 + ".");
	}
}
 }

import java.util.Scanner;
import java.util.Random;
public class cards 
{
public static void main(String args[])
 {
	Scanner letsplay =new Scanner(System.in);
	Random rand= new Random ();
	int random=rand.nextInt(11)+1;
	int firstrandom = 0;
	int tenwasdrawn;
	String ace ;
	int totalhand = 0;
	String twentyone;
	
			HowManyUsers user = new HowManyUsers();
			user.used();
			int playersused=user.players;
			System.out.println(playersused);
	
	Person introduction = new Person();
			introduction.speak();
			
		
			
		do{
		firstrandom=rand.nextInt(11)+1;				
			if(firstrandom<10)
			{
				totalhand= (totalhand + firstrandom);
				System.out.println("Your card is a " + firstrandom);	
			}
			else if(firstrandom==10)
			{
				totalhand= (totalhand+10);
				tenwasdrawn=rand.nextInt(4)+1;
				switch(tenwasdrawn){
				case 1:
					System.out.println("Your card is a King");
					break;
				case 2:
					System.out.println("Your card is a Queen");
					break;
				case 3:
					System.out.println("Your card is a Jack");
					break;
				case 4 :
					System.out.println("Your card is a 10");
					break;
				default:
					System.out.println("error");
					break;
				}
			}
				else if(firstrandom==11)
				{
					System.out.println(" Ace! Would you like that to count as 1 or 11? ");
					do{
						ace =letsplay.next();
							
						if(ace.equals("1"))
						{
							totalhand= (totalhand+1);
							System.out.println("1 more it is");
						}
						else if(ace.equals("11"))
						{
							totalhand= (totalhand+11);
							System.out.println("11 more it is");
						}
						else
						{
							ace="fail";
						}
					}
					while (ace.equals("fail"));
				}
				if(totalhand<22)
				{
				System.out.println("Your total of all your cards is "+ totalhand );
					System.out.println("Type hit if you would like another card, otherwise type cut to stay where you are and move to the questions");
					do{
						twentyone= letsplay.next();
						if(twentyone.equalsIgnoreCase("hit"))
						{
						}
						else if(twentyone.equalsIgnoreCase("cut"))
						{
							System.out.println("You finished with a " + totalhand);
							System.out.println("You have to answer " + (21-totalhand) +" extra questions! GO!");
						}
						else
						{
							twentyone= "case";
						}
					}while(twentyone.equals("case"));	
				}
				else
				{
					System.out.println("Your total is "+ totalhand + ". You just earned yourself 20 more seconds on time");
					twentyone="hits";
				}
				}
		
				while (twentyone.equals("hit"));
		
		
			}

 }

import java.util.Scanner;

import java.util.Random;
public class DiceRoller {
	public static void main(String args[]) {
	//Initializing the Scanner
	Scanner input=new Scanner(System.in);
	System.out.println("🎮 Welcome would you like to play the Dice and Coin Simulator");
	
	
	String a=input.nextLine();
	//Initializing the random class
	Random rand=new Random();

	//If statement in order to ask user if they want to roll a dice or flip a coin. 
	if (a.equals("Yes")|| a.equals("yes")) {
		System.out.println("Awesome now you have to choose 1:to Roll Dice, 2:Flip Coin ");
		int d=input.nextInt();
		if(d==1) {
			System.out.println("Great So you want to roll a dice we will now generate a number on the dice for you");
			int i=rand.nextInt(6)+1;
			System.out.println("Your dice has rolled the number "+i);
		}
		else if(d==2) {
			System.out.println("Great So you want to flip a coin we will now tell you if it is heads or tails ");
			int b=rand.nextInt(2);
			if(b==0) {
				System.out.println("You have flipped heads ");
			}
			else if (b==1) {
				System.out.println("You have flipped tails");
			}
		}
		
		else {
			System.out.println("Invalid input game over ");
		}
			
		
	}
	
	else {
		System.out.println("Maybe later have a good day");
	}
	
	System.out.println("Thank You for playing");
	
	
	
	
	}
	
	
}

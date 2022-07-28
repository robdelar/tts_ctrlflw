package package1;

import java.util.Scanner;
import java.util.Random;


public class mainFlow {

	public static void main(String[] args) {
		
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");     // type a word and hit enter
		String someString = scanner.nextLine();
		System.out.print("Continue to interactive portion?");
		String ans = "yes";
		
		while(ans.equals("yes")) {
		String favePet, qtBack, actName;
		favePet = qtBack = actName = " ";
		int rand1, rand2, rand3;
		
		Random rand = new Random();
		rand1 = rand.nextInt(5);
		System.out.println(rand1);
		rand2 = rand.nextInt(5);
		rand3 = rand.nextInt(5);
		
		int petAge, lkyNum, carYr, ranNum, jersNum;
		petAge = lkyNum = carYr = ranNum = jersNum = 0;
		
		if(scanner.nextLine().equals("yes")){
			System.out.print("Enter your favorite pet's name: ");
			favePet = scanner.nextLine();
			System.out.print("Enter your pet's age: "); 
			petAge = scanner.nextInt();
			System.out.print("Enter your lucky number:  "); 
			lkyNum = scanner.nextInt();
			System.out.print("Your favorite quarterback's jersey number: "); 
			jersNum = scanner.nextInt();
			System.out.print("2 digit model year of your car: "); 
			carYr = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Favorite actor/actress: "); 
			actName = scanner.nextLine();
			System.out.print("Enter number between 1 and 50: "); 
			ranNum = scanner.nextInt();
		}
		else {
			System.out.println("Quitting program.");
		}
		
		int magicB = jersNum*rand1;
		while (magicB > 75) {
			magicB = magicB - 75;
		}
		
		System.out.println(magicB);
		
		
		System.out.println("Lottery numbers: " + "42 " + (petAge+carYr) + " " +
				(carYr+lkyNum) + " "+ (int) actName.charAt(0) + " " + (ranNum-rand2) + " " +  " magic ball: " + magicB);
		
		System.out.println("play again? ");
		
		scanner.nextLine();
		ans = scanner.nextLine();
		
		}
		
		System.out.println("thanks for playing");
	}
		
}

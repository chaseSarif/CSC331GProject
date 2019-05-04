import java.util.Scanner;

public class NumberLvl1 {
	
	int guess;
	int answer;
	int range;
	int max;
	
	public static void main(String args[]) {
		int guess = 0;
		int max = 0;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your max value");
		max = reader.nextInt();
		
		double randomDouble = Math.random();
		randomDouble = randomDouble * max + 1;
		int answer = (int) randomDouble;
		System.out.println(answer);
		
		System.out.println("Enter your guess!: ");
		guess = reader.nextInt();
		
		while(guess!= answer) {
			
			if(guess < answer) {
				System.out.println("Hint: Try Higher");
				
			}
				
			if(guess > answer) {
				System.out.println("Hint: Try Lower");
			}
			
			System.out.println("Guess again!: ");
			guess = reader.nextInt();
			
			}
		
		System.out.println("Correct Answer! Play Again?");
		
		
	}
	
	
}

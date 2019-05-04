import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.StringTokenizer;


public class Game extends GameTest{
	ArrayList<Integer> gameAnswer = new ArrayList<Integer>();
	public  int guessNum;
	public String clue;	
	public final int lvl;
	int randNumb = 1;


	public Game(int level) {
		
		lvl = level;
		
		for(int i=0; i<level; i++) {
			
			Random randNumGen = new Random();
			
			int num = randNumGen.nextInt(10);
			

			
			gameAnswer.add(num);
			
		}
	}

	public int getLvl() {
		return this.lvl;
	}

	public String getClue() {
		return this.clue;
	}

	public void setClue(String clue) {
		this.clue = clue;
	}


	public int getGuessNum() {
		return guessNum;
	}

	public void setGuessNum(int num) {
		this.guessNum = num;
	}



	public int getMax() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void getInput() {
		// TODO Auto-generated method stub

	}


	public int getRand() {
		// TODO Auto-generated method stub
		return this.randNumb;
	}

	public boolean gameOver() {
		
		String checkAnswer = "("+ lvl +"," + lvl+")";
		
		if(clue.contentEquals(checkAnswer)) {
			return true;
		}
		
		return false;
	}


	public String checkValue(String input) {
		// TODO Auto-generated method stub

		// this method takes in a string input that will come from the gui. Then checks if it is in
		// the correct answer at all and counts how many times it is correct and how many times it is
		// also in the correct spot.

		StringTokenizer token = new StringTokenizer(input,",");

		int i = 0;
		int numbRight = 0;
		int posRight = 0;

		int maxNum = token.countTokens();

		String returnString = "(" + input + ")";

		while(i != maxNum) {

			String guess = token.nextToken();
			String actual = gameAnswer.get(i).toString();

			i++;

//			System.out.println("guess " + guess + "\t actual " + actual);


			Integer guessInt = 0;

			guessInt = guessInt.parseInt(guess); //used to check if the guess is in the answer at all

			if(gameAnswer.contains(guessInt)) {
				// I'm running this for loop because it could have the number more than once
				// It should count that for more than 1 appearance of the number


				numbRight ++;

			}

			if (guess.contentEquals(actual)) { //this checks the guess with the direct position it came in
				posRight ++;
			}
			continue;

		}

//			System.out.println(numberRight);
//			System.out.println(positionRight);


		clue = "("+numbRight+","+posRight+")";
		returnString += " " + clue;


		guessNum++;

		return returnString;

	}
	


}
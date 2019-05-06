import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Level4 {
    public int randNumb = 1;
    public String clue;
    ArrayList<Integer> gameAnswer = new ArrayList<Integer>();
    public  int guessNum;
    //public String clue;
    public final int lvl;
    private int maxNum;
    //private int randNumb;

    public Level4(int level, int userMax) {
        this.maxNum = userMax;
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
        return maxNum;
    }


    public String getInput(String input) {
        /**
         * Requests input from the keyboard, validates that its numeric, and returns an Int
         * @return Numeric keyboard input.
         */
        StringTokenizer token = new StringTokenizer(input,",");

        int i = 0;
        int numbLeft = 0;
        int numbRight = 0;
        int posRight = 0;

        int maxNum = token.countTokens();

        String returnString = "(" + input + ")";

        // Variable initialization
        //String userInput = null;
        Integer userInputInt = 0;


        System.out.print("Please enter your guess: ");
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Pulls keyboard input
        try {
            returnString = keyboard.readLine();
        } catch (IOException e) {
            System.out.println("Unable to read input from keyboard");
        }

        // Check for invalid guess types
        Boolean repeat = true;
        while ( repeat ) {
            try {  // If .parseInt works, repeat is set to false and loop ends
                userInputInt = Integer.parseInt(returnString);
                repeat = false;
            } catch ( NumberFormatException e ) {  // Catches invalid guess. Prints error message, prompts for new keyboard input
                System.out.print("Invalid input. Try again: ");
                try {
                    returnString = keyboard.readLine();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                repeat = true;
            }
        }
        return returnString;
    }



    public int getRand() {
        return this.randNumb;
    }

    public boolean gameOver() {

        String checkAnswer = "("+lvl +"," + lvl + "," + lvl + "," + lvl+")";

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
        int numbLeft = 0;
        int posLeft = 0;
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
                numbLeft++;
            }
            if(guess.contentEquals(actual)){
                posLeft ++;
            }
            if(guess.contentEquals(actual)) {
                // I'm running this for loop because it could have the number more than once
                // It should count that for more than 1 appearance of the number


                numbRight ++;

            }

            if (guess.contentEquals(actual)) { //this checks the guess with the direct position it came in
                posRight ++;
            };
            continue;

        }

//			System.out.println(numberRight);
//			System.out.println(positionRight);


        clue = "("+numbLeft+ "," + posLeft + "," +numbRight+","+posRight+")";
        returnString += " " + clue;


        guessNum++;

        return returnString;

    }



}

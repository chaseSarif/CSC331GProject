import java.util.ArrayList;

public class Levels {

    ArrayList<Integer> scores = new ArrayList<Integer>();
    int level;
    int totalGuesses;
    double avrgGuess;
    int lowScore;
    int highScore;

    public Levels(int level){
        this.level = level;
    }

    public void computeStats(int guesses){
        this.scores.add(guesses);
    }

    public void computeAverage(){
        avrgGuess = this.totalGuesses / scores.size();
    }

    public void getHighScore(){
        for(Integer i : scores){
            if(i > highScore){
                highScore = i;
            }
        }
    }

    public void getLowScore(){
        for(Integer i: scores){
            if(i < lowScore){
                lowScore = i;
            }
        }
    }
}

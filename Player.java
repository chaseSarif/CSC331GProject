import java.util.ArrayList;

public class Player {
    String pName;
    Long gameTimePlayed = new Long(0);
    ArrayList<Levels> levelsList = new ArrayList<Levels>();
    ArrayList<Game> oneGameList = new ArrayList<Game>();
    //private ArrayList<Game> Game;

    public Player(String name){
        this.pName = name;
    }

    public void addGame(Game game){
        oneGameList.add(game);
    }

    public void setPName(String newPName){
        this.pName = newPName;
    }

    public String getPName(){
        return this.pName;
    }

    public void addGamePlayTime(long newGame){
        gameTimePlayed += newGame;
    }

    public void setGamePlayTime(long gameTimePlay){
        gameTimePlayed += gameTimePlay;
    }

    public String getGamePlayTime(){
        return this.gameTimePlayed.toString();
    }

    public void setNewGameList(ArrayList<Game> newList){
        this.oneGameList = newList;
    }

    public void addLvl(Levels newLevelObject){
        this.levelsList.add(newLevelObject);
    }

    public ArrayList<Game> getOneGameList(ArrayList<Game> oneGameList){
        return oneGameList;
    }


    public ArrayList<Game> getNewGameList(ArrayList<Game> newList){
        return newList;
    }

    public ArrayList<Game> setOneGameList(){
        return this.oneGameList;
    }
}

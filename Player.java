import java.util.ArrayList;

public class Player {
    String pName;
    Long gameTimePlayed = long(0);
    ArrayList<Levels> levelsList = new ArrayList<Levels>();
    ArrayList<oneGame> oneGameList = new ArrayList<oneGame>();

    public Player(String name){
        this.pName = name;
    }

    public void addGame(oneGame game){
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
    
    public void setOneGameList(ArrayList<oneGame> newList){
        this.oneGameList = newList;
    }
    
    public void addLvl(Levels newLevelObject){
        this.levelsList.add(newLevelObject)
    }        
        

    public void setOneGameList(ArrayList<oneGame> newList){
        this.oneGameList = newList;
    }

    public ArrayList<oneGame> getOneGameList(){
        return this.oneGameList;
    }
}

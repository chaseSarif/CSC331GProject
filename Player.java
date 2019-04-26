import java.util.ArrayList;

public class Player {
    String pName;
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

    public void setOneGameList(ArrayList<oneGame> newList){
        this.oneGameList = newList;
    }

    public ArrayList<oneGame> getOneGameList(){
        return this.oneGameList;
    }
}

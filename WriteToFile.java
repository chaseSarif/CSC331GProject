//This class contains an example main method
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFile extends Person{
	
ArrayList<Person> listPlayers;
	
	int level;
	int plays;
	double time;
	
	
	public static void main(String args[]) throws IOException {
		
		//add the objects to the list
		ArrayList<Person> listPlayers = new ArrayList<Person>();
		
		Person player1 = new Person("Skylar", 22, 35);
		Person player2 = new Person("A", 1, 2);
		Person player3 = new Person("B", 10, 20);
		Person player4 = new Person("C", 30, 40);
																	
		listPlayers.add(player1);
		listPlayers.add(player2);
		listPlayers.add(player3);
		listPlayers.add(player4);

		//You put whatever level list in here to print the stats
		System.out.println("Level 1 stats:");
		playsStat(listPlayers);
		
			
		///////////////////////////////////////////
///////////Extra method to write objects to a file////////
		///////////////////////////////////////////
		
		BufferedWriter file = null;
		
		
		try {
			
			file = new BufferedWriter(new FileWriter("File Name"));
			String done = player1.toString();
			file.write(done);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if (file != null) try {file.close();} catch (IOException ignore) {}
		}
		
	}
	
	
}
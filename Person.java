import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {

	
	private String name;
	private  int level;
	private int plays;
	private int time;
	
	
	public Person() {
			
		}
		
	public Person(String name, int level, int plays) {//create some object, in this case it would be our player object
		this.name = name;
		this.level = level;
		this.plays = plays;
			
		}
	
	
	public String getName() {//all getters and setters for object are below a well as the tostring method
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getPlays() {
		return plays;
	}


	public void setPlays(int plays) {
		this.plays = plays;
	}
	

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
			this.time = time;
	}
	
	//to string method to print out objects, since it overrides you should'nt need to call it
	@Override
	public String toString() { 
		   return this.getName() + " " + this.getLevel() + " " + this.getPlays() + " " + this.getTime() + " ";
		   }
	
	
	//The by__ methods all take in the array list, and sort them based on
	//the corresponding attribute
	//not sure if the names are correct but the getters and setters can be easily changed
	public static void byLvl(ArrayList a) {
		Comparator<Person> By_Level = new Comparator<Person>() {
			public int compare(Person s1, Person e2) {
				return e2.getLevel()-s1.getLevel();
		}
		};
		
		Collections.sort(a, By_Level);
	}
	
	public static void byName(ArrayList a) {
		Collections.sort(a, Comparator.comparing(Person::getName));
	}
	
	public static void byPlays(ArrayList a) {
		Comparator<Person> By_Plays = new Comparator<Person>() {
			public int compare(Person s1, Person e2) {
				return e2.getPlays()-s1.getPlays();
		}
		};
		
		Collections.sort(a, By_Plays);
	}
	
	public static void byTime(ArrayList a) {
		Comparator<Person> By_Time = new Comparator<Person>() {
			public int compare(Person s1, Person e2) {
				return e2.getTime()-s1.getTime();
		}
		};
		
		Collections.sort(a, By_Time);
	}
	
	//these are the stats methods, they all get the player in the top three positions,
	//and print out the corresponding methods
	public static void levelStat(ArrayList a) {
		byLvl(a);
		
		Object playerA = a.get(0);
		Object playerB = a.get(1);
		Object playerC = a.get(2);
		
		System.out.println(((Person) playerA).getName() + " " + ((Person) playerA).getLevel());
		System.out.println(((Person) playerB).getName() + " " + ((Person) playerB).getLevel());
		System.out.println(((Person) playerC).getName() + " " + ((Person) playerC).getLevel());
	}
	
	public static void playsStat(ArrayList a) {
		byPlays(a);
		
		Object playerA = a.get(0);
		Object playerB = a.get(1);
		Object playerC = a.get(2);
		
		System.out.println(((Person) playerA).getName() + " " + ((Person) playerA).getPlays());
		System.out.println(((Person) playerB).getName() + " " + ((Person) playerB).getPlays());
		System.out.println(((Person) playerC).getName() + " " + ((Person) playerC).getPlays());
	}
	
	public static void timeStat(ArrayList a) {
		byTime(a);
		
		Object playerA = a.get(0);
		Object playerB = a.get(1);
		Object playerC = a.get(2);
		
		System.out.println(((Person) playerA).getName() + " " + ((Person) playerA).getTime());
		System.out.println(((Person) playerB).getName() + " " + ((Person) playerB).getTime());
		System.out.println(((Person) playerC).getName() + " " + ((Person) playerC).getTime());
	}
	
	}
	
	   
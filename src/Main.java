import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 locations.put(0, new Location(0, "You are sitting in front of a computer"));
		 locations.put(1, new Location(1, "You are standing at the end of a road before a small berick"));
		 locations.put(2, new Location(2, "you are at the top of a hill"));
		 locations.put(3, new Location(3, "you are inside a building"));
		 locations.put(4, new Location(4, "you are in a valley beside a stream"));
		 locations.put(5, new Location(5, "you are in the forest"));
		 
		 locations.get(1).addExit("W", 2);
		 locations.get(1).addExit("E", 3);
		 locations.get(1).addExit("S", 4);
		 locations.get(1).addExit("N", 5);
		 
		 locations.get(2).addExit("N", 5);
		 
		 locations.get(3).addExit("W", 1);
		 
		 locations.get(4).addExit("N", 1);
		 locations.get(4).addExit("W", 2);
		 
		 locations.get(5).addExit("S", 1);
		 locations.get(5).addExit("W", 2);
		 
		 
		 int loc = 1;
		 
		 while(true) {
			 
			 if (loc == 0) {
				break;
			}
			 Map<String, Integer> exits = locations.get(loc).getExits();
			 System.out.println("available direction are");
			 
			 for (String exit : exits.keySet()) {
				System.out.print(exit + ", ");
			}
 			System.out.println("");
 			
 			String direction = scanner.nextLine().toUpperCase();
 			if (exits.containsKey(direction)) {
				loc = exits.get(direction);
				System.out.println(locations.get(loc).getLocationDetail());
				
			}else {
				System.out.println("You cannot go in that direction");
			}
			 
		 }
	}

}

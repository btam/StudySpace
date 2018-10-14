import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// this generates dummy data into a file for our demo
// certain details will need to be filled in manually 
public class DummyData {
	public static void main(String[] args) throws FileNotFoundException {
		/** data format:
		 * Line 1: Number of buildings in the file
		 * Line 2: Building number
		 * Line 3: Building name
		 * Line 4: Number of floors
		 * Line 5: Floor number
		 * Line 6: Number of rooms
		 * Lines 7-X: Room number (not index), capacity for each room, occupancy
		 * Line X+1: Next floor
		 * Lines X+1-Y: Room number (not index), capacity for each room, occupancy
		 * etc. until EOF
		 */
		File file = new File("C:\\Users\\b\\Dropbox\\schoolwork\\hackathons\\" +
				"hackathons-workspace\\Backend Code for HackDuke 2018\\src\\our-file.txt");
		Scanner sc = new Scanner(file);
		int numBuildings = Integer.parseInt(sc.nextLine());
		System.out.println(numBuildings);
		Building[] buildings = new Building[numBuildings];
		for (int i = 0; i < numBuildings; i++) {
			int currB = Integer.parseInt(sc.nextLine());
			System.out.println(currB);
			
			String buildingName = sc.nextLine();
			int numFloors = Integer.parseInt(sc.nextLine());
			buildings[i] = new Building(buildingName, numFloors); //**
			System.out.println(buildings[i].getName());
			System.out.println(buildings[i].getNumFloors());
			
			for (int j = 1; j <= numFloors; j++) {
				int currFloor = Integer.parseInt(sc.nextLine());
				if (j != currFloor) {
					System.out.println("SOMETHING IS WRONG");
				}
				else {
					System.out.println(currFloor);
					int numRooms = Integer.parseInt(sc.nextLine());
					System.out.println(numRooms);
					Room[] rooms = new Room[numRooms];
					for (int k = 0; k < numRooms; k++) {
						String roomLine = sc.nextLine();
						String roomNumber = roomLine.substring(0, roomLine.indexOf(','));
						String capacityStr = roomLine.substring(roomLine.lastIndexOf(',') + 1);

						capacityStr = capacityStr.substring(1);
						int capacity = Integer.parseInt(capacityStr);
						
						double occ = Math.random() * capacity;
						int occupancy = (int) Math.round(occ);
						rooms[k] = new Room(roomNumber, capacity, occupancy);
						System.out.println(roomNumber + ", " + buildingName + ", " +
								capacity + ", " + occupancy);
					}
					buildings[i].getFloors()[j-1] = new Floor(j, rooms);
					// Floor has "floor number" field, doesn't need to be decremented 
					//buildings[i].getFloors()[j].setRooms(rooms);
				}
			}
			
			//int numBuildings = Integer.parseInt(sc.nextLine());
		}
			
		
		
		
		sc.close();
	}
}

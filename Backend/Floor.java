
public class Floor {
	
	private int floorNum;
	private int numRooms;
	private Room[] rooms;
	private int totalCapacity;
	private int totalOccupancy;
	private double percentOccupied;
	// color field?
	
	public Floor() {
		floorNum = -1;
		numRooms = -1;
		rooms = new Room[0];
		percentOccupied = -1;
		totalOccupancy = -1;
		// color = black
	}
	
	public Floor(int num, Room[] roomArray) {
		floorNum = num;
		rooms = roomArray;
		totalOccupancy = 0;
		totalCapacity = 0;
		for (Room rm : rooms) {
			totalCapacity += rm.getCapacity();
			totalOccupancy += rm.getOccupancy();
		}
		percentOccupied = totalOccupancy / totalCapacity;
	}
	
	public int getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public int getTotalOccupancy() {
		return totalOccupancy;
	}

	public void setTotalOccupancy(int totalOccupancy) {
		this.totalOccupancy = totalOccupancy;
	}

	public double getPercentOccupied() {
		return percentOccupied;
	}

	public void setPercentOccupied(double percentOccupied) {
		this.percentOccupied = percentOccupied;
	}
}

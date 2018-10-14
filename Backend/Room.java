//import Glyph
public class Room {
	private String roomNumber;
	//private Glyph histogram;
	private int capacity;
	private int occupancy;
	private double percentOccupied;
	
	public Room() {
		roomNumber = "";
		capacity = -1;
		//histogram = new Glyph();
		occupancy = -1;
		percentOccupied = -1;
	}
	public Room(String num, int cap, int occ) {
		
		//histogram = new Glyph();
		roomNumber = num;
		capacity = cap;
		occupancy = occ;
		percentOccupied = occ / cap;
	}

	public void pollOccupancy() {
		// obtain new data point
		// the following line is just a placeholder, strictly incorrect
		int newOcc = occupancy / 2;
		occupancy = newOcc;
		percentOccupied = occupancy / capacity;
	}

	public void clickedAlert() {
		// button click here, go to Alert page
	}

	public void displaySmallBar() {
		// TODO
	}

	//returns true if data changes, false if it stays the same
	//public boolean updateHist() {

	//public void displayHist() {
	
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	public double getPercentOccupied() {
		return percentOccupied;
	}
	public void setPercentOccupied(double percentOccupied) {
		this.percentOccupied = percentOccupied;
	}
}
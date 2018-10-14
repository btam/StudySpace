
public class Building {
	private String name;
	
	private int numFloors;
	private Floor[] floors;
	private double currentDistance;
	
	public Building() {
		name = "";
		numFloors = -1;
		floors = new Floor[0];
	}
	
	public Building(String buildingName, int num) {
		name = buildingName;
		numFloors = num;
		floors = new Floor[numFloors];
	}
	
	public Building(String buildingName, Floor[] floorArray) {
		name = buildingName;
		floors = floorArray;
	}
	 
	public void clickedFloor() {
		//TODO: fill this in with android buttons
	}
	public void distanceFrom() {
		// currentDistance = distance from current location
		// use google maps API
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public Floor[] getFloors() {
		return floors;
	}

	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}

	public double getCurrentDistance() {
		return currentDistance;
	}

	public void setCurrentDistance(double currentDistance) {
		this.currentDistance = currentDistance;
	}
}

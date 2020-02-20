//Went to TA Tiantian's office hours for help

import java.util.*;

public class MapBox {
	
	public List<Location> locations; //list of objects
	Set<String> names;
	double minX = 0.0;
	double maxX = 0.0; 
	double minY = 0.0;
	double maxY = 0.0;
	
	public MapBox() {
		this.locations = new ArrayList<Location>(); //initializes and allocates new memory through new
		this.names = new HashSet<String>();
	}

	public double Westmost() {
		return minX;
	}
	
	public double Eastmost() {
		return maxX;
	}
	
	public double Southmost() {
		return minY;
	}
	
	public double Northmost() {
		return maxY;
	}
	
	public void borders(Location loc) {
		if (locations.isEmpty()) {
			minX = loc.longitude;
			minY = loc.latitude;
			maxX = loc.longitude;
			maxY = loc.latitude;
		}
		else {
			
		if(minX > loc.longitude) {
			minX = loc.longitude;
		}
		if(maxX < loc.longitude) {
			maxX = loc.longitude;
		}
		if(minY > loc.latitude) {
			minY = loc.latitude;
		}
		if(maxY < loc.latitude) {
			maxY = loc.latitude;
		}
		}
	}
	
	public boolean recordLocation(Location loc) {
		if(!(names.contains(loc.name))) {
			borders(loc);
			locations.add(loc); 
			names.add(loc.name);
		}
		else {
			return false;
		}
		return true;
	}

}

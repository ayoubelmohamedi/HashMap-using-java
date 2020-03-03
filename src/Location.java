import java.util.HashMap;
import java.util.Map;

public class Location {

	private Map<String, Integer> exits;
	private String locationDetail;
	private int locationId;

	public Location(int locationId, String description) {
		this.locationDetail = description;
		this.locationId = locationId;
		exits = new HashMap<String, Integer>();
		this.exits.put("Q", 0);
	}

	public void addExit(String direction, int locationId) {
		exits.put(direction, locationId);
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}

	public String getLocationDetail() {
		return locationDetail;
	}

	public int getLocationId() {
		return locationId;
	}

}

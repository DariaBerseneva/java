import java.util.ArrayList;

public class House {
	Roof roof;
	ArrayList<Wall> walls;
	ArrayList<Window> windows;
	HouseType houseType;
	String name;
	
	public House() {
		this.walls = new ArrayList<Wall>();
		this.windows = new ArrayList<Window>();
	}
	
	public House setHouseType(HouseType houseType) {
		this.houseType = houseType;
		
		switch (houseType) {
			case STONE: this.name = "My Stone House"; break;
			case WOOD: this.name = "My Wood House"; break;
			case GINGERBREAD: this.name = "My Gingerbread House"; break;
		}
		return this;
	}
	
	public House addRoof(Roof roof) {
		this.roof = roof;
		return this;
	}
	
	public House addWall(Wall wall) {
		this.walls.add(wall);
		return this;
	}
	
	public House addWindow(Window window) {
		this.windows.add(window);
		return this;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String display = "";
		display += "---- " + this.name + " ----\n";
		for (Wall wall : walls) {
			display += "---- " + wall.name + " ----\n";
		}
		for (Window window : windows) {
			display += "---- " + window.name + " ----\n";
		}
			display += "---- " + roof.name + " ----\n";
		return display;
	}
}
public class Main {
	public static void main(String[] args) {
		HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
		House stoneHouse = stoneHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(stoneHouse.toString());
		
		HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
		House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(woodHouse.toString());
		
		HouseBuilder gingerbreadHouseBuilder = new GingerbreadHouseBuilder();
		House gingerbreadHouse = gingerbreadHouseBuilder.addWalls().addWindows().addRoof().build();
		System.out.println(gingerbreadHouse.toString());
	}
}

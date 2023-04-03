public class WoodHouseBuilder extends HouseBuilder {
    int numWalls = 5;
    int numWindows = 20;
    String windowMaterial = "Antique glass";
    String wallMaterial = "Wood, 2 feet thick";
    String interiorWallMaterial = "Wood,1 foot thick";
    String roofMaterial = "Tile";
    
    public WoodHouseBuilder() {
        this.builderName = "Wood House Builder";
        setHouseType(HouseType.WOOD);
    }
    
    public HouseBuilder addWalls() {
        for (int i = 0; i < numWalls-1; i++) {
            house.addWall(new Wall(wallMaterial));
        } 
        house.addWall(new Wall(interiorWallMaterial));
        return this;
    }
    
    public HouseBuilder addWindows() {
        for (int i = 0; i < numWindows-1; i++) {
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }
    
    public HouseBuilder addRoof() {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }
    
    public House build() {
        System.out.println("Stick everything together with mortar");
        return house; 
	}
}
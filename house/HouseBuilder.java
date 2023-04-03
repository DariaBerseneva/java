public abstract class HouseBuilder {
    protected String builderName;
    
    private HouseType houseType;
    protected House house = new House();
    
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
        house.setHouseType(houseType);
    }
    
    public abstract HouseBuilder addWalls();
    public abstract HouseBuilder addRoof();
    public abstract HouseBuilder addWindows();
    
    public House build() {
        System.out.println("build the House!");
        return house;
    }
}
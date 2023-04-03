public class Wall {
    public String name;
    private String material;
    
    public Wall(String material) {
		this.material = material;
        this.name = "Wall made out of " + material;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String ToString() {
        return this.name;
    }
}
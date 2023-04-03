public class Roof {
    public String name;
    private String material;
    
    public Roof(String material) {
		this.material = material;
        this.name = "Roof made out of " + material;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String ToString() {
        return this.name;
    }
}
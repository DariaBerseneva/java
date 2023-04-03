public class Window {
    public String name;
    private String material;
    
    public Window(String material) {
		this.material = material;
        this.name = "Window made out of " + material;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String ToString() {
        return this.name;
    }
}
public class InteriorWall extends Wall {
    public InteriorWall(String material) {
        super(material);
        this.name = "Interior Wall made out of " + material;
    }
}
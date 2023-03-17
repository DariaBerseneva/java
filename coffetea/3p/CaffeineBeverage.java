abstract class CaffeineBeverage {
    
    public abstract void prepareRecipe();
    protected void boilWater() {
        System.out.println("Boiling water");
    }
    
    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
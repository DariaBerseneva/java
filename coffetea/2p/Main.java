public class Main {

    public static void main (String[] argv) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n----------------------------------------\n");

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
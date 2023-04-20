public class MenuTestDrive
{
    public static void main(String args[])
    {
        MenuComponent pancakeHouseMenu = new Menu ("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");

        MenuComponent allMenus = new Menu ("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sause, and a slice of sourdough bread", true, 3.89));
        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
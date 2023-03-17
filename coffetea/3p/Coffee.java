 public class Coffee extends CaffeineBeverage
    {
        public void prepareRecipe()
        {
            boilWater();
            brewCoffeeGrinds();
            pourInCup();
            addSugarAndMilk();
        }

        private void addSugarAndMilk()
        {
           System.out.println("Adding Sugar and Milk");
        }

        

        private void brewCoffeeGrinds()
        {
            System.out.println("Dripping coffee through filter");
        }

        
    }

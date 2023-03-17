 public class Coffee
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

        private void pourInCup()
        {
           System.out.println("Pouring into cup");
        }

        private void brewCoffeeGrinds()
        {
            System.out.println("Dripping coffee through filter");
        }

        private void boilWater()
        {
            System.out.println("Boiling water");
        }
    }

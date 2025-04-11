package SmartKitchenComposition;

public class CoffeeMaker extends KitchenAppliances{

        public CoffeeMaker(boolean hasWorkToDo){
            super(hasWorkToDo);
        }

        public void brewCoffee(){
            boolean availableWorkStatus = isHasWorkToDo();
            if (availableWorkStatus){
                System.out.println("Presenting Coffee.");
            }
        }
}

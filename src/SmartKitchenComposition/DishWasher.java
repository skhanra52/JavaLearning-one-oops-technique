package SmartKitchenComposition;

public class DishWasher extends KitchenAppliances{

    public DishWasher(boolean hasWorkToDo){
        super(hasWorkToDo);
    }

    public void doDishes(){
        boolean availableWorkStatus = isHasWorkToDo();
        if (availableWorkStatus){
            System.out.println("Dish wash started.");
        }
    }
}

package SmartKitchenComposition;

public class SmartKitchen extends KitchenAppliances{
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(boolean hasWorkToDo,
                        CoffeeMaker brewMaster,
                        DishWasher dishWasher,
                        Refrigerator iceBox) {
        super(hasWorkToDo);
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){
        brewMaster.brewCoffee();
    }

    public void pourMilk(){
        iceBox.orderFood();
    }

    public void loadDishWasher(){
        dishWasher.doDishes();
    }
}

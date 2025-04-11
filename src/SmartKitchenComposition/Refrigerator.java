package SmartKitchenComposition;

public class Refrigerator extends KitchenAppliances{

    public Refrigerator(boolean hasWorkToDo){
        super(hasWorkToDo);
    }

    public void orderFood(){
        boolean availableWorkStatus = isHasWorkToDo();
        if (availableWorkStatus){
            System.out.println("Food has been ordered.");
        }
    }
}

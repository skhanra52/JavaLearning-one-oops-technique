import SmartKitchenComposition.CoffeeMaker;
import SmartKitchenComposition.DishWasher;
import SmartKitchenComposition.Refrigerator;
import SmartKitchenComposition.SmartKitchen;

public class Main {
    public static void main(String[] args) {

        // PCs can not be put together without a case. So created instance of ComputerCase.
//        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");

        // PCs needs monitor so created monitor instance.
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
//                27, "2540*1440");

        // PCs needs a motherboard to work, so created motherboard instance
//        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus",
//                4, 6, "v2.44");

        // Created Personal Computer instance where previously created instances would be passed
//        PersonalComputer thePC = new PersonalComputer("2201", "Dell",
//                theMonitor, theMotherBoard, theCase);

        // Here, the methods from a different classes called using a wrapper class.
        // This is what composition is, and it's different from Inheritance.
        // The getters are there in the PersonalComputer class through which the methods are accessed.
        // All the functionality features has been called directly from main.
//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherBoard().loadProgram("Windows OS ");
//        thePC.getComputerCase().pressPowerButton();

        // In case, the direct functionality features needs to be hidden from the main,
        // the same has to be encapsulated inside the PersonalComputer class.
        // All the above "thePC" methods will be removed from the main.
        // None of the methods of  ComputerCase, Monitor, MotherBoard should be called directly from main.
//        thePC.powerUp();

        //----------- This is the smartKitchen challenge code-----------------

        // Instance of coffee Maker.
        CoffeeMaker coffeeMaker = new CoffeeMaker(true);
        // Instance of Dish washer.
        DishWasher dishWasher = new DishWasher(true);
        // Instance of Refrigerator.
        Refrigerator refrigerator = new Refrigerator(true);
        // Instance of Smart Kitchen which is a composition class and accept all the child classes.
        SmartKitchen smartKitchen = new SmartKitchen(true,
                coffeeMaker, dishWasher, refrigerator);

        // Using getter executing the instance method of smartKitchen which are composited from the child classes
        smartKitchen.pourMilk();
        smartKitchen.addWater();
        smartKitchen.loadDishWasher();

    }
}
import PolymorphismExamples.Movie;

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

//        // Instance of coffee Maker.
//        CoffeeMaker coffeeMaker = new CoffeeMaker(true);
//        // Instance of Dish washer.
//        DishWasher dishWasher = new DishWasher(true);
//        // Instance of Refrigerator.
//        Refrigerator refrigerator = new Refrigerator(true);
//        // Instance of Smart Kitchen which is a composition class and accept all the child classes.
//        SmartKitchen smartKitchen = new SmartKitchen(true,
//                coffeeMaker, dishWasher, refrigerator);
//
//        // Using getter executing the instance method of smartKitchen which are composited from the child classes.
//        smartKitchen.pourMilk();
//        smartKitchen.addWater();
//        smartKitchen.loadDishWasher();
//-------------------------------------------------------------------------------------------------
        // Example of encapsulation where the EnhancedPlayer was called from here and passed the player name only.
//        System.out.println("Encapsulation Examples");
//        EnhancedPlayer suman = new EnhancedPlayer("Suman");
//        System.out.println("Initial health of the player = " + suman.healthRemaining());
//        suman.loseHealth(20);
//        System.out.println("Player health of the player after damage = " + suman.healthRemaining());
//        System.out.println("------------------------------");
//
//        // Encapsulation example with printer class.
//        // called the printer only with pagesPrinted value.
//        Printer printer = new Printer();
//        System.out.println("Number of pages has been printed: "+ printer.printPages(10));
//        // called the printer with all the properties values.
//        Printer printerWithAllArgs = new Printer(10,true);
//        System.out.println("Number of pages has been printed in duplex printer: "+printerWithAllArgs.printPages(25));
//        System.out.println("Added toner: " + printerWithAllArgs.addToner(80));
//        System.out.println("------------------------------");

        //----Polymorphism Examples started here-----------------------------------------

        // direct call the base class method.
//        Movie movie = new Movie("Start wars");
//        movie.watchMovie();

        // accessing the subclasses from different package using factory function.
        // calling the adventure class.
        Movie movie;
        movie = Movie.getMovieOfParticularTypes("adventure", "Start Wars");
        movie.watchMovie();
        System.out.println("--------------------------------------------------------------------");
        // calling comedy class
        movie = Movie.getMovieOfParticularTypes("comedy", "House full 3");
        movie.watchMovie();
        System.out.println("--------------------------------------------------------------------");
        // calling ScienceFiction
        movie = Movie.getMovieOfParticularTypes("scienceFiction", "End of earth");
        movie.watchMovie();
        System.out.println("--------------------------------------------------------------------");
    }
}
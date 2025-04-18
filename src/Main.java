import PolymorphismExamples.Movie;

import java.util.*;

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

        System.out.println("----------Example of Collection framework---------------------------");

        //Creation of Set() using HashSet(). It creates unordered set and contains null value as well.
        Set <String> fruits = new HashSet<String>();
        // Added elements to the Set.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Chiku");
        fruits.add("Jack fruit");
        fruits.add(null);
        System.out.println("Here is the Set: " +fruits);
        // Checking existence of an element
        boolean isAvailable;
        isAvailable = fruits.contains("Apple");
        System.out.println("Checking the fruit availability: "+isAvailable);
        // Remove the element from the set
        fruits.remove("Chiku");
        System.out.println("Elements available after removing fruit: "+fruits);
        // Check the size of the set.
        System.out.println("Available Set size: "+fruits.size());

        // Create Set using LinkedHashSet(), holds the insertion order, and also allow null.
        Set <String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Agartala");
        cities.add(null);
        cities.add("Delhi");
        System.out.println("Here is the Set of cities: "+cities);
        //Checks the availability of the item.
        isAvailable = cities.contains("Chennai");
        System.out.println("Element checks on LinkedHashSet: "+isAvailable);

        // Creates Set using TreeSet(), TreeSet does not allow null because it uses comparisons
        // (compareTo or comparator), and comparing with null throws NullPointerException.
        // Automatic order(custom order also allowed).
        Set <String> states = new TreeSet<>();

        states.add("Karnataka");
        states.add("West Bengal");
        states.add("Uttar Pradesh");
        states.add("Assam");
//        states.add(null); // we get NullPointerException error if we add null in TreeSet
        System.out.println("Checks the TreeSet with auto sorting: "+states);

        // Custom comparator sort strings by length.
        Comparator <String> lengthComparator = (s1,s2) -> {
            if(s1.length() == s2.length()){
                return s1.compareTo(s2); // fallback to alphabetical sorting
            }
            return Integer.compare(s1.length(),s2.length());
        };
        // Created TreeSet() using custom comparator
        Set <String> customSortStates = new TreeSet<>(lengthComparator);
        customSortStates.add("Karnataka");
        customSortStates.add("West Bengal");
        customSortStates.add("Uttar Pradesh");
        customSortStates.add("Assam");
        System.out.println("customSortStates with the custom sort: "+customSortStates);

        // Immutable Set can be created using of(),
        // unordered and does not allow to add item after set creation.

        Set <String> immutableSet = Set.of("Apple","Banana","Mango","Papaya","Jack fruit");
        System.out.println("Immutable fruit display: "+immutableSet);
        // Throw error in case of add elements. Gives UnsupportedOperationException
//        immutableSet.add("Grapes");

        // Traverse a set using forEach() and lambda expression.
        System.out.println("------Set traversal using forEach and Lambda expression----------");
        final int[] count = {0}; // created an array with initial value 0.
        customSortStates.forEach((element) -> {
            count[0]++;
            System.out.println("Set item "+ count[0]+": " +element);
        });
        System.out.println("------Set traversal using enhanced for loop----------");
        // Using for loop
        for(String item : customSortStates){
            System.out.println("Checking the Set items: "+item);
        }
        System.out.println("------List Example added--------------------------------");

        // Addition of items to the arrayList, it is an ordered list.
        List <String> garage = new ArrayList<String>();
        garage.add("Ford Figo");
        garage.add("Ford Mustang");
        garage.add("Hunda City");
        garage.add("Kia Seltos");
        // Accessing the ArrayList
        System.out.println("Collection of cars: "+garage);
        // Accessing the particular item from the Arraylist using index
        System.out.println("Check the item at second position: "+garage.get(2));
        // Replacing an item in the garage at specific position.
        garage.set(3,"Honda CIVIC");
        System.out.println("Updated list of cars in the garage after replacement: "+garage);
        // Removing item from the ArrayList.
        garage.remove(3);
        System.out.println("Updated list of cars in the garage: "+garage);
        // Check the total number of cars available in the garage.
        System.out.println("Total number of cars available in the garage: "+garage.size());
        // Travers through the list of cars in garage
        int carCount = 0;
//        for(int i=0; i< garage.size(); i++){
//            carCount++;
//            System.out.println("Available car "+carCount +" : " +garage.get(i));
//        }

        // Above for loop can be replaced by enhanced for loop
        for(String car : garage){
            carCount++;
            System.out.println("Available car "+carCount +" : " +car);
        }
        // Created a person class which will provide object to the ArrayList which is list of object.
        List<Person> people = new ArrayList<>();
        people.add(new Person(10, "Suman", "Khanra", 37, 1000.00));
        people.add(new Person(11, "Vihaan", "Khanra", 3, 100.00));
        people.add(new Person(12, "Geetha", "BR", 27, 5000.00));
        people.add(new Person(13, "Setu", "Sharma", 60, 5000.00));
        people.add(new Person(14, "Vitanshu", "Sahoo", 28, 1000.00));
        // used enhanced for loop to access the person firstname whose age is above 30.
        for (Person p: people){
            if(p.getAge()>30) {
                System.out.println("ArrayList item: " + p.getFirstName());
            }
        }

        // Used stream to filter the records above 30 age.
        List<Person> people1 =  people.stream()
                .filter((person)-> person.getAge()>30)
                .toList();
//        people1.forEach((person) -> System.out.println(person));
        System.out.println("----Checking new sort hand----------------");
        // above lambda can be replaced using below shorthand
        people1.forEach(System.out::println);

        // Used stream to filter the record of below 30 age and get their full name
        List<String>people2 = people.stream()
                .filter((person) -> person.getAge()<30)
                .map(Person::getFirstName) // method reference
                .toList();
        people2.forEach(System.out::println);
    }
    //Note:  we have to perform insertion / Removal / inspection/ searching of element using
    // Set, List, Queue, Maps, Iterators etc.

}
// Inheritance is a way to reuse functionality and attributes.
// In contrast, composition is way to make the combination of classes act like a single coherent object.
// In other word, composition means one class has an instance of other class as a field/member, and uses
// it to provide functionality.

public class PersonalComputer extends Product{

    private Monitor monitor;
    private MotherBoard motherBoard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer){
        super(model,manufacturer);
    }

    public PersonalComputer(String model,
                            String manufacturer,
                            Monitor monitor,
                            MotherBoard motherBoard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;
    }

    // commenting the getters as these functionality should not be exposed to outside PersonalComputer.

    // Returning the entire Monitor class which will have Monitor class's methods and attributes.
//    public Monitor getMonitor() {
//        return monitor;
//    }
    // Returning the entire MotherBoard class which will have MotherBoard class's methods and attributes.
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }

    // Returning the entire ComputerCase class which will have ComputerCase class's methods and attributes.
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }

   private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
   }

   public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
   }
}

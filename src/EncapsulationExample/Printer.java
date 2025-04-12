package EncapsulationExample;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public  Printer(){
        this(100, false);
    }

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <=100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;
        if(tonerLevel < 0  || tonerLevel > 100){
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages){
        if(duplex){
            System.out.println("it’s a duplex printer.");
            if(pages%2 == 0)
                pagesPrinted = pagesPrinted + (pages/2);
            else
                pagesPrinted = (pagesPrinted + (pages/2))+1;
        }else{
            pagesPrinted = pagesPrinted + pages;
        }
        return pagesPrinted;
    }
}

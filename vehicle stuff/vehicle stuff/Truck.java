public class Truck extends Car{

    //instance variables
    private boolean cargo;
    
    /*
     * Constructor for class Truck
     */
    public Truck(){
    }
    
    /*
     * constructor for special form of class Truck
     */
    public Truck(String color, int year, String make, boolean cargo){
        super (color, year, make);
        this.cargo = cargo;
    }
    
    /*
     * Method change smogCheck
     */
    public void smogCheck(){
        if(!cargo){
            System.out.println("Hey ya don't got any cargo, might as well get your smog checked.");
            this.cargo = true;
        }
    }
    
    public String toString(){
        String output = "\nTruck \n" + super.toString() + "\n Cargo " + this.cargo;
        return output;
    }
}
    
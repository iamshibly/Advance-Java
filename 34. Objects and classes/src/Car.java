public class Car {
    int numberOfWheels;//properties
    String color;
    static int numberOfCarSold;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    static{
        numberOfCarSold=200;
       System.out.println("Initital Block");
    }
    {
        numberOfCarSold++;
        System.out.println("Static Block");
    }
    Car(String color,int noOfSeats){
    this.color=color;
    maxSpeed= 150;
    this.noOfSeats=noOfSeats;
    numberOfWheels=4;
    currentFuelInLiters= 2;
    }
    Car(int maxSpeed){
        color="White";
        this.maxSpeed= maxSpeed;
        noOfSeats=5;
        numberOfWheels=4;
        currentFuelInLiters= 3;
    }
    Car(){//default constructor
        this("Red",8);
        currentFuelInLiters= 10;
    }
    public Car start(){
        if(currentFuelInLiters==0){
            System.out.println("Car is out of Fuel, can not start");
        }
        else if(currentFuelInLiters<5){
            System.out.println("Car is in reserve mode, please refuel the car");
        }
        else{
            System.out.println("Car is started... burhhhhh");
        }
    return this;
    }
    public void drive(){//methods
        currentFuelInLiters--;
        System.out.println("Car is Driving");

    }
    public void addFuel(float currentFuelInLiters){
         this.currentFuelInLiters+=currentFuelInLiters;
    }
    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

}

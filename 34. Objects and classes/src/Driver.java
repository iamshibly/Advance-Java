public class Driver {
    static int minimumAgeForDrive = 18;
    String name;
    int age=20;
    int death=55;
    String dateOfLicense;
    public boolean isAllowedToDrive(){
        return age>=minimumAgeForDrive;
    }
    public static int doIt(){
        Driver jDriver = new Driver();

        return jDriver.death - jDriver.age;
    }
    public static void main(String[] args) {
       /* Car myCar = new Car();//object creation
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(10);
        myCar.drive();

        System.out.print(myCar.getCurrentFuelLevel());*/
        System.out.println("For Swift Car: ");
        Car swift = new Car();
        swift.addFuel(6);
        System.out.println(swift.currentFuelInLiters);
        //Car startedCar= swift.start();//this keyword use
        //startedCar.drive();
        swift.start().drive();//this keyword use
        System.out.println(swift.color);
        System.out.println(swift.maxSpeed + " k.m.");
        System.out.println(swift.getCurrentFuelLevel());
        System.out.println(swift.currentFuelInLiters);
        System.out.println(swift.noOfSeats);

        System.out.println("For Thar Car: ");
        Car thar = new Car(160);
        thar.addFuel(10);
        System.out.println(thar.currentFuelInLiters);
        System.out.println(thar.color);
        thar.start().drive();
        System.out.println(thar.maxSpeed + " k.m.");
        System.out.println(thar.getCurrentFuelLevel());
        System.out.println(thar.currentFuelInLiters);
        System.out.println(thar.noOfSeats+"\n");

        System.out.println(Driver.minimumAgeForDrive);
        System.out.println(Driver.doIt());

        Driver myDriver = new Driver();
        myDriver.dateOfLicense= "23-04-2020";
        System.out.println(myDriver.dateOfLicense);

        myDriver.isAllowedToDrive();
        System.out.println(myDriver.isAllowedToDrive());
    }
}

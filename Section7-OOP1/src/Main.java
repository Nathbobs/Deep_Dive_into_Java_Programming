public class Main {
    public static void main(String[] args) {

        Car car = new Car();// Create a new Car object named car

        //car.make = "Porsche"; //not that we cannot modify the private variables directly therefore, we use the style "car..describeCar();" below.
        /* Instead, we use a special method called a setter and getter method to modify the private variables.*/

        car.setMake("Maserati"); //setter method for make(can now modify they car object from the Car class
        car.setModel("carrera");
        car.setColour("black");
        car.setDoors(2);
        car.setConvertible(false);

        // since we already used a getter method to get the make, model etc, we can use it to set the make, model etc.
        System.out.println("Make= " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();//car.describeCar() is a method call using the "." operator
    }
}

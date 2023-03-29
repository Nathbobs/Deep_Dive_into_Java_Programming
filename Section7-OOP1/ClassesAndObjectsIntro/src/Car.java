public class Car {
    private  String make = "Tesla";
    private String model = "Model X";
    private String colour = "Gray";
    private int doors = 2 ;
    private boolean convertible = true;

    public String getMake(){
        return make;
    } //getter method for make(used to make direct changes to make in the main class)

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() { // "is" is used for a boolean value when using a getter method.
        return convertible;
    }
    //setter methods: sets data that don't need to be returned/retrieved. and all the rules can be set in the setter method.Hence, encapsulation.

    public void setMake(String make) {
        //now we want to add some validation to this method.

        if (make == null ) make = "unknown"; //when the argument is null, make is set to unknown.
        String lowercaseMake = make.toLowerCase();//returns a new string that is in lower case.
        switch (lowercaseMake){ //using the switch statement in this variable, we test if the make is equal to any of the cases we support.
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
            this.make = "unsupported"; //when the argument is not null, but is not equal to any of the cases, we set the make to unsupported.
            }
        } //NOTE:

        //this.make = make; this keyword is used to refer to the current object(used to describe itself)
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public  void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    public void describeCar(){
        System.out.println(doors + "-Door " + colour +" " + make + " " + model + " "
                + (convertible ? "Convertible" : " "));
    }
}

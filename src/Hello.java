public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World"); //println ensures a new line is created.
        System.out.println("Hello Tim");

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an Alien");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println( "YOu got a High Score");
        }

        String makeOfCar = "volkswagen";
        boolean isDomestic = makeOfCar == "volkswagen"? false:true;

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";//"?" means execute first statement if true, else execute second statement.
        System.out.println("Our client is " + ageText);
        // in this case, over eighteen will be printed because ageOfClient = 20.

        System.out.println ("--------------------");
        System.out.println ("--------------------");
        System.out.println ("--------------------");

        double v1 = 20.00d;
        double v2 = 80.00d;
        double v3 = (v1 + v2) * 100.00d;
        System.out.println(" My total value is: " + v3);

        double v4 = (v3 % 35.00d);
        System.out.println(" Remainder value is: " + v4);

        boolean remainder = (v4 == 0) ? true:false;
        System.out.println(" No Remainder? : " + remainder);

        if (!remainder ){
            System.out.println(" Got some remainder");
        }








    }
}

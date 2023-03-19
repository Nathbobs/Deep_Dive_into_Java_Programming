public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("75 inches is " + convertToCentimeters(75) + " cm." );
        System.out.println("5'7 in cm = " + convertToCentimeters(5,7) + " cm");

    }
    public static double convertToCentimeters(int heightInInches){
        double heightInCm = heightInInches * 2.54;
        return heightInCm;
    }
//    public static  double convertToCentimeters(int heightInFeet, int remHeightInInches){
//        double convHeightInInches = (heightInFeet * 12) + (remHeightInInches);
//        double convHeightInCm = convHeightInInches * 2.54;
//        return convHeightInCm;
//    } // or you use the code below for calling from method 1;

    public static  double convertToCentimeters(int heightInFeet, int remHeightInInches){
        double convHeightInInches = (heightInFeet * 12) + (remHeightInInches);
//        double convHeightInCm = convHeightInInches * 2.54;
        return convertToCentimeters(((int)convHeightInInches));
    } // or you use the code below for calling from method 1;

}

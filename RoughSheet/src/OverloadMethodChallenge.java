public class OverloadMethodChallenge {
    public static void main(String[] args) {

       System.out.println(convertToCentimeters(67));
       System.out.println(convertToCentimeters(5,7));

    }
    public static double convertToCentimeters(int heightInch){

        double inchToCents = heightInch*2.54;
        return inchToCents;
        //return heightInch * 2.54; shorter method
    }
    public static double convertToCentimeters(int heightFT, int remHeightInch){
        int feetToInch = heightFT * 12 + remHeightInch;
        System.out.println(feetToInch);
        double feetToInches =  convertToCentimeters(feetToInch);
        return feetToInches;
       // return convertToCentimeters((heightFT * 12) + remHeightInch); shorter way of going about my long code.
    }
}


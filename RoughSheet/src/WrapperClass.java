public class WrapperClass { // used in parsing strings to numeric values

    /* i.e integer = parseInt(string)
     *       Double = parseDouble(String)*/
    public static void main(String[] args) {
        int currentYear = 2022;
        String usersDateofBirth = "1999";
        int dateofBirth = Integer.parseInt(usersDateofBirth); // this is used to convert string into integer value using the static method "parseInt"
        System.out.println("age = " + (currentYear - dateofBirth));
        String usersWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersWithPartialYear);
        System.out.println("The User says he's " + ageWithPartialYear);
        String fool = "01057377151";
        int number = 01057377151;
        int phoneNumberX2 = Integer.parseInt(fool);
        System.out.println(number + fool);
    }



}

public class switchStatement1 {
    public static void main(String[] args) {
        /*When using the switch statement, it's often done this way;
         switch(Value){
            case x:
                "code for value = x"
                break;
            case y:
                "code for value = y
                break;
            default:
            "code for value not equal to x or y"
            }
            */
        int switchValue = 5;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }
            //(this is an enhanced switch statement method. Less traditional)
        int switchValues = 5;
        switch(switchValues){
            case 1-> System.out.println("Value was 1");

            case 2-> System.out.println("Value was 2");
            case 3, 4, 5-> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValues);

            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }
        String month = "April";
        String months = "December";
        System.out.println(month + " : " + getQuarter(month));
        System.out.println(months + " : " + getQuarters(months));
    }
    public static String getQuarter(String month){
        switch (month){
            case "January":
            case "February":
            case "March":
                return "This is the first quartile of the year";
            case "April":
            case "May":
            case "June":
                return "This is the second quartile of the year";

            case "July":
            case "August" :
            case "September":
                return "This is the third quartile of the year";
            case "October":
            case "November":
            case "December":
                return "This is the fourth quartile of the year" ;
        }
        return "Bad input";
    }
    public static String getQuarters(String months){
        //using the enhanced switch statement method; N.B the return method is needed here.
         return switch (months){
            case "January", "February", "March" -> "This is the first quartile of the year";
            case "April", "May", "June" -> "This is the second quartile of the year";
            case "July", "August", "September" -> "This is the third quartile of the year";
            case "October", "November", "December" -> "This is the fourth quartile of the year";
            default -> {
                String badResponse = months + "bad";
                yield badResponse; /*1. Yield statement has to be in a codeblock
                                       2. Your switch statement is being used as a switch expression returning a value. */
            }
         };
    }
}




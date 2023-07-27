public class EnhancedSwitch {
    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue){
            case 1-> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3,4,5 -> {System.out.println("Value was 3,4 or 5");
            System.out.println("Value was actually " + switchValue);
            }
            default -> System.out.println(" Value was not from 1 to 5");
        }
        String month = "XYZ";
        System.out.println(month + "is in the " + getQuarter(month) + "quarter ");
    }

    public static String getQuarter(String month) {
        return switch (month){
            case "January", "February", "March" -> {yield "1st"; } //yield is used in enhanced switch instead of return as in traditional switch.
            case "Aril", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";

            default -> {
                String badResponse = month + "Is bad"; //this method is used in the default section
                yield badResponse;
            }

        }; //use ";"

    }
}

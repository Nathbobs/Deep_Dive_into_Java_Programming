public class DayofTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);

    }
    public static void printDayOfWeek( int day){
        String dayOfWeek = switch (day){ //setting each values of day into dayOfWeek
            case 0 -> {yield "Sunday" ;}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
            };
        System.out.println(dayOfWeek);

        }

    public static void printWeekDay(int day){
        if (day == 0){
            System.out.println("if-Sunday");
        } else if (day == 1) {
            System.out.println("if-Monday");
        } else if (day == 2) {
            System.out.println("if-Tuesday");
        } else if (day == 3) {
            System.out.println("if-Wednesday");
        } else if (day == 4) {
            System.out.println("if-Thursday");
        } else if (day == 5) {
            System.out.println("if-Friday");
        } else if (day == 6) {
            System.out.println("if-Saturday");
        } else
            System.out.println("if-Invalid day");
    }
}

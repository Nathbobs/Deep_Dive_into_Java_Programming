public class aSwitchExpressionChallenge {
    //using enhanced switch expression for this challenge.
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(100);
    }
    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch(day){
            case 0 -> "Sunday"; // or you can use "yield" i.e {yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek );
    }
}

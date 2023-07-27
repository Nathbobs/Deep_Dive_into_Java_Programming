public class secondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString (int seconds){
        /*Using two steps approach (first you divide seconds by 60 and then divide the result(minutes) by another
         60 to get minutes*/
        if (seconds < 0){
            return "Invalid data for seconds (" + seconds + "), input a positive number" ;

        }
        int minutes = seconds/60;


//        int hours = minutes/60;
//        int remainingMinutes = minutes % 60;
//        int reamainingSeconds = seconds % 60;
//
//        return hours + "h " + remainingMinutes + "m " + reamainingSeconds + "s ";
        return getDurationString(minutes,seconds); // method is overloaded from the one below...

    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0){
            return "Invalid data for minutes (" + minutes + "), input a positive number" ;
        }
        if (seconds <=0 || seconds >= 59){
            return "Invalid data for seconds (" + seconds + "), input a positive number" ;

        }
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        int reamainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + reamainingSeconds + "s";

    }
}

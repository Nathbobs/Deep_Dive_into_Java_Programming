public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); //first case
        System.out.println(getDurationString(120,145)); //second case

    }
    public static String getDurationString(int seconds){
        //using 2-steps approach
        int minutes = seconds/60;
        int hours = minutes/60;
        int mins = minutes%60;
        int secs = seconds%60;
        if( seconds < 0 ){
            return "Sorry you entered an invalid number";
        }
        return hours + " h " + mins + " m " + secs + " s" ;


//        //using one-step approach
//        int hours1 = seconds/3600;
//        System.out.println("Hours1 = " + hours1);

    }
    public static String getDurationString(int minutes, int seconds){
        if( seconds < 0 && seconds >= 59 ){
            return "Sorry you entered an invalid number" ;
        }
        int convMinutes = (minutes*60) + seconds;
        getDurationString((convMinutes));

        return getDurationString(convMinutes) ;

    }
}

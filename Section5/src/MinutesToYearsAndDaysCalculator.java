public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays( long minutes){
        long XX = minutes;
        long YY = XX/525600;
        long remYY = XX % 525600;
        long ZZ = remYY / 1440;

        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println( XX + " min = "+ YY + " y and " + ZZ + " d"   );

        }
    }
}

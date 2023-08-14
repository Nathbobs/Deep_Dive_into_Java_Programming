import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 5){
                System.out.println(" Enter number #" + count + ": ");
                String nextNumber = keyboard.nextLine();
                try{
                    int num = Integer.parseInt(nextNumber); // parsing string to int in this part.
                    //Double num = Double.parseDouble(nextNumber);// this is used for parsing the string into double.
                    count++;
                    sum += num;
                } catch (NumberFormatException nfe){
                    System.out.println("Invalid number");
                }

        }
        System.out.println("Sum of numbers entered is: " + sum);
    }


}

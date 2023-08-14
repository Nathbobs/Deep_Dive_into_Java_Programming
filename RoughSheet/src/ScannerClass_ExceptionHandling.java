import java.util.Scanner;

public class ScannerClass_ExceptionHandling {
    public static void main(String[] args) {

        int currentYear = 2022;


        try{

        } catch (NullPointerException e){

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
    }


}

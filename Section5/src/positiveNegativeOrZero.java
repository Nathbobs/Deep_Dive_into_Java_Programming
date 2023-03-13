public class positiveNegativeOrZero {
    public static void main(String[] args) {
        checkNumber(5);
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        if (number < 0) {
            System.out.println("negative");
        }
        if (number == 0) {
            System.out.println("number is equals to 0");
        }
    }


}


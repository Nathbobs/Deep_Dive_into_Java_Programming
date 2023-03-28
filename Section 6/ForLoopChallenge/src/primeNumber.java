public class primeNumber {
    public static void main(String[] args) {
        isPrime(5);
        isPrime(10);
        isPrime(25);
        isPrime(31);

    }
    public static void isPrime(int number){
        int counter = 0;
        for (number = 0; number <= 1000; number++){
            if (number%2 == 0 ){
                System.out.println( number + " is prime");
                counter += 1;
                if (counter == 3){
                    break;
                }
            }
        }
    }
}

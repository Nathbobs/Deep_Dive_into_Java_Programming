public class ForLoopChallenge {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10 ; i <= 50 ; i++){
            if (isPrime(i)){
                System.out.println("Number " + i + " is a prime number ");
                count++;
                if (count == 3){
                    System.out.println("Found 3 -  exiting the for loop");
                    break;
                }

            }
        }
    }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return wholeNumber == 2;
        }
        for( int divisor = 2 ; divisor < wholeNumber/2 ; divisor++){
            if(wholeNumber % divisor == 0 ){
                return false;
            }

        } return true;
    }

//    public static void main(String[] args) {
//    }
//    public static boolean isPrime(int wholeNumber){
//        int counter = 0;
//        if (wholeNumber <= 2){
//            return wholeNumber == 2;
//        }
//        for( int divisor = 2 ; divisor < wholeNumber/2 ; divisor++){
//                if(wholeNumber % divisor == 0 ){
//                    System.out.println( wholeNumber + " is a prime number");
//                    counter++;
//                    if(counter == 3){
//                        break;
//                    }
//                    return false;
//                }
//
//        } return true;
//    }




}

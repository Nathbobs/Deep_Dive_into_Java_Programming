public class Sum3and5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1 ; i <= 1000; i++){
            if (i%3 ==0 && i%5 ==0){
                sum += i;
                count++;
                System.out.println("Found a match " + i);
            }..
            if (count == 5){
                break;
            }
        }
        System.out.println("Sum of numbers = " + sum);
    }
//    public static void main(String[] args) {
//        int count = 0;
//        int sum = 0;
//        for (int i = 1 ; i <= 1000; i++){
//            if (i%3 ==0 && i%5 ==0){         */This is correct but not clean enough cleaner code upstairs.
//                sum = sum+i;
//                count++;
//                System.out.println("Found a match " + i);
//                if(count == 5){
//                    break;
//                }
//            }
//
//        }System.out.println("Sum of numbers = " + sum);
//    }


}

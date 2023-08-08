public class whileLoopChallenge {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 20){
            i++;
            if (!isEvenNumber(i)) {
                continue;
            }
            System.out.println(i + " is even number");
        }

    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}

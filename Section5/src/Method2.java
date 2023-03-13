public class Method2 {
    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 100);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted,int bonus){
        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }


}

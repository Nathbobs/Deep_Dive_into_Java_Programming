//method is similar to functions in other programming languages
public class Method {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        calculateScore();
        /* when you use the 2nd method, this line above needs to be
        calculateScore(gameOver:true, score: 800, levelCompleted, bonus) for the code to run. */

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static void calculateScore() /*calculateScore(boolean gameOver, int score, int levelCompleted,int bonus)
     Note however that the line below should be deleted to avoid errors when you use this "method"*/
    {
        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

}
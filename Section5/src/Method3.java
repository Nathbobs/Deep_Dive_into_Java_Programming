public class Method3 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;       //this is the 3rd way of using "Method"
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted,bonus); // using method 3
        System.out.println("The highscore is " + highScore);
        // calculateScore(true, 800, 5, 100); using method 2
        // calculateScore(true, 10000, 8, 100); using method 2

        score = 10000;
        levelCompleted = 8;       //this is the 3rd way of using "Method"
        bonus = 200;

        System.out.println("The next highscore is " + calculateScore(gameOver, score, levelCompleted,bonus));
}
    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus){
        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }


}

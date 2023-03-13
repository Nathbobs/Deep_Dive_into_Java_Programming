public class sectionChallenge_correction {
    public static void main(String[] args) {
        int Ppos = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", Ppos);
    }
    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }
        else if (score >= 500){
            return 2;
        }
        else if (score >= 100){
            return 3;
        }

        return 4;
    }
    public static void displayHighScorePosition(String Pname, int Ppos){ /*use void when running different data types*/
        System.out.println( Pname + " managed to get into position " + Ppos + " on the high score list");
    }
}

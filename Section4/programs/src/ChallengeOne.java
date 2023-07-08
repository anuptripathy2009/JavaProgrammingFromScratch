public class ChallengeOne {
    //Screenshot of the problem is available on ..\ScrShots\Challenge
    public static void main(String[] args) {
        int score1 = 1500;
        int score2 = 1000;
        int score3 = 500;
        int score4 = 100;
        int score5 = 25;

        System.out.println(calculateHighScore(score1));
        System.out.println(calculateHighScore(score2));
        System.out.println(calculateHighScore(score3));
        System.out.println(calculateHighScore(score4));
        System.out.println(calculateHighScore(score5));
    }

    public static String displayHighScorePosition(String pl_name, int pl_pos) {
        return pl_name + " managed to get into position " + pl_pos + " on high score list";
    }

    public static int calculateHighScore(int score){
        if (score >= 1000) {
            return 1;
        }

        else if (score >= 500 && score <= 1000) {
            return 2;
        }

        else if (score >= 100 && score <= 500) {
            return 3;
        }

        return 4;
    }
}

public class ChallengeOne {
    //Screenshot of the problem is available on ..\ScrShots\Challenge
    public static void main(String[] args) {
        int highScore = calculateHighScore(1500);
        System.out.println(displayHighScorePosition("Anup", highScore));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        highScore = calculateHighScore(1000);
        System.out.println(displayHighScorePosition("Adityansu", highScore));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        highScore = calculateHighScore(500);
        System.out.println(displayHighScorePosition("Amlan", highScore));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        highScore = calculateHighScore(100);
        System.out.println(displayHighScorePosition("Roronoa", highScore));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        highScore = calculateHighScore(25);
        System.out.println(displayHighScorePosition("Zenew", highScore));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    public static String displayHighScorePosition(String pl_name, int pl_pos) {
        return pl_name + " managed to get into position " + pl_pos + " on high score list";
    }

    public static int calculateHighScore(int score){
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score <= 1000) {
            return 2;
        } else if (score >= 100 && score <= 500) {
            return 3;
        }else {
            return 4;
        }
    }
}

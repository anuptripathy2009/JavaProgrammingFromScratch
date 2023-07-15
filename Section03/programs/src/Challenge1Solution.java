public class Challenge1Solution {
    public static void main(String[] args) {
        boolean gameOver = true;
        // int score = 800; //previous
        int score = 10000;
        // int level_completed = 5;
        int level_completed = 8;
        // int bonus = 100;
        int bonus = 200;

        int final_score = score;

        if (gameOver) {
            final_score += (level_completed * bonus);
            System.out.println("Your final score was " + final_score);
        } 
    }
}

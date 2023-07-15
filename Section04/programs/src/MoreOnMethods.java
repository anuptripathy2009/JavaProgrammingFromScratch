public class MoreOnMethods {
    public static void main(String[] args) {

        System.out.println(calculateScore(true, 200, 3, 100));
        System.out.println(calculateScore(true, 5000, 7, 500));
        System.out.println(calculateScore(true, 8000, 14, 50));
    }

//without a return type
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }
//    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}

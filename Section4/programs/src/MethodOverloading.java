public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore("Amlan Pati", 700);
        calculateScore(800);
        calculateScore();
    }
    public static void calculateScore(String player_name, int score) {
        System.out.println("--------------------------------------------------");
        System.out.println("Player Name : " + player_name);
        System.out.println("Score : " + score * 1000);
        System.out.println("--------------------------------------------------");
    }

    public static void calculateScore(int score) {
        System.out.println("--------------------------------------------------");
        System.out.println("Player name : N/A");
        System.out.println("Score : " + score * 1000);
        System.out.println("--------------------------------------------------");
    }

    public static void calculateScore() {
        System.out.println("--------------------------------------------------");
        System.out.println("Player name : N/A");
        System.out.println("Score : N/A");
        System.out.println("--------------------------------------------------");
    }

}

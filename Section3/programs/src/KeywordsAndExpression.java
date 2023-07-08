public class KeywordsAndExpression{
    public static void main(String[] args) {
        int num = 100;
        num += 100 / 2 + 4 - 2;
        System.out.println(num);
        int topScore = 0;
        topScore++;
        System.out.println(topScore);
        int special_num = 9;
        if (special_num < 10 && topScore > 1) {
            System.out.println("Special Power Acquired.....");   
        }
        if (special_num < 10 || topScore > 1) {
            System.out.println("Special Power Acquired.....");   
        }
}
}
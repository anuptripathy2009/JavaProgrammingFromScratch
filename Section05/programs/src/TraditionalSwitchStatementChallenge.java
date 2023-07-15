public class TraditionalSwitchStatementChallenge {
    public static void main(String[] args) {
        char secret_word = 'E';
        System.out.println(secret_word + " represents --> " + convertToNormalWord(secret_word));
        char secret_word2 = 'F';
        System.out.println(secret_word + " represents --> " + convertToNormalWord(secret_word2));

    }

    public static String convertToNormalWord(char character) {
        switch (character) {
            case 'A':
                return "Able";

            case 'B':
                return "Baker";

            case 'C':
                return "Charlie";

            case 'D':
                return "Dog";

            case 'E':
                return "Easy";

            default:
                return "!Not Found!";

        }
    }
}

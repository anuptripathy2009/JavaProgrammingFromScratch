public class CodingExercise15 {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 9));
    }
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sumOfOddNumbers = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOddNumbers += i;
                }
            }
            return sumOfOddNumbers;
        }
        return -1;
    }
}

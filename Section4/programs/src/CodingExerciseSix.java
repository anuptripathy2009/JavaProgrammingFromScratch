public class CodingExerciseSix {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        return scaledNum1 == scaledNum2;
    }
}

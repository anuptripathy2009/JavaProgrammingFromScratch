public class CodingExerciseEighteen {
    public static void main(String[] args) {
        int num1 = 1223;
        int num2 = 3222;
        int num3 = 1351;
        System.out.println("The sum of the even digits in the number " + num1 + " is " + getEvenDigitSum(num1));
        System.out.println("The sum of the even digits in the number " + num2 + " is " + getEvenDigitSum(num2));
        System.out.println("The sum of the even digits in the number " + num3 + " is " + getEvenDigitSum(num3));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sumOfEvenDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if ((lastDigit % 2) == 0) {
                sumOfEvenDigits += lastDigit;
            }
            number /= 10;
        }
        return sumOfEvenDigits;
    }
}

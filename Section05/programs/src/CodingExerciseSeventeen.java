public class CodingExerciseSeventeen {
    public static int sumFirstAndLastDigit(int number)
    {
        if (number < 10)
        {
            return number;
        }

        if (number < 0) {
            return -1;
        }


        int firstDigit = 0;
        int lastDigit = number % 10;
        int digitSum = 0;

        while (number >= 10)
        {
            number /= 10;
            firstDigit = number;
        }

        digitSum = firstDigit + lastDigit;

        return digitSum;

    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }
}

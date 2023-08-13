public class CodingExerciseNineteen {
    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 99;
        int num3 = 100;
        int num4 = 123;
        int num5 = 12;
        int num6 = 24;
        System.out.println("The number " + num2 + " has the share of number " + num1 + " --> " + (hasSharedDigit(num1, num2)?"YES":"NO"));
        System.out.println("The number " + num3 + " has the share of number " + num2 + " --> " + (hasSharedDigit(num2, num3)?"YES":"NO"));
        System.out.println("The number " + num5 + " has the share of number " + num4 + " --> " + (hasSharedDigit(num4, num5)?"YES":"NO"));
        System.out.println("The number " + num6 + " has the share of number " + num5 + " --> " + (hasSharedDigit(num5, num6)?"YES":"NO"));
    }
    public static boolean hasSharedDigit(int sharedNumber, int number) {
        if (sharedNumber >= 10 && sharedNumber <= 99 && number >= 10 && number <= 99) {
            while (sharedNumber > 0 && number > 0) {
                int sharedNumLastDigit = sharedNumber % 10;
                int numberLastDigit = number % 10;
                if (sharedNumLastDigit == numberLastDigit || sharedNumLastDigit == number/10) {
                    return true;
                }

                sharedNumber /= 10;
                number /= 10;
            }
        }
        return false;
    }
}

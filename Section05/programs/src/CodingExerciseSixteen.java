public class CodingExerciseSixteen {
    public static void main(String[] args) {
        int num1 = 203;
        int num2 = 404;
        int num3 = 708;
        int num4 = 11 * 11;
        int num5 = -525;
        System.out.println("Is " + num1 + " a palindrome number -> " + (isPalindrome(num1)?"YES":"NO"));
        System.out.println("Is " + num2 + " a palindrome number -> " + (isPalindrome(num2)?"YES":"NO"));
        System.out.println("Is " + num3 + " a palindrome number -> " + (isPalindrome(num3)?"YES":"NO"));
        System.out.println("Is " + num4 + " a palindrome number -> " + (isPalindrome(num4)?"YES":"NO"));
        System.out.println("Is " + num5 + " a palindrome number -> " + (isPalindrome(num5)?"YES":"NO"));
    }
    public static boolean isPalindrome(int number)
    {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int temp_number = number;
        while (temp_number > 0) {
            int lastDigit = temp_number % 10;
            reverse *= 10;
            reverse += lastDigit;
            temp_number /= 10;
        }
        return reverse == number;
    }
}

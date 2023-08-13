// Interger.toString() is used to convert an int datatype to string
// Integer.parseInt() is used a string into an integer datatype
public class DigitSumChallenge {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 4321;
        int num3 = 76;
        int num4 = 45;
        System.out.println("Digit sum of the number " + num1 +  " is " + digitSum(num1));
        System.out.println("Digit sum of the number " + num2 + " is " + digitSum(num2));
        System.out.println("Digit sum of the number " + num3 + " is " + digitSum(num3));
        System.out.println("Digit sum of the number " + num4 + " is " + digitSum(num4));
        System.out.println("------results--of--method2-------");
        System.out.println("Digit sum of the number " + num1 +  " is " + digitSumMethod2(num1));
        System.out.println("Digit sum of the number " + num2 + " is " + digitSumMethod2(num2));
        System.out.println("Digit sum of the number " + num3 + " is " + digitSumMethod2(num3));
        System.out.println("Digit sum of the number " + num4 + " is " + digitSumMethod2(num4));
    }

    public static int digitSum(int number) {
        int sumOfDigits = 0;
        if (number > 0) {
            String stringNumber = Integer.toString(number);
            for (int i = 0; i < Integer.toString(number).length(); i++) {
                sumOfDigits += Integer.parseInt(stringNumber.substring(i, i+1));
            }
            return sumOfDigits;
        }
        return -1;
    }

    public static int digitSumMethod2(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }

}

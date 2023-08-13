public class primeNumberChallenge {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "not " : "") + "a prime number");
        }
    }

    public static boolean isPrime(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

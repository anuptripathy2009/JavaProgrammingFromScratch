public class CodeExerciseTwo {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        long result = (long) Math.round(kilometersPerHour * 0.621371);
        return result;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour + " km/h = " + Math.round(toMilesPerHour(kilometersPerHour)) + " mi/h");
        }
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
        printConversion(10.25);
    }
}

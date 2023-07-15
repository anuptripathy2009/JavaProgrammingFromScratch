public class CodingExerciseTen {
//    1 hour = 60 minutes
//    1 day = 24 hour
//    1 year = 365 days
    public static void printDaysAndYears(long minute){
        if (minute < 0) {
            System.out.println("Invalid Input");
        }
        long hour = minute / 60;
        long days = hour / 24;
        long years = days / 365;
        long remaining_days = days % 365;
        System.out.println(minute + "min = " + years + " y and " + remaining_days + " d");
    }

    public static void main(String[] args) {
        printDaysAndYears(525600);
    }
}

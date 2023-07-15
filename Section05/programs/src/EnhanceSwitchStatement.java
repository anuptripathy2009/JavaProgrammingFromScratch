public class EnhanceSwitchStatement {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));
        System.out.println(printDayOfWeek(8));
    }

//    public static String printDayOfWeek(int day) {
//        String dayOfWeek = switch (day) {
//            case 0 -> "Sunday";
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            default -> "Invalid Day";
//        }; //We can store the switch output in a variable
//        return day + " stands for " + dayOfWeek;
//    }

    // --------Bonus Challenge--------
    public static String printDayOfWeek(int day) {
        String dayOfWeek;
        if (day == 0) {
            dayOfWeek = "Sunday";
        }
        else if (day == 1) {
            dayOfWeek = "Monday";
        }
        else if (day == 2) {
            dayOfWeek = "Tuesday";
        }
        else if (day == 3) {
            dayOfWeek = "Wednesday";
        }
        else if (day == 4) {
            dayOfWeek = "Thursday";
        }
        else if (day == 5) {
            dayOfWeek = "Friday";
        }
        else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        else {
            dayOfWeek = "Invalid Day";
        }

        return day + " stands for " + dayOfWeek;
    }

}

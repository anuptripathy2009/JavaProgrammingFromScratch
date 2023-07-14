import java.sql.SQLOutput;

public class CodingExerciseFour {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay <= 23) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                }
            }
        }
        return false;
    }
}

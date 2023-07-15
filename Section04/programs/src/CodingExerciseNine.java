public class CodingExerciseNine {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
    public static double area(double length, double breadth){
        if (length < 0 || breadth < 0) {
            return -1;
        }
        return length * breadth;
    }
}

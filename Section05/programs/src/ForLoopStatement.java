public class ForLoopStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);
        }
        System.out.println("--------------------------------------------------");
        for (int i = 10; i <= 101; i += 10) {
            if (i > 80) {
                break;
            }
            int length = i + 10;
            int breadth = i;
            System.out.println("For length " + length + "m and breadth " + breadth +
                    "m, " + "the area is " + calculateArea(length, breadth) + "sqm");
        }
    }

    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}

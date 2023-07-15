public class Solved1 {
    public static void main(String[] args) {
        double firstD = 20.00;
        double secondD = 80.00;
        double sum = firstD + secondD;
        double remainder = sum % 40.00;
        boolean isZero = remainder==0?true:false;
        if (!isZero) {
            System.out.println("Machigai");
        }
    }
}

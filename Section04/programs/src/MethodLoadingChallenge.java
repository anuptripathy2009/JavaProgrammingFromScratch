public class MethodLoadingChallenge {
    public static void main(String[] args) {
        System.out.println("inches converted to centimetres : " + (convertToCentimetre(45)));
        System.out.println("foot and inches converted to centimetres : " + convertToCentimetre(5, 8));
    }

    public static double convertToCentimetre(int inch) {
        return inch * 2.54;
    }

    public static double convertToCentimetre(int feet, int inch){
        double result = convertToCentimetre((feet * 12) + inch);
        return result;
    }
}

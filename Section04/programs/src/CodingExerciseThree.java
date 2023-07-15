public class CodingExerciseThree {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaByte = kiloBytes / 1024;
        int remainderKiloByte = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Input");
        }else {
        System.out.println(kiloBytes + " KB = " + megaByte + " MB and " +
                remainderKiloByte + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-2500);
        printMegaBytesAndKiloBytes(2500);
    }
}
public class TheWhileLoopChallenge {
    public static void main(String[] args) {
        printEvenNumberUpto20();
        System.out.println();
        print_even_number_upto_20(); //same result but different approach
    }
    public static void printEvenNumberUpto20(){
        int i = 2;
        while (i < 21) {
            System.out.print(i + " ");
            i += 2;
        }
    }

    public static void print_even_number_upto_20(){
        int i = 2;
        while (i < 21) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

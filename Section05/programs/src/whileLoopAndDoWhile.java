class whileLoopAndDoWhile {
    public static void main(String[] args) {
        int i = 1;
        boolean isReady = false;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        while (isReady) {
            System.out.println("This statement will not get executed");
        }

        do {
            System.out.println("This statement will get executed once");
        } while(isReady);

        int number = 0;
        while (number < 20) {
            number += 1;
            if (number % 5 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

    }
}
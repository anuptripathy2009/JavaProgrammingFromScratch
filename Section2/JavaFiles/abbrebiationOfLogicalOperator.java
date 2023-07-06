public class abbrebiationOfLogicalOperator {
    public static void main(String[] args) {
        System.out.println("'=' and '==' are different");
        int num1 = 4; // assignment operator use
        int num2 = 4;

        boolean check = "String1" == "string1";

        // if (check == false) { //equal to operator use
        //     System.out.println("Java is case-sensitive");
        // } 
        //intead
        if (!check) {
            System.out.println("Java is case-sensitive");
        }

        if (num1 == num2) {
            System.out.println("Chicken Soup");
        }
    }
}

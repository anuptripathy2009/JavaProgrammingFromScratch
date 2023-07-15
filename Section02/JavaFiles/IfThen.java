public class IfThen {
    public static void main (String[] args) {
        System.out.println("Hello, Coder");
        boolean isHuman = false;
        if (isHuman == false) {
            System.out.println("Thank god! You are a human.");
            System.out.println("I am not scared of ghosts either....because goodness is always with me....");
        }
        int num1 = 30;
        int num2 = 40;
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        }
        
        if (num2 > num1) {
            System.out.println("num2 is greater than num1");
        }
            //true    and       //true
        if ((num1 < num2) && (num2 < 90)) {
            System.out.println("Pizza");
        }
            //false    and     //true
        if ((num1 > 40) && (num2 > num1)) {
            System.out.println("Elon musk will build a software for only my personal use");
        }

            //true     or     false
        if ((num1 > 40) || (num2 > num1)) {
            System.out.println("I can visit a foreign country.");
        }
    }
}

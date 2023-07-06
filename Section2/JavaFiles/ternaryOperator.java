public class ternaryOperator {
    public static void main(String[] args) {
        String makeOfCar = "Alto k10";
        boolean check = makeOfCar == "Alto k10"?true:false;
        //If the makeOfCar is equal is "Alto k10" then assign the variable to be true otherwise false
        if (check) {
            System.out.println("You license is verified");
        } 
        //Practical Use
        int age = 12;
        boolean canPlayCOD = age >= 16 ? true:false;

        if (canPlayCOD) { //you don't need to write (canPlayCOD == true)
            System.out.println("Your age has been verified to play Call Of Duty");
        }
        
    }
}

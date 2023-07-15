public class IfThenElse {
    public static void main(String[] args) {
        int age;
        age = 27;
        if (age >= 18) {
            System.out.println("Hi Sir...");
        }else if(age >= 16 && age <= 18) {
            System.out.println("Hmmm, you are not a school student but still you are not an adult...");
        }else {
            System.out.println("Hello Kiddo...");
        }
    }
}

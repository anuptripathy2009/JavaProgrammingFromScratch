public class SwitchStatement {
    public static void main(String[] args) {
        int value = 3;
//        switch (value) {       //Traditional Switch Statement
//            case 1:
//                System.out.println("Today is a good day");
//                break;
//            case 2:
//                System.out.println("Today is an unexpected day");
//                break;
//            case 3: case 5: case 7:
//                System.out.println("Today is a lucky day");
//                break;
//            default:
//                System.out.println("Hello, User");
//        }

        switch (value) {       //Enhance switch staement
            case 1 -> System.out.println("Today is a good day");
            case 2 -> System.out.println("Today is an unexpected day");
            case 3, 5, 7 ->{
                System.out.println("Today is a lucky day");
                System.out.println("Another useless line");
            }
            default -> System.out.println("Hello, User");
        }

        String month = "December";
        String month2 = "Invalid month";
        String personality = guessPersonality(month);
        String personality2 = guessPersonality(month2);
        System.out.println("Birth Month : " + month + "\nPersonality : " + personality);
        System.out.println("------------------------------------------------------");
        System.out.println("Birth Month :  " + month2 + "\nPersonality : " + personality);
    }

    public static String guessPersonality(String month) {
        return switch (month) {
            case "January" -> ("Bold and Alert");
            case "February" -> ("Lucky and Loyal");
            case "March" -> ("Naughty and Genius");
            case "April" -> ("Caring and Strong");
            case "May" -> ("Loving and Practical");
            case "June" -> ("Romantic and Curious");
            case "July" -> ("Adventurous and Honest");
            case "August" -> ("Stylish and Friendly");
            case "September" -> ("Sensitive and Pretty");
            case "October" -> ("Nice and Creative");
            case "November" -> ("Confident and Freedom loving");
            case "December" -> ("Confident and Freedom loving");
            default -> ("N/A");
        };
    }

}

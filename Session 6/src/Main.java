//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4, 5");
                System.out.println("Actually it was a" + switchValue);
            }
            default -> System.out.println("Value was not 1 or 2");
        }

        String month = "October";
        System.out.println(month+" is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1ST";
            case "April", "May", "June" -> "2ND";
            case "July", "August", "September" -> "3ST";
            case "October", "November", "December" -> "4ST";
            default -> {
                String badreponse = month + "is bad";
                yield badreponse;
            }
        };
    }
}
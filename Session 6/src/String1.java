public class String1 {
    public static void main(String[] args) {
        int currentYear = 2022;
        String usersDateOfBrith = "1999";

        int dateofBirth = Integer.parseInt(usersDateOfBrith);

        System.out.println("Age = " +( currentYear - dateofBirth));

        String usersAgeWithPartialYear = "22.5";
                double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
                System.out.println("the user age = " +(ageWithPartialYear));
    }
}

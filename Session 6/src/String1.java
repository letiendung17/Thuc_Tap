import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        int currentYear = 2022;
//        String usersDateOfBrith = "1999";
//
//        int dateofBirth = Integer.parseInt(usersDateOfBrith);
//
//        System.out.println("Age = " +( currentYear - dateofBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//                double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//                System.out.println("the user age = " +(ageWithPartialYear));
        try {
            System.out.println(getinputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getinputFromConsole(int currentYear) {

        String name = System.console().readLine("hi ,what your name?");
        System.out.println("hi "+name+" , Thank for taking of course!");

        String dateofbirth = System.console().readLine("hi ,what your birthdate?");
        int age = currentYear - Integer.parseInt(dateofbirth);
        return "So you are" +age+" years old";

    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        //String name = System.console().readLine("hi ,what your name?");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("hi "+name+" , Thank for taking of course!");

        //String dateofbirth = System.console().readLine("hi ,what your birthdate?");
        System.out.println("What is your birthdate?");
        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of brith>= "+(currentYear-125)+":and <= "+currentYear+":");
           try{
            age = checkData(currentYear, scanner.nextLine());
           validDOB = age < 0? false : true;}catch (NumberFormatException badUserData){
               System.out.println("You entered an invalid year");
           }
        }while(!validDOB);

        return "So you are" +age+" years old";

    }
    public static int checkData(int currentYear,String dateofbirth) {
        int dob = Integer.parseInt(dateofbirth);
        int miniyear = currentYear - 125;

        if(dob<miniyear||dob>currentYear){
            return -1;
        }
return (currentYear - dob);
    }
}

public class Baicode1 {
    public static void main(String[] args) {
        checkNumber(0);
    }
    //bai1//
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");

        }else if(number < 0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
    //bai2//
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
    //bai3//
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megabytes = kiloBytes / 1024;
            int kilobytesdu = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytesdu + " KB");
        }
    }
    //bai4//
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){

        if(hourOfDay < 0 || hourOfDay > 23){
            return false  ;
        }else if(hourOfDay < 8 || hourOfDay > 22){
            return barking;
        }
        return false ;
    }
    //bai5//
    public static boolean isLeapYear(int year){
        if(year <= 0 || year > 9999){
            return false;
        }else{
            if(year % 4 == 0 && year % 100 !=0 ){
                return true;
            }
            if(year % 100 == 0 && year % 400 == 0)
            {
                return true;
            }
            return false;
        }
    }
    //bai6//
    public static boolean areEqualByThreeDecimalPlaces(double s1,double s2)
    {
        int s3 = (int)(s1 * 1000);
        int s4 = (int)(s2 * 1000);
        if(s3 == s4){
            return true;
        }
        return false;
    }
    //bai7//
    public static boolean hasEqualSum(int s1,int s2, int s3){
        if(s1 + s2 == s3){
            return true;
        }
        return false;
    }
    //bai8//
    public static boolean hasTeen(int s1, int s2, int s3){
        if(s1 >= 13 && s1 <= 19){
            return true;
        }else if(s2 >= 13 && s2 <= 19){
            return true;
        }else if(s3 >= 13 && s3 <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int s11){
        if(s11 >= 13 && s11 <= 19){
            return true;
        }
        return false;
    }
}

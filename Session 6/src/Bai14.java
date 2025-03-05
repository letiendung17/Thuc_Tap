public class Bai14 {
    public static void main(String[] args) {
isLeapYear(2000);
getDaysInMonth(2,4000);
System.out.println("So ngay trong thang "+getDaysInMonth(2,4000));

    }
    public static boolean isLeapYear(int year){
        if(year<1 || year >9999){
            return false;
        }else{
            if(year %4 == 0 && year %100 != 0){
                return true;
            }else if(year % 100 ==0 && year % 400 == 0){
                return true;
            }else
                return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if(month <1 || month>12){
            return -1;
        }
        if(year<1 || year>9999){
            return -1;
        }
        boolean nhuan = isLeapYear(year);
        return switch(month){
            case 1,3,5,7,8,10,12 ->31;
            case 2 -> { yield nhuan ? 29 : 28; }
            default -> 30;
        };
    }
}

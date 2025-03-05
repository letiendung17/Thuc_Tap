public class challengerSwitchExp {
    public static void main(String[] args) {
printWeekOfDay(2);

printWeekDay(0);
printWeekDay(1);
printWeekDay(2);
printWeekDay(3);
printWeekDay(4);
printWeekDay(5);
printWeekDay(6);
    }
    public static void printWeekOfDay(int days){
        String dayoftheWeek;
        switch(days){
            case 0 -> {
                dayoftheWeek = "Sunday";
            }
            case 1 -> {
                dayoftheWeek = "Monday";
            }
            case 2 -> {
               dayoftheWeek = "Tuesday";
            }
            case 3 -> {
               dayoftheWeek = "Wednesday";
            }
            case 4 -> {
                dayoftheWeek = "Thursday";
            }
            case 5 ->{
               dayoftheWeek = "Friday";
            }
            case 6 ->{
                dayoftheWeek = "Saturday";
            }
            default -> {
                dayoftheWeek = "invaid day";
            }
        }
        System.out.println(dayoftheWeek);
    }
    public static void printWeekDay(int day){
        String dayoftheWeek = "Invalid day";
        if(day == 0){
            dayoftheWeek = "Sunday";
        }else if(day == 1){
            dayoftheWeek = "Monday";
        }else if(day == 2){
            dayoftheWeek = "Tuesday";
        }else if(day == 3){
            dayoftheWeek = "Wednesday";
        }else if(day == 4){
            dayoftheWeek = "Thursday";
        }else if(day == 5){
            dayoftheWeek = "Friday";
        }else if(day == 6){
            dayoftheWeek = "Saturday";
        }

        System.out.println(day + " Stand for "+dayoftheWeek);
    }
}

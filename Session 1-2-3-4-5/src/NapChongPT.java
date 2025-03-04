public class NapChongPT {
    public static void main(String[] args) {
       System.out.println("New Score is "+calculateScore("tim",500));
       System.out.println("New Score is "+calculateScore(10));

       System.out.println("người này cao " + convertToCentimeters(5,8) + " centimeters");

       System.out.println(getDuringString(20000,10));
    }

    public static int calculateScore(String playername, int score) {
        System.out.println("player: " + playername + " score: " + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
      return calculateScore("anonymus", score);
    }

    public static int calculateScore() {
        System.out.println("No player game, no more points");
        return 0;
    }
    public static double convertToCentimeters(int s1){
        double s2 = (double) (s1 * 2.54);
        return s2;
    }
    public static double convertToCentimeters(int s1, int s2){
        double s3 = convertToCentimeters(s1 *12 + s2);
        return s3;
    }
    //challenger S//
    public static String getDuringString(int seconds){
        String duringString = "Số giây phải lớn hơn hoặc bằng 1";
        if(seconds >= 0) {
            int minus = seconds / 60;
            int secondes = seconds % 60;
            int hours = minus / 60;
            int minuster = minus % 60;
            duringString = "'"+ hours + " h " +  minuster + " m " + secondes+" s";
        }
       return duringString;

    }
    public static String getDuringString(int seconds, int minutes){
        String duringString = "Số giây hoặc số phút phair không âm";
        if(seconds >= 0 && minutes >= 0 && minutes <60) {
            duringString = getDuringString(seconds + (minutes * 60));
            return duringString;
        }
        return duringString;
    }
}

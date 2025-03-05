public class bai17 {
    public static void main(String[] args) {
        int s = 1992;
        System.out.println("tổng số đầu và số cuối "+s+" là "+sumFirstAndLastDigit(s));
    }
    public static int sumFirstAndLastDigit(int number){
        int sodau = number;
        int socuoi = number%10;
        if (number<0){
            return -1;
        }else{

            while(sodau>=10){
                sodau/=10;
            }
            return(sodau + socuoi);
        }
    }
}

public class Bai15 {
    public static void main(String[] args) {
sumOdd(4,9);
    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        if(number %2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        if(start>end || end <= 0 || start <= 0){
            return -1;
        }
        int sum = 0;
        for(; start<=end; start++){
            if(isOdd(start)){
                sum = sum + start;
            }
        }
        return sum;
    }
}

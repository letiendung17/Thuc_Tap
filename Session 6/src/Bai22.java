public class Bai22 {
    public static void main(String[] args) {
int s = getGreatestCommonDivisor(1,99);
System.out.println(s);
    }
    public static int getGreatestCommonDivisor(int first,int second){
        if(first<10||second<10){
            return -1;
        }
        int min = Math.min(first, second);
        for (int i = min; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

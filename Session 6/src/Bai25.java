public class Bai25 {
    public static void main(String[] args) {
System.out.println(canPack(10,2,100));
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int maxBigbag = goal/5;
        int useBigbag = Math.min(maxBigbag,bigCount);
        int soKgconlai = goal - (useBigbag*5);
        return soKgconlai <= smallCount;
    }
}

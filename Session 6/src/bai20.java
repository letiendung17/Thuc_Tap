public class bai20 {
    public static void main(String[] args) {
System.out.println(hasSameLastDigit(1,2,3));

System.out.println(isValid(12));
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a<10||a>1000||b<10||b>1000||c<10||c>1000){
            return false;
        }else{
            int Na=a%10;
            int Nb=b%10;
            int Nc=c%10;
            if(Na==Nb || Nb==Nc || Na==Nc){
                return true;
            }return false;
        }
    }

    public static boolean isValid(int a){
        if(a>=10&&a<=1000){
            return true;
        }else
            return false;

    }
}

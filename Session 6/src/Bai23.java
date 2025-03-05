public class Bai23 {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(10));
    }
    public static boolean isPerfectNumber(int a){
        int sum=0;
        if(a<1){
            return false;
        }else{

            for(int i=1;i<=a/2;i++){
                if(a%i==0){
                    sum= sum+i;
                }
            }
        }
        if(a==sum){
            return true;
        }
        return false;
    }
}

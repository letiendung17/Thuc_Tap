public class Bai16 {
    public static void main(String[] args) {
        int a = 121;
        if(isPalindrome(a)){
         System.out.println(a+" la so dao nguoc");
        }else
            System.out.println(a+" khongla so dao nguoc");
    }
    public static boolean isPalindrome(int number){
        int numbergoc = number;
        int reverse = 0;
        int socuoi = 0;
        number = Math.abs(number);
        while(number>0){
            socuoi = number % 10;
            reverse = reverse * 10 + socuoi;
            number = number / 10;
        }
        if(reverse == Math.abs(numbergoc)){
            return true;
        }else
            return false;
    }
}

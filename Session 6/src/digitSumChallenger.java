public class digitSumChallenger {
    public static void main(String[] args) {
System.out.println("tong cua cac chu so 1234 la :"+Sumdigits(1234));
    }
    public static int Sumdigits(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;

        while(number > 9){
            sum += (number % 10);
            number = number/ 10;

        }
        sum += number;
        return sum;
    }
}

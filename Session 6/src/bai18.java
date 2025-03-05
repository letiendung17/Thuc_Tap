public class bai18 {
    public static void main(String[] args) {

        int s = 0;
        s = getEvenDigitSum(122);

        System.out.println(s);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;

            while (number > 0) {
                int digits = number % 10;
                if (digits % 2 == 0) {
                    sum = sum + digits;
                }
                number /= 10;
            }
            return sum;
        }
    }
}

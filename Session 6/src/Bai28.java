import java.util.Scanner;
public class Bai28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            count++;
        }

        long average = (count == 0) ? 0 : Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
//    public static void inputThenPrintSumAndAverage() {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//        while (scanner.hasNextInt()) {
//            int number = scanner.nextInt();
//            sum += number;
//            count++;
//        }
//
//        long average = (count == 0) ? 0 : Math.round((double) sum / count);
//        System.out.println("SUM = " + sum + " AVG = " + average);
//
//    }
}

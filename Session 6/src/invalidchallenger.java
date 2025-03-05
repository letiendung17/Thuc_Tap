import java.util.Scanner;

public class invalidchallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum =0;

        do {
            System.out.print("Enter the number #"+counter+": ");
            String nextNumber = scanner.nextLine();
            try {
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException badUserData){
                System.out.println("You entered an invalid number");
            }
            System.out.println("Sum: "+sum);
        }while (counter < 5);
    }
}

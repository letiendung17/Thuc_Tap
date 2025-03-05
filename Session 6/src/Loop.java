public class Loop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }


        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000,rate);
            System.out.println("10,000 at 2% interest = "+interestAmount);
        }

        for(double rate1 = 7.5; rate1 <= 10; rate1+=0.25){
            double interest = calculateInterest(100,rate1);
            if(interest > 8.5){
                break;
            }
            System.out.println("$100 at 2% interest = "+interest);
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}

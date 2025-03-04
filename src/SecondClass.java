public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello, Dung");

        boolean isAline = false;
        if (isAline == false) {
            System.out.println("this is Aline");
            System.out.println("and i am scare Aline");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("you got highscore");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("great than secondTopScore and less than 100");
        }

        if((topScore > 90)||(secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("this is not Suppose to happen");
        }

        String makeOFCar = "Volkswagen";
        boolean isDomestic = makeOFCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("this car is domestic to our country");
        }

        String s = (isDomestic) ? "this car is domestic" : "this car is not domestic";

        System.out.println(s);

        double value1 = 20.00d;
        double value2 = 80.00d;
        double total = (value1 + value2) * 100;
        System.out.println("Total is : " + total);
        double remaintotal = total % 40.00d;
        System.out.println("remain total is : " + remaintotal);
        boolean isChiahet = (remaintotal == 0) ? true : false;
        System.out.println(isChiahet);
        if(!isChiahet){
        System.out.println("got some remainder");
}
    }
}

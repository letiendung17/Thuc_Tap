public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, Dung");

        double kilometers = (100 * 1.609334);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        int health = 100;

        if ((health < 50) && (health > 1000)) {
            highScore = highScore - 1000;
        }

        int newvailable = 50;

        newvailable++;
        newvailable--;

        System.out.println("this is a test");

        System.out.println("thisis" +
                "another" +
                "still more");

        int anothervailable = 50;
        newvailable--;
        System.out.println("newvailable = " + newvailable);

        if(newvailable == 0){
            System.out.println("it now zero");
        }

        //Khối mã//
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000){
            System.out.println("Your Score was less than 5000 but greater than 1000");
        }else if(score < 1000){
            System.out.println("Your Score was less than 1000");
        }else{
            System.out.println("Got Here");
        }
    }
}

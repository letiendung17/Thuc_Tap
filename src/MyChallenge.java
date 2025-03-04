import java.util.Scanner;

public class MyChallenge {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 10000;
//        int levelComplete = 8;
//        int bonus = 200;
//
//        int finalScore = score;
//
//        if(gameOver == true){
//            finalScore +=(levelComplete * bonus);
//            System.out.println("Final score is : " + finalScore);
//        }

        boolean newgameOver = true;
        int newscore = 800;
        int newlevelComplete = 5;
        int newbonus = 100;

        int highScore = calculateScore(newgameOver, newscore, newlevelComplete, newbonus);
        System.out.println("High score is : " + highScore);

        newscore = 10000;
        newlevelComplete = 8;
        newbonus = 200;

        System.out.println("the next High score is : " +
         calculateScore(newgameOver, newscore, newlevelComplete, newbonus));

        inThongBao("Nguyen Van A",calculateHighScorePosition(1500));
        inThongBao("Nguyen Van B",calculateHighScorePosition(1000));
        inThongBao("Nguyen Van C",calculateHighScorePosition(500));
        inThongBao("Nguyen Van D",calculateHighScorePosition(100));
        inThongBao("Nguyen Van D",calculateHighScorePosition(25));

    }

    public static int calculateScore(boolean newgameOver, int newscore,int newlevelComplete, int newbonus) {

        int newfinalScore = newscore;

        if(newgameOver){
            newfinalScore +=(newlevelComplete * newbonus);
            newfinalScore += 10000;
        }

        return newfinalScore;
    }

    public static void inThongBao(String s,int vitri) {
        System.out.println(s + " Managed to get into position " + vitri + " on high score list");
    }

    public static int calculateHighScorePosition(int diem){
        int result;
        if(diem>=1000){
            result = 1;
        }else if(diem >= 500){
            result = 2;
        }else if (diem >= 100){
            result = 3;
        }else{
            result = 4;
        }

        return result;

    }
}

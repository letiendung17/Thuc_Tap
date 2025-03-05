import java.util.Scanner;

public class primeChallenge {
    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0) ? "" : " Not") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : " Not") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : " Not") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : " Not") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : " Not") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : " Not") + "a prime number");

        int dem = 0;
        for (int bodem = 0; bodem <= 1000; bodem++) {
            if (dem == 3){
                System.out.println("Found 3 - exit for loop ");
                break;
            }

            if (isPrime(bodem)) {
                System.out.println(bodem + " is a prime number");
                dem++;
            }
        }
        System.out.println("So nguyen to giua 0 va 1000 là : "+dem);

        int dem2 = 0;
        for(int i = 10; dem2<3 && i <50;i++){
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                dem2++;
            }
        }

    }


    public static boolean isPrime(int Wholenumber) {

        if (Wholenumber <= 2) {
            return (Wholenumber == 2);
        }

        for (int divisior = 2; divisior <= Wholenumber / 2; divisior++) {
            if (Wholenumber % divisior == 0) {
                return false;
            }
        }

        return true;

    }
}

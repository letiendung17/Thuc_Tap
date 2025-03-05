public class Sum3N5changlle {
    public static void main(String[] args) {

        int tong = 0;
        int dem = 0;

        for(int i=1;i<=1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("so chia het cho ca 3 va 5 la : "+i);
                tong = tong + i;
                dem++;
                        if(dem == 5){
                            System.out.println("Tong cua cac so tren la : "+tong);
                            break;
                        }
            }
        }
    }
}

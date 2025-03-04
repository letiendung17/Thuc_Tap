public class Baicode2 {
    public static void main(String[] args) {

    }
    //bai9//
    public static double area(double radius){
        if(radius <0){
            double s = -1;
            return s;
        }
        double s = radius * radius * Math.PI;
        return s;
    }
    public static double area(double x,double y){
        double a = -1;
        if(x<0)
        {
            return a;
        }
        if(y<0){
            return a;
        }
        double b = x * y;
        return b;
    }
//bai11//
    public static void printEqual(int a, int b, int c){
        if(a<0||b<0||c<0){
            System.out.println("Invalid Value");
        }else
        if(a==b && b==c && c==a){
            System.out.println("All numbers are equal");
        }else
        if(a==b||b==c||c==a){
            System.out.println("Neither all are equal or different");
        }else
            System.out.println("All numbers are different");
    }
    //bai12//
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer == true){
            if(temperature>=25 && temperature<=45){
                return true;
            }
            return false;
        }else{
            if(temperature>=25 && temperature <=35){
                return true;
            }
            return false;
        }
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        int sodau = 1;
        System.out.println(sodau);
        sodau = 10;
        System.out.println(sodau);
        sodau = 1000;
        System.out.println(sodau);
        sodau = 1+1;
        System.out.println(sodau);
        sodau = (10+5)+(10*5);
        int sohai = 12;
        int soba = 6;
        int tong = sodau + sohai + soba;
        System.out.println(tong);
        soba = sodau * 2;
        tong = sodau + sohai + soba;
        System.out.println(tong);
        int biencuoi = 1000 - tong;
        System.out.println(biencuoi);
        int giatri = 10000;
        int mingiatri = Integer.MIN_VALUE;
        System.out.println(giatri);
        System.out.println(mingiatri);
        int maxgiatri = Integer.MAX_VALUE;
        System.out.println(maxgiatri);
        System.out.println("Integer Minimum value = " + Integer.MIN_VALUE);
        System.out.println("Integer Maximum value = " + maxgiatri);
        System.out.println("Integer value range  (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
     System.out.println("Buster max value = " + (maxgiatri + 1));
     System.out.println("Buster min value = " + (mingiatri - 1));
     int mymaxtest = 2_147_483_647;
     System.out.println(mymaxtest);
        System.out.println("Byte value range  (" + Byte.MIN_VALUE + "to" + Byte.MAX_VALUE + ")");
        System.out.println("Short value range  (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
    long mylongvalue = 100L;
    System.out.println(mylongvalue);
    System.out.println("a Long has width of size " + Long.SIZE);
        System.out.println("Long value range  (" + Long.MIN_VALUE + "to" + Long.MAX_VALUE + ")");
        long biglongvalue = 2_147_483_647;
        System.out.println(biglongvalue);
        short myshortvalue = 32767;
        System.out.println(myshortvalue);
        short myminshortvalue = Short.MIN_VALUE;
        int myminintvalue = Integer.MIN_VALUE;
        byte myminbytevalue = Byte.MIN_VALUE;
        byte mymaxbytevalue = Byte.MAX_VALUE;
        byte byteone = 1, bytetwo = 2;
        System.out.println(byteone);
        System.out.println(bytetwo);

        int tongcuatoi = (myminintvalue/2);
        System.out.println(tongcuatoi);

        byte mynewbytevalue = (byte)(myminbytevalue/2);
        System.out.println(mynewbytevalue);

        short mynewshortvalue = (short)(myminshortvalue/2);
        System.out.println(mynewshortvalue);

        byte bytechallengevalue = 23;
        short shortchallengevalue = 49;
        int intchallengevalue = 199;
        long totalvalue = 50000L + 10L * (bytechallengevalue + shortchallengevalue + intchallengevalue);
        System.out.println(totalvalue);
        short shorttotalvalue = (short)(1000 + 10 *(bytechallengevalue + shortchallengevalue + intchallengevalue));
    System.out.println(shorttotalvalue);

    System.out.println("Float value range = ("+Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
    System.out.println("Double value range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
    float  valuefloat = 5;
    double valuedouble = 5;
    System.out.println(valuefloat);
    System.out.println(valuedouble);
    valuefloat = 5f;
    valuedouble = 5d;

    float myotherfloatvalue = (float) 5.25;
    System.out.println(myotherfloatvalue);

    int nguyenvalue = 5;
    float floatvalue = 5f;
    double doublevalue = 5d;
    nguyenvalue = 5/2;
    System.out.println(nguyenvalue);
    floatvalue = 5f/2f;
    System.out.println(floatvalue);
    doublevalue = 5d/2d;
    System.out.println(doublevalue);
    nguyenvalue = 5/3;
    floatvalue = 5f/3f;
    doublevalue = 5d/3d;
    System.out.println(nguyenvalue);
    System.out.println(floatvalue);
    System.out.println(doublevalue);
    doublevalue = 5.00/3.00;
    System.out.println(doublevalue);

    double pound = 100d;
    double convertkilo = pound * 0.45359237d;
    System.out.println(convertkilo);

    double pi = 3.1415927d;
    System.out.println(pi);

    char mychar = 'D';
    System.out.println(mychar);
    char myunicode = '\u0004';
    System.out.println(myunicode);
    char demical = 68;
    System.out.println(demical);
    char testchar='?';
    char testunicode = '\u003f';
    char testdmical = 63;
    System.out.println(testdmical);
    System.out.println(testchar);
    System.out.println(testunicode);

    boolean trueboolen = true;

    String myString = "thisisstring";
    System.out.println("my string is " + myString);
    myString = myString + "and this more";
    System.out.println(myString + "and more");
    myString = "I wish i had \u00241,000,000";
    System.out.println(myString);

    String laststring = "10"; int myInt = 50;
    laststring = laststring + myInt;
    System.out.println(laststring);
double doublevalue1 = 120.47;
laststring = laststring + doublevalue1;
System.out.println(laststring);

int ketqua = 1 + 2;
System.out.println(ketqua);
int ketquatruoc = ketqua;
ketqua = ketqua - 1;
System.out.println(ketqua);
System.out.println(ketquatruoc);
char fristrchar = 'A';
char secondchar = 'B';
System.out.println(fristrchar+secondchar);
System.out.println(""+fristrchar+fristrchar);
ketqua = 2;
ketqua = ketqua * 10;
System.out.println(ketqua);
ketqua = ketqua/4;
System.out.println(ketqua);
ketqua = 5;
ketqua = ketqua % 3; //5%3//
        System.out.println(ketqua);

        int results = 1;
        results = results + 1;
        System.out.println("results = " + results);

        results = 1;
        results++;
        System.out.println("results = " + results);

        results = 1;
        results--;
        System.out.println("results = " + results);

        results = 1;
        results -= 1;
        System.out.println("results = " + results);

        results = 1;
        results += 2;
        System.out.println("results = " + results);

        results = 1;
        results += 5;
        System.out.println("results = " + results);

        results = 10;
        results -=9;
        System.out.println("results = " + results);

        results = 10;
        results -= 5.5;
        System.out.println("results = " + results);

        results = 10;
        results = (int)(results - 5.5);
        System.out.println("results = " + results);

        double results1 = 10;
        results1 = results1 - 5.5;
        System.out.println("results = " + results1);

        results1 = 10;
        results1 *= 1.5;
        System.out.println("results = " + results1);

        results1 = 10;
        results1 /= 1.5;
        System.out.println("results = " + results1);
    }
    }


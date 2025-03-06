public class TextBox {
    public static void main(String[] args) {
        String bullet = "print a bulletd list:\n"+
                "\t\u2022 First Point"+
                "\t\t\u2022 sub point";
        System.out.println(bullet);

        String textbox = """
                Print a bulletd list:
                    \u2022 First Point
                    \u2022 sub point
                """;
        System.out.println(textbox);

        int age = 35;
        System.out.printf("age = %d\n", age);

        int yearOfBirth = 2023 - age;
System.out.printf("age = %d yearOfBirth = %d\n", age,yearOfBirth);

System.out.printf("yourAge is = %f%n",(float) age);

for(int i = 1; i <= 10000; i *= 10) {
    System.out.printf("yearOfBirth = %6d%n \n", i);
}
String formatString = String.format("Tour day is %d", age);
System.out.println(formatString);

formatString = "your age is %d".formatted(age);
System.out.println(formatString);
    }


}

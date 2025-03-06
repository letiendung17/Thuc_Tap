public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int staringIndex = birthDate.indexOf("1982");
        System.out.println("staringIndex = "+staringIndex);
        System.out.println("birthYear = "+birthDate.substring(staringIndex));

        System.out.println("birthMonth = "+birthDate.substring(3,5));

        String newDate = String.join("/","25","11","1982");
        System.out.println("newDate = "+newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = "+newDate);

        newDate = "25"+"/"+"11"+"/"+"1982";
        System.out.println("newDate = "+newDate);

        newDate="25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = "+newDate);

        System.out.println(newDate.replace('/','_'));
        System.out.println(newDate.replace("22","00"));

        System.out.println(newDate.replaceFirst("/","_"));
        System.out.println(newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("   ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}

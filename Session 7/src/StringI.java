public class StringI {
    public static void main(String[] args) {
printInforMation("Hello word");

printInforMation("");

printInforMation("\t   \n");

String helloworld = "Hello World";

System.out.printf("index of r = %d %n", helloworld.indexOf("r"));

System.out.printf("index of world = %d %n", helloworld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloworld.indexOf("l"));

        System.out.printf("index of l = %d %n", helloworld.lastIndexOf("l"));

        System.out.printf("index of l = %d %n", helloworld.indexOf("l",3));

        System.out.printf("index of l = %d %n", helloworld.lastIndexOf("l",8));

        String helloWorldLower=helloworld.toLowerCase();
        if(helloWorldLower.equals(helloWorldLower)){
            System.out.println("values match exactly");
        }

        if(helloWorldLower.equalsIgnoreCase(helloWorldLower)){
            System.out.println("values match ignore case");
        }

        if(helloworld.startsWith("Hello")){
            System.out.println("String starts with 'Hello'");
        }

        if(helloworld.endsWith("World")){
            System.out.println("String ends with 'World'");
        }

        if(helloworld.contains("World")){
            System.out.println("String contains 'World'");
        }

        if(helloworld.contentEquals("Hello World")){
            System.out.println("String content = 'Hello World'");
        }

    }
    public static void printInforMation(String string){
int length = string.length();

if(string.isEmpty()){
    System.out.println("Empty string");
    return;
}

if(string.isEmpty()){
    System.out.println("Empty blank");
    return;
}

System.out.printf("length = %d %n", length);
System.out.printf("first char = %c %n", string.charAt(0));

System.out.printf("last char = %c %n", string.charAt(length-1));
    }
}

public class StringBuilder1 {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        helloWorld.concat("and say goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("hello" + "World");
        helloWorldBuilder.append("and say goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder helloWorldBuilderplus = new StringBuilder("hello" + "World");
        helloWorldBuilderplus.append("and say goodbye");

        helloWorldBuilderplus.deleteCharAt(16).insert(16,'g');
        System.out.println(helloWorldBuilderplus);

        helloWorldBuilderplus.replace(16,17,"G");
        System.out.println(helloWorldBuilderplus);

        helloWorldBuilderplus.reverse().setLength(7);
        System.out.println(helloWorldBuilderplus);

        ;

    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }

}

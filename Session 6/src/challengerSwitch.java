public class challengerSwitch {
    public static void main(String[] args) {
        char S = 'A';
        switch (S){
            case 'A':
                System.out.println(S+" is a Able");
                break;
            case 'B':
                System.out.println(S+" is a Baker");
                break;
            case 'C':
                    System.out.println(S+" is a Charlie");
                    break;
            case 'D':
                System.out.println(S+" is a Dog");
                break;
            case 'E':
                System.out.println(S+" is a Easy");
                break;
                default:
                    System.out.println(S+" is not a found");
                    break;
        }
    }
}

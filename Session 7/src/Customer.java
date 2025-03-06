public class Customer {
    private String name;
    private int creditLimit;
    private String emailaddress;

    public Customer(String name, int creditLimit, String emailaddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailaddress = emailaddress;
    }

    public Customer() {
        this("nobody","nobody@gmail.com");
    }

    public Customer(String name,String emailaddress) {
        this(name ,100,emailaddress);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}

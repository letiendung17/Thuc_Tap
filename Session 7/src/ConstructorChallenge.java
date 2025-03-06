public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 1090, "tim@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getEmailaddress());
        System.out.println(customer.getCreditLimit());

        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmailaddress());
        System.out.println(customer2.getCreditLimit());

        Customer customer3 = new Customer("Tim", "tim@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailaddress());
        System.out.println(customer3.getCreditLimit());
    }
}

public class ClasserChallenge {
    public static void main(String[] args) {
//BankAcount bankAcount = new BankAcount(100.0,500.0,"Le Van hieu","tada@gmail.com","123");
BankAcount bankAcount = new BankAcount();

System.out.println(bankAcount.getAccountNumber());
System.out.println(bankAcount.getAccountBalance());

bankAcount.rutien(1000);
bankAcount.guitien(250);
bankAcount.rutien(50);

BankAcount bankAcount2 = new BankAcount("tim", "tim@tim.com", "tim@tim.com");
System.out.println("Account number: " + bankAcount2.getAccountNumber()+" custom name: " + bankAcount2.getCustomerName());
    }
}

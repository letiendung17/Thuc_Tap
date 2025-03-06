public class BankAcount {
    private double accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phone;

    public BankAcount(){
        this(100.0,200.0,"NguyenVanA","gg@gmail.com","299999");
        System.out.println("Empty constructor call");
    }

    public BankAcount(double accountNumber, double accountBalance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        //setAccountNumber(accountNumber);
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = email;
        phone = phone;
    }

    public BankAcount(String customerName, String email, String phone) {

        this(999.0,200.0,customerName,email,phone);
       //this.customerName = customerName;
        //this.email = email;
        //this.phone = phone;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
public void print() {
        System.out.println("ten tai khoan "+customerName+" "+email+" "+phone+"So du tai khoan"+accountBalance);
}

public void guitien(double amount) {
accountBalance += amount;
System.out.println("so tien gui"+ amount +" tai khoan hien tai "+this.accountBalance);
}
public void rutien(double amount) {
        if(accountBalance - amount <0){
            System.out.println("So du tai khoan khong du ban chi co :"+this.accountBalance);
        }else{
            accountBalance -= amount;
            System.out.println("So tien da rut"+amount+" tai khoan "+this.accountBalance);
        }
}
}

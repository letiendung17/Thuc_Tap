public class HourlyEmployee extends Employee{
    private double hourlySalary;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlySalary) {
        super(name, birthDate, hireDate);
        this.hourlySalary = hourlySalary;
    }
    @Override
    public double collectPay() {
        return 40*hourlySalary;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }
}

public class SalariedEmployee extends Employee {
    double anuualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double anuualSalary) {
        super(name, birthDate, hireDate);
        this.anuualSalary = anuualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = anuualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustedPay;
    }

    public void retired() {
        terminate("12/12/2025");
        isRetired = true;
    }
}

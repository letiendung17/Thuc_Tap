public class InhantenceChallenge {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020",3500);
        System.out.println(joe);
        System.out.println("Salary = " + joe.collectPay());

        joe.retired();
        System.out.println("joe pension check = " + joe.collectPay());


        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970","03/03/2021",15);
                System.out.println(mary);
                        System.out.println("Salary = " + mary.collectPay());
        System.out.println("Salary = " + mary.getDoublePay());

        }
    }


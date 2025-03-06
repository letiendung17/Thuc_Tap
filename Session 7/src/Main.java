//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porche");
        car.setColor("Blue");
        car.setModel("carrer");
        car.setDoors(2);
        car.setConvertible(true);


        System.out.println("make= " + car.getMake());
        System.out.println("model= " + car.getModel());
        car.describeCar();


        Car car2 = new Car();
        car2.setMake("Porche");
        car2.setColor("Blue");
        car2.setModel("carrer");
        car2.setDoors(3);
        car2.setConvertible(true);

        car2.describeCar();

    }
}
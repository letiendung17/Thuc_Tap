public class Fish extends Animal {

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "Small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    public void moveMuscle() {
        System.out.println("Muscle moving");
    }

    public void moveBackFins(){
        System.out.println("Bacfins moving");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills='" + gills + '\'' +
                ", fins='" + fins + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();
        if(speed == "fast") {
            moveBackFins();
        }
      System.out.println();
    }
}

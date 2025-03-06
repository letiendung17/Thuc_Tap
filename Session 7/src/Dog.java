public class Dog extends Animal {
   private String earShape;
   private String tailShape;

   public Dog(String type,double weight){
       this(type,weight,"perky","curled");
   }
    public Dog() {
        super("mutt","big",50);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15?"Small":(weight<35? "medium":"big"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public void makeNoise() {
if(type=="Wolf"){
    System.out.println("Wooof!");
}
       bark();
       System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("dog run, walking ");
        if (speed =="slow") {
    walk();
    wagTail();
        }else{
            bark();
            run();
        }
System.out.println();
    }

    public void bark(){
       System.out.println("dog bark");
    }

    public void run(){
        System.out.println("dog run");
    }

    public void walk(){
        System.out.println("dog walking");
    }

    public void wagTail(){
       System.out.println("dog wag tail");
    }


}

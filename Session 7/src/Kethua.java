public class Kethua {
    public static void main(String[] args) {
Animal animal = new Animal("lion","huge",400);
doAnimalStuff(animal,"Slow");

Dog dog = new Dog();
doAnimalStuff(dog,"fast");

Dog jorky = new Dog("yorky",15);
doAnimalStuff(jorky,"fast");

Dog dog2 = new Dog("labrador Retirever",65,"ploopy","swimmer");
doAnimalStuff(dog2,"fast");

Dog wofl = new Dog("Wolf",40);
doAnimalStuff(wofl,"fast");

Fish ca = new Fish("Gold fish",0.25,2,3);
doAnimalStuff(ca,"fast");

    }
    public static void doAnimalStuff(Animal animal,String speed) {
animal.makeNoise();
animal.move(speed);
System.out.println(animal);
System.out.println("____");
    }
}

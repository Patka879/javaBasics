package edu.sda.java.advanced.abstraction2;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal bird = new Bird("Tweety", true, false);
        Animal fish = new Fish("Nemo", "sea fish");
        Animal elephant = new Elephant("Dumbo", "african elephant");
        Animal whale = new Animal("Olivier") {
            @Override
            public void move() {

                System.out.println("This is a whale");
            }
        };

        Animal[] animals = new Animal[]{bird, fish, elephant, whale};

        System.out.println("Loop over all animals");
        for (Animal animal : animals) {
           System.out.println("Animal name: " + animal.getName());
           animal.move();
           if(animal instanceof Bird) {
               ((Bird) animal).birdInfo();
           }
            if(animal instanceof Elephant) {
                ((Elephant) animal).elephantOrigin();
            }
            if(animal instanceof Fish) {
                ((Fish) animal).fishType();
            }
            System.out.println("================");
        }
    }
}

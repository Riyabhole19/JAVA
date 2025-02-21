class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat.");
    }
    
    void sound() {
        System.out.println("Lion roars.");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats deer.");
    }
    void sound() {
        System.out.println("Tiger growls.");
    }
}

class Panther extends Animal {
   
    void eat() {
        System.out.println("Panther eats small animals.");
    }
  
    void sound() {
        System.out.println("Panther hisses.");
    }
}

public class AnimalEatSoundDemo {
    public static void main(String[] args) {
        Animal myAnimal;
        
        myAnimal = new Lion();
        myAnimal.eat();
        myAnimal.sound();
        
        myAnimal = new Tiger();
        myAnimal.eat();
        myAnimal.sound();
        
        myAnimal = new Panther();
        myAnimal.eat();
        myAnimal.sound();
    }
}

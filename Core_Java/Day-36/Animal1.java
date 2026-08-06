abstract class Animal1 {

    public abstract void animalSound(); // Abstract method (does not have a body)

    public void sleep() {
        System.out.println("Zzz");
    }
    
}

class Pig extends Animal1{

    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal1{

    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}

class Main{
    public static void main(String[] args){

        Animal1 myAnimal = new Pig();
        myAnimal.animalSound();
        myAnimal.sleep();

        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();

        Animal1 myAnimal1 = new Dog();
        myAnimal1.animalSound();
    }
}

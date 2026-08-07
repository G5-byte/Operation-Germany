interface Flying {

    public void fly();
}

interface Swimming {

    public void swim();
}

class Duck implements Flying, Swimming {

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}

class Main{
    public static void main(String[] args){

        Duck myDuck = new Duck();  // Create a Duck object
        myDuck.fly();
        myDuck.swim();
    }
}

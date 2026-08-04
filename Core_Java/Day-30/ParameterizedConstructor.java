public class ParameterizedConstructor {

    String name;
    int age;

    ParameterizedConstructor(String name, int age){
       this.name = name;
       this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args){

        ParameterizedConstructor obj = new ParameterizedConstructor("John Doe", 30);

        obj.displayInfo();
    }
    
}

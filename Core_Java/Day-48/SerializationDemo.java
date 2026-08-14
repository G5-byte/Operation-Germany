import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{

    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Student id : " + id);
        System.out.println("Student name : " + name);
    }
}

class SerializationDemo{
    public static void main(String[] args) {
        
        Student student = new Student(75,  "Nikhil");

        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("student.ser"))){

            output.writeObject(student);

            System.out.println("Object Serialized successfully");

        }catch(IOException e){
            System.out.println("An error occured during the process of Serialization" + e.getMessage());
            e.printStackTrace();
        }
    }
}
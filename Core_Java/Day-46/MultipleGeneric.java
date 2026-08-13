class Pair<k,V>{

    private k key;
    private V value;

    public Pair(k key, V value){
        this.key = key;
        this.value = value;
    }
    
    public void displayInfo(){
        System.out.println("key : " + key);
        System.out.println("Value : " + value);
    }
}

class MultipleGeneric{
    public static void main(String[]args){

        Pair<String, Integer> student = new Pair<>("Nikhil", 75);
        student.displayInfo();
    }
}

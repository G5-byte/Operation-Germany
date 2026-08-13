class Printer<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }    

}

class GenericPrinter{
    public static void main(String[] args) {
        
        Printer<String> name = new Printer<>();
        name.setValue("Nikhil");
        System.out.println("Name : " + name.getValue());

        Printer<Integer> rollNum = new Printer<>();
        rollNum.setValue(75);
        System.out.println("Roll Number : " + rollNum.getValue());

        Printer<Double> percentage = new Printer<>();
        percentage.setValue(74.5);
        System.out.println("Percentage : " + percentage.getValue());

    }
}

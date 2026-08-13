class Box<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

class GenericClass{
    public static void main(String[] args){

        Box<String> StringBox = new Box<>();
        StringBox.setValue("Nikhil");

        Box<String> IntegerBox = new Box<>();
        IntegerBox.setValue("0075");
        int num = Integer.parseInt(IntegerBox.getValue());

        Box<Integer> IntBox = new Box<>();
        IntBox.setValue(75);


        System.out.println("StringBox Value : " + StringBox.getValue());
        System.out.println("IntegerBox Value : " + IntegerBox.getValue());
        System.out.println("Parsed num : " + num);
        System.out.println("IntBox Value : " + IntBox.getValue());

    }
}
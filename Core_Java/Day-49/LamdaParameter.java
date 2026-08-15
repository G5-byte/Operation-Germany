interface Addition{

    int add(int a, int b);

}

class LamdaParameter{
    public static void main(String[] args) {
        
        Addition addition = (a, b) -> a + b;
        
        System.out.println("Sum = " + addition.add(5,5 )); 
        System.out.println("Sum = " + addition.add(10, 20 )); 
    }
}
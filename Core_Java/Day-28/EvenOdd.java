public class EvenOdd {
    public static void isEven(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an Even number");
        }else{
            System.out.println(num + " is an Odd number");
        }
        
    }

    public static void main(String[] args){

        isEven(10);
        isEven(15);

        
    }
}

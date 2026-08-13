public class GenericMethod {

    public static <T> void printArray(T[] array){
        for(T items : array){
            System.out.println(items);
        }
    } 

    public static void main(String[] args){

        String[] names = {"Nikhil", "Praduem"};

        Integer[] birthDate = {10, 20};

        printArray(names);
        printArray(birthDate);
    }
    
}

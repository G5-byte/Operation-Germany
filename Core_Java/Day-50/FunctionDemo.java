import java.util.function.Function;

class User{

    private final String name;
    private final String email;
    
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {return name; }
    public String getEmail() {return email; }

}
public class FunctionDemo {
    public static void main(String[] args){
        //Getting user's E-mail address
        User user = new User("Nikhil Chauhan", "nikhilchauhan1027@gmail.com");

        Function<User, String> getEmailFunction = User::getEmail;
        System.out.println(getEmailFunction.apply(user));

        System.out.println();

        Function<String, Integer> stringLength = str -> str.length();

        System.out.println(stringLength.apply("Hello World!"));

        System.out.println();
        //Combining two function<T, R>
        Function<Integer, Integer> multiplyFunction = n -> n * 2;
        Function<Integer, Integer> addFunction = n -> n + 10;

        //.andThen() method {function1 -> funvtion2}
        Function<Integer, Integer> combinedFunction = multiplyFunction.andThen(addFunction);
        System.out.println(combinedFunction.apply(5));

        System.out.println();

        //.compose() method {function2 -> function1}
        Function<Integer, Integer> combinedFunction2 = multiplyFunction.compose(addFunction);
        System.out.println(combinedFunction2.apply(5));


    }
    
}

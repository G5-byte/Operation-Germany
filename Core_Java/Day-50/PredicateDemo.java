import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {
        
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println();
        System.out.println(isEven.test(13));
        System.out.println();

        Predicate<String> isShort = str -> str.length() < 6;
        Predicate<String> containsE = str -> str.contains("e");
        
        Predicate<String> shortandContainsE = isShort.and(containsE);

        System.out.println(shortandContainsE.test("Elephant"));
        System.out.println();
        System.out.println(shortandContainsE.test("Tiger"));
        System.out.println();

        Predicate<String> shortorContainsE = isShort.or(containsE);

        System.out.println(shortorContainsE.test("Elephant"));
        System.out.println();
        System.out.println(shortorContainsE.test("Tiger"));
        System.out.println();

        Predicate<String> longAndNoE = shortandContainsE.negate();

        System.out.println(longAndNoE.test("Elephant"));
    }

}
    


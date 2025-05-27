import java.util.*;

public class LambdaSort{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Alice", "John", "Bob");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}

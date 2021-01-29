package FunctionalProgrammingLabTasks;
import java.util.function.Predicate;

public class MyString {
    public static Predicate<String> startsWithUppercase
            = str -> str != null
            && !str.isEmpty() && Character.isUpperCase(str.charAt(0));
}
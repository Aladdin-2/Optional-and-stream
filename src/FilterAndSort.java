import java.util.List;
import java.util.function.Predicate;

public class FilterAndSort {
    public static void main(String[] args) {

        List<String> names = List.of("ab", "ac", "aa", "Vasif");

        Predicate<String> startWith = s -> s.startsWith("a");

         filterAndSortMethod(names,startWith);

    }

    static void filterAndSortMethod(List<String> list, Predicate<String> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }
}

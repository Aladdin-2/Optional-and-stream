import java.util.List;
import java.util.function.Predicate;

public class CountingSpecificCharacters {
    public static void main(String[] args) {

        List<String> strings = List.of("ala", "bala");


    }

    static void countingSpecificCharacters(List<String> strings, Predicate<String> predicate) {
        strings.stream().filter(predicate);
    }
}

import java.util.List;
import java.util.Optional;

public class FindLongestInteger {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(12, 2, 23, 4, 444,3211);

        Optional<Integer> optionalInteger = integerList.stream().sorted().max(Integer::compareTo);
        optionalInteger.ifPresentOrElse(System.out::println,
                () -> System.out.println("There is no large integer value!"));
    }
}

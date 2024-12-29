import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class AverageOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5);

        Predicate<Integer> findEvenNumber = num -> num % 2 == 0;


        OptionalDouble average = averageOfEvenNumber(integers, findEvenNumber);

        average.ifPresentOrElse(System.out::println,
                () -> System.out.println("The are no even numbers!"));
    }

    static OptionalDouble averageOfEvenNumber(List<Integer> integers, Predicate<Integer> predicate) {
        return integers.stream().filter(predicate).mapToInt(Integer::intValue).average();


    }

}

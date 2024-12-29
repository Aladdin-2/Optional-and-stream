import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicateAndSortIntegers {
    public static void main(String[] args) {
        List<Integer> firstIntegerList = List.of(1, 1, 2, 2, 3, 4, 5);
        List<Integer> secondIntegerList = List.of(1, 3, 8, 2, 8, 4, 5);

        List<Integer> newIntegers = removeDuplicateAndSort(firstIntegerList, secondIntegerList);
        System.out.println(newIntegers);
    }

    static List<Integer> removeDuplicateAndSort(List<Integer> firstIntegerList,
                                                List<Integer> secondIntegerList) {

        return Stream.concat(firstIntegerList.stream(), secondIntegerList.stream())
                .distinct()
                .sorted()
                .toList();

    }
}

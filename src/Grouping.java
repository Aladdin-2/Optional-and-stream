import java.util.List;

public class Grouping {
    public static void main(String[] args) {

        List<String> stringList = List.of("al", "bb", "cc");
        groupingByFirstLetter(stringList);
    }

    static void groupingByFirstLetter(List<String> strings) {
        List<String> newString = strings.stream().map(str -> str.substring(0, 1)).toList();
        System.out.println(newString);
    }
}

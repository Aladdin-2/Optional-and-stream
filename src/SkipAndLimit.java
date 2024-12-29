import java.util.List;

public class SkipAndLimit {
    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(skipAndLimitIntegers(integers));
    }

    static List<Integer> skipAndLimitIntegers(List<Integer> integers) {
        return integers.stream().skip(3).limit(5).toList();
    }
}

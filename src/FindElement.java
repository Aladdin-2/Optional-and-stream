import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        List<String> strings = List.of("Java", "C#", "java", "PHP", "java");

        System.out.println(findAnyMatchingElement(strings));
    }

    static List<String> findAnyMatchingElement(List<String> strings) {
        return strings.stream().filter(str -> str.contains("java")).toList();
    }
}

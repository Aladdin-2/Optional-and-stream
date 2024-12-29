import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctWords {
    public static void main(String[] args) {

        List<String> sentence = List.of(
                "Java is a powerful language",
                "Streams are powerful in Java",
                "Set helps in removing duplicates",
                "Learn Java with streams");


        Set<String> uniqueWords = extractUniqueWords(sentence);
        System.out.println(uniqueWords);
    }

    static Set<String> extractUniqueWords(List<String> sentences) {

        return sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
    }
}

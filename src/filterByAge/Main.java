package filterByAge;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        List<Person> people = List.of(new Person("Aladdin", 23), new Person("Tahir", 20));

        Predicate<Person> predicate = person -> person.getAge() > 30;

        Optional<Person> optionalPerson = filterByAge(people, predicate);
        optionalPerson.ifPresentOrElse(System.out::println, () -> System.out.println("No one older than 30 years old!"));

    }

    static Optional<Person> filterByAge(List<Person> people, Predicate<Person> predicate) {
        return people.stream().filter(predicate).findFirst();

    }
}

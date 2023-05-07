package homework11.task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        List<String> names = asList ("Masha", "Dasha", "Sveta", "Vera", "Natasha", "Kristina", "Marina", "Anton", "Olexandr", "Volodymyr");
        List<String> numbers = asList("1", "2", "3", "4", "5", "6", "7");
        Stream<String> first = names.stream();
        Stream<String> second = numbers.stream();
        Stream<String> mixedStream = StreamMixer.zip(first, second);

        List<String> mixedList = mixedStream.collect(Collectors.toList());
        System.out.println(mixedList);
    }
}

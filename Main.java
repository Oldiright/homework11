package homework11;

import homework11.task1And2.NamesSorter;
import homework11.task4.LinearCongruentialGenerator;
import homework11.task5.StreamMixer;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.pow;
import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = asList ("Masha", "Dasha", "Sveta", "Vera", "Natasha", "Kristina", "Marina", "Anton", "Olexandr", "Volodymyr");

        /* task 1*/
        System.out.println(NamesSorter.getOddValues(nameList));

        /* task 2*/
        System.out.println(NamesSorter.getSortedList(nameList));



        /* task 3*/

        String[] numberInString = {"1, 2, 0", "4, 5", "12, 24, 776", "1, 4, 8, 8"};

        List<String> numberList = asList(numberInString);

        List<Integer> result = numberList.stream()
                .flatMap(l -> stream(l.split(", ")).map(Integer::parseInt))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        /*task 4*/

        LinearCongruentialGenerator random = new LinearCongruentialGenerator();
        Set<Long> resultList = random.generate(25214903917L, 11, (long) pow(2, 48), 788)
                .limit(5)
                .peek(System.out::println)
                .collect(Collectors.toSet());

        System.out.println(resultList.size());

        LinearCongruentialGenerator random2 = new LinearCongruentialGenerator(25214903917L, 11, (long) pow(2, 48), 788);
        Set<Long> resultList2 = random.generate()
                .limit(5)
                .peek(System.out::println)
                .collect(Collectors.toSet());

        System.out.println(resultList2.size());


        /*task 5*/
        List<String> names = asList ("Masha", "Dasha", "Sveta", "Vera", "Natasha", "Kristina", "Marina", "Anton", "Olexandr", "Volodymyr");
        List<String> numbers = asList("1", "2", "3", "4", "5", "6", "7");
        Stream<String> first = names.stream();
        Stream<String> second = numbers.stream();
        Stream<String> mixedStream = StreamMixer.zip(first, second);

        List<String> mixedList = mixedStream.collect(Collectors.toList());
        System.out.println(mixedList);
    }
}

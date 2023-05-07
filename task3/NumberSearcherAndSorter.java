package homework11.task3;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class NumberSearcherAndSorter {
    public static void main(String[] args) {
        String[] numberInString = {"1, 2, 0", "4, 5", "12, 24, 776", "1, 4, 8, 8"};

        List<String> numberList = asList(numberInString);

        List<Integer> result = numberList.stream()
                .flatMap(l -> stream(l.split(", ")).map(Integer::parseInt))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);





    }
}

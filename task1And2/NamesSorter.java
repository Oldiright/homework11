package homework11.task1And2;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NamesSorter {
    public static String getOddValues(List<String> list) {
        AtomicInteger i = new AtomicInteger(0);
        String finalList = list.stream()
                .map(h -> i.getAndIncrement() + ". " + h)
                .filter(h-> Character.getNumericValue(h.charAt(0))% 2 != 0)
                .collect(Collectors.joining(", "));
        return finalList;
    }

    public static List<String> getSortedList(List<String> list) {
        List<String> resultList = list.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        return resultList;
    }

}

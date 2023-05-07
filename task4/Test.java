package homework11.task4;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.pow;

public class Test {

    public static void main(String[] args) {
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
    }
}

package homework11.task4;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinearCongruentialGenerator {


    private long a, c, m, seed;


    public LinearCongruentialGenerator(long a, long m, long c, long seed) {
        this.a = a;
        this.m = m;
        this.c = c;
        this.seed = seed;
    }
    public LinearCongruentialGenerator() {

    }
    public Stream<Long> generate() {

        return Stream.iterate(seed, s -> (a * s + c) % m);
    }


    public Stream<Long> generate(long a, long m, long c, long seed) {
        this.a = a;
        this.m = m;
        this.c = c;
        this.seed = seed;
        return Stream.iterate(seed, s -> (a * s + c) % m);
    }
}

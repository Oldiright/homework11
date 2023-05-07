package homework11.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMixer {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream<T> fStream = first;
        Stream<T> sStream = second;
        List<T> result = new ArrayList<>();
        Iterator<T> fIterator = first.iterator();
        Iterator<T> sIterator = second.iterator();
        while(fIterator.hasNext() && sIterator.hasNext()) {
            result.add(fIterator.next());
            result.add(sIterator.next());
        }
        return  result.stream();
    }
}

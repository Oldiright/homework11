package homework11.task1And2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class Test {

    public static void main(String[] args) {

        List<String> nameList = asList ("Masha", "Dasha", "Sveta", "Vera", "Natasha", "Kristina", "Marina", "Anton", "Olexandr", "Volodymyr");

        /* task 1*/
        System.out.println(NamesSorter.getOddValues(nameList));

        /* task 2*/
        System.out.println(NamesSorter.getSortedList(nameList));



    }
}

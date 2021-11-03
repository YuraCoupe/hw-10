package ua.goit.javaCore4.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Lisa", "Helen", "Eva", "Marya", "Nastya");
        List<String> list2 = Arrays.asList("Ivan", "Yuriy", "Kyrylo", "Ihor", "Olexandr", "Yaroslav", "Egor");
        zip(list2.stream(), list1.stream())
                .forEach(System.out::println);

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        long size = firstList.size() < secondList.size() ? firstList.size() : secondList.size();
        List<T> mixedList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            mixedList.add(firstList.get(i));
            mixedList.add(secondList.get(i));
        }
        return mixedList.stream();
    }
}

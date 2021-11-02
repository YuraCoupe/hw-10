package ua.goit.javaCore4.homework10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Andriy", "Kyrylo", "Yuriy", "Ivan", "Eva", "Darya", "Marya");
        List<String> result = input.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

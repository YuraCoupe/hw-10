package ua.goit.javaCore4.homework10;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] input = new String[]{"1, 2, 0", "4, 5"};
        String result = Arrays.asList(input).stream()
                .flatMap(element -> Arrays.asList(element.split(", ")).stream())
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));
        System.out.println(result);


    }
}

package ua.goit.javaCore4.homework10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Andriy", "Kyrylo", "Yuriy", "Ivan", "Eva", "Darya", "Marya");
        String result = input.stream()
                .filter(element -> input.indexOf(element) % 2 == 0)
                .map(element -> (input.indexOf(element)+1) + ". " + element)
                .collect(Collectors.joining(", ", "Names are: ", "."));
        System.out.println(result);
    }
}

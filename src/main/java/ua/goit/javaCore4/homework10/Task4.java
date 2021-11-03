package ua.goit.javaCore4.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        long seed = 0l;
        long a = 25214903917l;
        long c = 11l;
        double m = Math.pow(2, 48);
        Stream<Long> testStream = getRandomNumbnersStrem(seed, a, c, m);
        testStream
                .limit(7)
                .forEach(System.out::println);
    }

    private static Stream<Long> getRandomNumbnersStrem(long seed, long a, long c, double m) {
        return Stream
                .iterate(seed, s -> (long) ((1 * (a * s + c) % m)));
    }
}

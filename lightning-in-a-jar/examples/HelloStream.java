package leyden;

import java.util.*;
import java.util.stream.*;

public class HelloStream {
    static List<String> words = List.of("hello", "fuzzy", "world");
    public static void main(String ... args) {
        var greeting = words.stream()
            .filter(w -> !w.contains("z"))
            .collect(Collectors.joining(", "));
        System.out.println(greeting);  // hello, world
    }

}

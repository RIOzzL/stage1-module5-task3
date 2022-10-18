package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        //  throw new UnsupportedOperationException("You should implement this method.");
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMax(List<Integer> list) {
        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);
        return max;
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        Optional<Integer> min = list.stream()
                .flatMap(c -> c.stream())
                .min(Integer::compareTo);
        return min;
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Integer sum(List<Integer> list) {
        Optional<Integer> reduce = list.stream()
                .reduce((x, y) -> x + y);

        return reduce.orElse(null);
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}

package com.sks.diff.oddeven;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestOddEven {
    public static void main(String... programingKT) {
        var set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44);
        Map<Boolean, Set<Integer>> partitioned = repartitionedEvenOdd(set);
        System.out.println((partitioned));
    }

    public static Map<Boolean, Set<Integer>> repartitionedEvenOdd(Set<Integer> set) {
            return set.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.toSet()));
    }
    }


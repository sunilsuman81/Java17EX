package com.sks;

import java.util.Comparator;
import java.util.Map;

public class MaxLength {
    public static void main(String... args) {
        var map = Map.of("Orangesssssss", "Grapes", "Bananaa", "carrot", "onion", "Apple");
        String maxLengthKey = findMaxLengthKey(map);
        System.out.println(maxLengthKey);
    }

    public static String findMaxLengthKey(Map<String, String> map) {
        return  map.keySet().stream().max(Comparator.comparing(String :: length)).orElse("none");
    }

}

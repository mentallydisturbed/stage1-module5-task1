package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {

        return (x) -> {
            for(String s : x) {
                if(!Character.isUpperCase(s.charAt(0))) return false;
            }
            return true;
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x -> {
            List<Integer> holder = new ArrayList<>();
            for (Integer i:
                 x) {
                if(i % 2 == 0) holder.add(i);
            }
            x.addAll(holder);
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            values.removeIf(s -> !Character.isUpperCase(s.charAt(0)) || s.charAt(s.length() - 1) != '.' || s.split(" ").length <= 3);
            return values;
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return x -> {
            Map<String, Integer> map = new HashMap<>();
            for(String s : x) {
                map.putIfAbsent(s, s.length());
            }
            return map;
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (x, y) -> {
            List<Integer> list = new ArrayList<>();
            list.addAll(x);
            list.addAll(y);
            return list;
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}

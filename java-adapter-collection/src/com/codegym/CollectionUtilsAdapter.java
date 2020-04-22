package com.codegym;

import java.util.*;

public class CollectionUtilsAdapter {
    List<Integer> list;

    public int findMax(Set<Integer> numbers) {
        changeToList(numbers);
        return Collections.max(list);
    }

    private List<Integer> changeToList(Set<Integer> numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for (Integer number : numbers) {
            list.add(number);
        }
        return list;
    }
}
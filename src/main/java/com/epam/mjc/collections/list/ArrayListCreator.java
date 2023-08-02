package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newList = new ArrayList<>();
        int i = 2;
        while (i < sourceList.size()) {
            newList.add(sourceList.get(i));
            newList.add(sourceList.get(i));
            i += 3;
        }
        return newList;
    }
}

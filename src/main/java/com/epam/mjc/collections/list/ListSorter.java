package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt= Integer.parseInt(a);
        int bInt= Integer.parseInt(b);
        int functionValueA = 5*aInt*aInt+3;
        int functionValueB = 5*bInt*bInt+3;
        if (functionValueA!=functionValueB){
            return Integer.compare(functionValueA,functionValueB);
        }
        return Integer.compare(aInt,bInt);
    }
}

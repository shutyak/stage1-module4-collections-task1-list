package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newList=new LinkedList<>();
        for (int x:sourceList
             ) {
            if (x%2==0){
                newList.addLast(x);
            }
            else {
                newList.addFirst(x);
            }
        }
        return newList;
    }
}

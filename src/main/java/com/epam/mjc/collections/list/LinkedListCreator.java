package com.epam.mjc.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Iterator<Integer> iterators = sourceList.iterator();

        Integer temp;
        for (int i = 0; iterators.hasNext(); i++) {
            temp = iterators.next();
            if (temp % 2 == 0) {
                linkedList.addLast(temp);
            } else {
                linkedList.addFirst(temp);
            }
        }

        return linkedList;
    }
}

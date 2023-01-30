package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        Iterator<String> iterators = sourceList.listIterator();
        ArrayList<String> arrayList = new ArrayList<>();

        String temp;
        for (int i = 1;iterators.hasNext(); i++) {
            temp = iterators.next();
            if (i % 3 == 0) {
                  arrayList.add(temp);
                  arrayList.add(temp);
            }
        }

        return arrayList;
    }
}

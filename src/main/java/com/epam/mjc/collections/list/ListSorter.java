package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < sourceList.size() - 1; j++) {
                if (listComparator.compare(sourceList.get(j), sourceList.get(j + 1)) > 0) {
                    isSorted = false;
                    String temp = sourceList.get(j + 1);
                    sourceList.set(j + 1, sourceList.get(j));
                    sourceList.set(j, temp);
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aa = 5 * (int)(Math.pow(Integer.parseInt(a),2)) + 3;
        int bb = 5 * (int)(Math.pow(Integer.parseInt(b),2)) + 3;
        if (aa > bb) return 1;
        else if (aa == bb) return 0;
        return -1;
    }
}

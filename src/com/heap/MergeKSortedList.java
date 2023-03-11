package com.heap;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedList {
//    private ListNode mergeSortedLists(ListNode list1, ListNode list2) {
//        if (list1 == null)
//            return list2;
//        if (list2 == null)
//            return list1;
//
//        if (list1.val < list2.val) {
//            list1.next = mergeSortedLists(list1.next, list2);
//            return list1;
//        } else {
//            list2.next = mergeSortedLists(list2.next, list1);
//            return list2;
//        }
//    }
//
//    public ListNode mergeKLists(ListNode[] lists, int start, int end) {
//
//        // base cases
//        if (start > end)
//            return null;
//        if (start == end)
//            return lists[start];
//
//        // divide and conquer
//        int middle = (end + start) / 2;
//        ListNode leftList = mergeKLists(lists, start, middle);
//        ListNode rightList = mergeKLists(lists, middle + 1, end);
//        return mergeSortedLists(leftList, rightList);
//    }
//
//    public ListNode mergeKLists(ListNode[] lists) {
//        return mergeKLists(lists, 0, lists.length - 1);
//    }

    //////////////////////////////////////////////////////////////////

    public List<Integer> mergeKLists(ArrayList<ArrayList<Integer>> lists) {
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < lists.size(); i++) {
            priorityQueue.add(new Pair(i, 0, lists.get(i).get(0)));
        }

        while (priorityQueue.size() > 0) {
            Pair p = priorityQueue.remove();
            result.add(p.elemVal);

            p.elemPos++; //increment rowno

            if (p.elemPos < lists.get(p.rowNo).size()) {
                p.elemVal = lists.get(p.rowNo).get(p.elemPos); //increment val
                priorityQueue.add(p);
            }
        }

        return result;
    }

    class Pair implements Comparable<Pair> {
        int rowNo;
        int elemPos;
        int elemVal;

        public Pair(int rowNo, int elemPos, int elemVal) {
            this.rowNo = rowNo;
            this.elemPos = elemPos;
            this.elemVal = elemVal;
        }

        public int compareTo(Pair p) {
            return this.elemVal - p.elemVal;
        }
    }
}

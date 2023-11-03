package src.old.collection_and_map.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        /**
         * ArrayList
         *
         *      - 枚举 较快
         *      - 增/删/改 较慢
         */

        ArrayList<String> arrayList = new ArrayList<String>();

        int count = 100000;

        long arrTime1 = System.currentTimeMillis();

        for(int i = 0; i < count; i++) {
            arrayList.add(0,"arrayList");
        }

        long arrTime2 = System.currentTimeMillis();

        System.out.println("arrayList: " + (arrTime2 - arrTime1) + " ms");


        /**
         * LinkedList
         *
         *      - 增/删/改 较快
         *      - 枚举 较慢
         */

        LinkedList<String> linkedList = new LinkedList<String>();

        long linkedTime1 = System.currentTimeMillis();

        for(int i = 0; i < count; i++) {
            linkedList.add(0,"linkedList");
        }

        long linkedTime2 = System.currentTimeMillis();

        System.out.println("arrayList: " + (linkedTime2 - linkedTime1) + " ms");

    }
}

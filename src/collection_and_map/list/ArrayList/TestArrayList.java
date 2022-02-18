package collection_and_map.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {


        ArrayList<Number> arrayList1 = new ArrayList<Number>();
        ArrayList<Number> arrayList2 = new ArrayList<Number>();


        for (int i = 0; i < 3;  i++) {
            arrayList1.add(i);
        }

        for (int i = 3; i < 6;  i++) {
            arrayList2.add(i);
        }


        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);


        Number firstChild = arrayList1.get(0);
        System.out.println("get firstChild: " + firstChild);


        arrayList1.remove(2);
        System.out.println("remove [index: 2]: " + arrayList1);
        boolean remove = arrayList1.remove(new Integer(1));
        System.out.println("remove [value: 2]: " + arrayList1);


        Number removeIndex = arrayList1.remove(0);
        System.out.println("remove first child in arrayList1");
        System.out.println("removeIndex: " + removeIndex);


        // TODO: toArray(), remove(Object)


//        List<Number> subArr = arrayList1.subList(0,2);
//        System.out.println("subArr: " + subArr);


        arrayList1.addAll(arrayList2);
        System.out.println("arrayList1 + arrayList2: " + arrayList1);


        arrayList1.trimToSize();
        System.out.println("trimToSize arrayList1: " + arrayList1.toArray().length);


        Number length = arrayList1.size();
        System.out.println("length: " + length);


        boolean isContain1 = arrayList1.contains(1);
        System.out.println("arrayList1 is contain 1: " + isContain1);


        arrayList1.clear();
        System.out.println("clear arrayList1: " + arrayList1);


        boolean arrayList1IsEmpty =  arrayList1.isEmpty();
        System.out.println("arrayList1 is empty: " + arrayList1IsEmpty);


        // 并集
        // arrayList1.addAll(arrayList2);
        // 差集
        // arrayList2.removeAll(arrayList2);
        // 交集
        // arrayList2.retainAll(arrayList2);

    }
}
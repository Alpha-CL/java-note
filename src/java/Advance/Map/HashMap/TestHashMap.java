package src.java.Advance.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class TestHashMap {

    public static void main(String[] args) {


        /**
         * HashMap
         *
         *
         * { key = value, key = value }
         *
         */


        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();


        hashMap.put(0, "a");
        hashMap.put(1, "b");
        hashMap.put(2, "c");
        hashMap.put(3, "d");
        hashMap.put(4, "e");
        hashMap.put(5, "f");

        hashMap.putIfAbsent(100, "ad");


        System.out.println(hashMap);


        hashMap.remove(1);
        System.out.println(hashMap);


        hashMap.replace(3, "ddd");
        System.out.println(hashMap);


        /** 枚举: 1. 获取所有 keyList 2. 循环根据 key 枚举 **/
        Set<Integer> keyList = hashMap.keySet();
        for (Integer integer : keyList) {
            System.out.println(integer.toString());
        }

        System.out.println(hashMap.getOrDefault(111, "666"));

        System.out.println(hashMap.containsKey(1));

        System.out.println(hashMap.containsValue("a"));

        Set<Entry<Integer, String>> entrys = hashMap.entrySet();
        Iterator<Entry<Integer, String>> it = entrys.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

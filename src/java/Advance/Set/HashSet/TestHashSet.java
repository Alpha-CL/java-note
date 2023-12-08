package src.java.Advance.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    public static void main(String[] args) {

        /**
         * HashSet
         *
         *      - 无序
         *      - 无
         *
         ** 无法更改指定位置的值
         */

        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        HashSet<String> hashSet3 = new HashSet<String>();


        hashSet.add("a");
        hashSet.add("b");
        hashSet2.add("d");
        hashSet2.add("c");


        hashSet3.addAll(hashSet2);
        hashSet3.addAll(hashSet);


        hashSet.addAll(hashSet2);
        System.out.println(hashSet);


        hashSet.remove("a");
        System.out.println(hashSet);


        hashSet.removeAll(hashSet2);
        hashSet.remove("b");
        hashSet.addAll(hashSet3);
        System.out.println(hashSet);


        /** 枚举:  **/

        // 1) 增强for
        // for (String value : hashSet) {
        //     System.out.println(value);
        // }

        // 2) 迭代器
        Iterator<String> it = hashSet.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /**
         * 无重复
         *
         *
         ** 默认: 使用 equals() 比较
         */

        int count = 10;

        HashSet<String> stringHashSet1 = new HashSet<String>();
        HashSet<Person> personHashSet1 = new HashSet<Person>();

        for (int i = 0; i < count; i++) {
            stringHashSet1.add(new String("string hash set"));
            personHashSet1.add(new Person("person hash set", i));
        }

        System.out.println("stringHashSet1.length: " + stringHashSet1.size());           // 1
        System.out.println("personHashSet1.length: " + personHashSet1.size());           // 10

        // 推理 String 对比的是 值, Person 对比的是地址
        // Person 中重写  equals(); & hashCode();
        // 重写后去除重复的子项

        HashSet<String> stringHashSet2 = new HashSet<String>();
        HashSet<Person> personHashSet2 = new HashSet<Person>();

        for (int i = 0; i < count; i++) {
            stringHashSet2.add(new String("string hash set"));
            personHashSet2.add(new Person("person hash set", i));
        }

        System.out.println("stringHashSet2.length: " + stringHashSet2.size());           // 2
        System.out.println("personHashSet2.length: " + personHashSet2.size());           // 10


        HashSet<String> p1 = new HashSet<String>();
        HashSet<String> p2 = new HashSet<String>();
        p1.add("a");
        p2.add("a");
        System.out.println("personHashSet2.length: " + p1.equals(p2));                  // 10

        HashSet<Person> personHashSet3 = new HashSet<Person>();
        for (int i = 0; i < count; i++) {
            personHashSet3.add(new Person("person", i));
        }
        System.out.println("personHashSet3: " + personHashSet3);           // 10
    }
}


















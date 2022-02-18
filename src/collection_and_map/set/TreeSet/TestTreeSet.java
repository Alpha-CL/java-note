package collection_and_map.set.TreeSet;

import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        /**
         * TreeSet
         *
         *      - 二叉树   [ { left, item, right } ]
         *      - 无重复: 内部有自己的排序规则
         *
         ** 无修改指定位置的元素的值
         */

        TreeSet<String> treeSet1 = new TreeSet<String>();

        treeSet1.add("a");
        treeSet1.add("B");
        treeSet1.add("c");
        treeSet1.add("D");
        treeSet1.add("a");   // 无法 添加重复项
        treeSet1.add("B");   // 无法 添加重复项

        System.out.println(treeSet1.size());
        System.out.println(treeSet1);


        /**
         * 若需要将自定义的类加入 TreeSet, 则必须实现 compareTo();
         *
         *
         *
         */

        TreeSet<Person> treeSet2 = new TreeSet<Person>();

        treeSet2.add(new Person("alpha", 18, 0));
        treeSet2.add(new Person("beta", 17, 1));
        treeSet2.add(new Person("omega", 16, 2));

        System.out.println(treeSet2.size());
        System.out.println(treeSet2);

    }
}

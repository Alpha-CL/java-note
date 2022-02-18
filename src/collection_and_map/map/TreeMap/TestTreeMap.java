package collection_and_map.map.TreeMap;

import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {


        /**
         * TreeMap
         *
         *      - 自然排序: 根据 unicode 编码排序
         *      -
         *
         * methods: put, get, remove, replace, size ...
         * data-structure: 红黑二叉树
         *
         ** 存储时, 下一个 Entry 利用 compareTo(); 比较大小
         *      - 大: 放置在左侧
         *      - 小: 放置在右侧
         *      - 一致: 覆盖
         *
         ** 层级大于 2 时, 出现 左旋 或 右旋（ 保持树结构的平衡 ）
         */

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");
        treeMap.put(4, "d");
        treeMap.put(5, "e");
        treeMap.put(6, "f");

        System.out.println(treeMap);


    }
}

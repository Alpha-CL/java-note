package array.arrray_box;

public class array_box<E> {

    private static final int DEFAULT_LEN = 0;

    public Object[] arr;

    public int effectiveItemLen = 0;

    public array_box() {
        arr = new Object[DEFAULT_LEN];
    }

    public array_box(int effectiveLen) {
        arr = new Object[effectiveLen];
    }

    /**
     * 当数组容量不够时, 扩容数组
     *
     * @
     */
    private void arrExpansion(int minLen) {
        if (minLen - arr.length > 0) {
            this.lenEnough(minLen);
        }
    }

    /**
     * 确保有足够的数组长度
     *
     * @minLen: 最小长度
     */
    private void lenEnough(int minLen) {

        int oldLen = arr.length;
        int newLen = oldLen + 1;

        if (newLen - minLen < 0) {
            newLen = minLen;
        }

        arr = this.clone(arr, newLen);
    }

    /**
     * 打印数据
     */
    public void printlnArr() {

        System.out.println("<!-- println array start -->");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
        System.out.println("<!-- println array end -->");
    }

    /**
     * 将旧数组中的元素拷贝到新数组中
     */
    private Object[] clone(Object[] oldArr, int newLen) {

        Object[] newArr = new Object[newLen];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        return newArr;
    }

    /**
     * 添加数组元素
     *
     * @element: 添加的元素
     */
    public boolean push(E item) {

        this.lenEnough(effectiveItemLen + 1);

        arr[effectiveItemLen++] = item;

        return true;
    }

    /**
     * 检测索引是否合法
     */
    private void indexIsSafe(int i) {

        if (i < 0 || i >= effectiveItemLen) {

            throw new BoxIndexOutOfBoundsException("[ get index: " + i + " ], [ max index: " + effectiveItemLen + " ]");
        }
    }

    /**
     * 获取数组中指定位置的元素
     */
    public E get(int i) {

        this.indexIsSafe(i);

        return (E) arr[i];
    }

    /**
     * 删除元素后, 更新数组状态
     *
     *
     *
     */
    public void updateArr(int i) {

        Object[] newArr = new Object[arr.length - 1];

        for (int j = 0; j <= newArr.length; j++) {

            if (j <= i + 1) {

                newArr[j] = arr[j];

            } else {

                newArr[j - 1] = arr[j];
            }
        }

        arr = newArr;
    }

    /**
     * 删除元素
     */
    public E remove(int i) {

        this.indexIsSafe(i);

        this.updateArr(i);

        return (E) arr[i];
    }
}

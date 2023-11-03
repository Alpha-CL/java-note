package src.old.array.array_box;

public class Test {

    public static void main(String[] args) {

        ArrayBox<Integer> box = new ArrayBox<Integer>();

        for(int i = 66; i < 72; i++) {
            box.push(i);
        }

        box.printlnArr();

        System.out.println("有效长度: " + box.effectiveItemLen);
        System.out.println("数组长度: " + box.arr.length);

        int getIndex = 2;
        int getChild = box.get(getIndex);
        System.out.println("get [" + getIndex + "] child: " + getChild);

        int removeIndex = 1;

        int removeChild = box.remove(removeIndex);

        System.out.println("remove [" + getIndex + "] child: " + removeChild);

        box.printlnArr();

//        LinkedBox1<Integer> lb = new LinkedBox1<Integer>();

    }
}


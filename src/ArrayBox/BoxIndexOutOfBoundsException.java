package ArrayBox;

public class BoxIndexOutOfBoundsException extends RuntimeException {

    /**
     * 定义是否异常, 继承内置异常对象
     */

    public BoxIndexOutOfBoundsException() {
    }

    public BoxIndexOutOfBoundsException(String msg) {
        super(msg);
    }
}
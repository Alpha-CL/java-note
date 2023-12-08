package src.java.Base.CatchExceptions;


/**
 * 自定义 错误 定义处理函数
 */
public class MyException extends Exception{

    public MyException(){}

    public MyException(String msg){
        super(msg);
    }
}

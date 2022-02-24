package file_flow.file_object_stream;

import java.io.Serial;
import java.io.Serializable;

/**
 * 必须实现 Serializable
 * 否则无法 将对象 拆分为字节流
 **/

public class Demo implements Serializable {


    /**
     * 反序列化时, 需要比对 java 版本
     * serialVersionUID 必须有, 否则无法比对
     *
     ** 有且仅当比对成功, 才可以反序列化
     **/

    @Serial
    private static final long serialVersionUID = -8688271154759942303L;

    String name;
    int age;

    Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "[ " + this.name + " " + this.age + " ]";
    }

}
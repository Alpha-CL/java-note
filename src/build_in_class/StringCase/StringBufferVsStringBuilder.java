package build_in_class.StringCase;

public class StringBufferVsStringBuilder {

    /**
     * diff
     *
     *      - StringBuffer              // jdk 1.0: 单线程( 安全, 可靠, 效率相对较慢 )
     *
     *      - StringBuilder             // jdk 1.5: 多线程( 效率相对较快, 可能会有阻塞的问题 )
     *
     */

    StringBuffer buffer = new StringBuffer();       // synchronized( 修饰符 ): 锁定当前线程, 单线程
    StringBuilder builder = new StringBuilder();
}

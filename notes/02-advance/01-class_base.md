# Class

#### class

``` java
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


java文件 必须以 .java 作为扩展名

public class [name] {} 必须和 文件命名相同

单个java 文件, 有且仅有一个 public class {}       // 可以有多个 class, 但不建议单个文件中存放多个 class
                                              // 编译后文件名会有问题


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

#### method constructor

``` java
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


[xxx]: 可选的


权限修饰符 [特征修饰符] 返回值类型 方法名 (参数列表) [抛出异常] [{}]


    - 无参数 无返回值              // public void methos() {}
    
    - 无参数 有返回值              // public boolean method() {}
    
    - 有参数 有返回值              // public boolean method(int param) {}
    
    - 有参数 无返回值              // public void method(int param) {}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

#### main function

``` java
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/**
 * 入口函数
 *
 * 主方法属于 虚拟机
 */

public class Demo {

    public static void main(String[] args) {
        
        ... ...
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

#### named rule

``` java
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// 引入文件


package 在类的第一行使用， 用于引入包

import 用于引入其他人的包

当 package 和 import 同时出现时,

    先书写 package( 一个类中只能有一个 package )
    
    再书写 import( 可以有多个 )


//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -//


// 文件命名

英文, 数字, 符号, 中文( 不建议 )

    - 英文区分大小写
    
    - 不能以数字开头
    
    - 符号仅有 $, _
    
    - 中文不建议使用


//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -//


// 规约

package pkg;                            // 包: 全部小写( 避免和关键字冲突 )

public calss ClassName {                // 类: 大驼峰命名

    public static int CONSTANT;         // 常量: 全部大写

    int member;                         // 成员-属性: 小驼峰命名
    
    public void member () {             // 成员-方法: 小驼峰命名
    }

    public ClassName () {               // 构造方法: 与类名相同
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

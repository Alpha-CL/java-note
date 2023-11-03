# class relations

> 单继承( 类 与 类 )，多实现( 类 与 接口 ) \
> 模拟多继承: 一个类实现多个接口

#### Inheritance

> 一个类可以继承另一个类的 成员( 属性和方法 ) \
> 继承关系使用关键字 extends 来实现，允许子类( 派生类 )继承父类( 基类 )的特性

```java


// 单继承

class GrandFather {
    public String firstName = "alpha";
}

class Mother extends GrandFather {
    public int assets = 20000;
}

class Son extends Mother {
    public String lastName = "jack";
}


```

```java


// 多继承

interface GrandFather {
    
}

interface Father {
}

class Son implements Father, GrandFather {
}


```

#### Implementation

> 一个类可以实现一个或多个接口 \
> 接口定义了一组方法的契约，实现关系使用关键字 implements 来实现接口中定义的方法

```java


/**
 * 实现抽象类
 * 
 */

abstract class Father {
}

class Son implements Father {
}


```

```java


/**
 * 实现接口
 * 
 * 
 */

interface Father {
}

interface Mather {
}

class Son {
}



```

关联关系（Association）：表示类与类之间的关联关系，其中一个类包含对另一个类的引用。关联关系可以是单向的或双向的，表示两个类之间的关联。关联关系可以是一对一、一对多或多对多的关系。

依赖关系（Dependency）：表示一个类依赖于另一个类的实例或方法。依赖关系通常在方法参数或局部变量中使用其他类的实例。

聚合关系（Aggregation）：表示整体与部分之间的关系，整体对象包含部分对象，但部分对象可以存在独立于整体对象的生命周期。

组合关系（Composition）：也表示整体与部分之间的关系，但部分对象的生命周期依赖于整体对象的生命周期，部分对象不能独立存在。

接口继承关系（Interface Inheritance）：一个接口可以继承一个或多个其他接口，从而扩展接口的功能
## class-type

#### type

``` javascript
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public class Father () {
    
    public void eat() {
        System.out.printIn("不挑食");
    }
}

public class Son extends Father () {

    public void eat() {
       System.out.printIn("不爱吃菜");
    } 
    public void playGame() {}
}


public Test () {


    1) 允许父类类型的引用 指向 子类的对象
    
    Father s = new Son();          ===     Son s = new Son();
    Brother b = new Brother();     ===     Brother b = new Brother();
    [type]
    
    
    
    2) 若定义为 父类的类型 实例化 子类, 则该实例 仅能调用父类的方法
    ( 若该父类中的方法被 子类重写, 则调用 子类重写后 的方法 )        // 仅适用于 方法( override )
    ( 若父类与子类有同名的属性, 则执行父类的属性 )
    
    s.eat();        // 执行的是重写后的方法
    // 不爱吃菜
    
    s.playGame();   // 无法执行, 仅可使用 标记类型中的方法
    
    
    
    3) 若定义为 父类的类型后, 需要调用子类中的方法, 则需要转型       // 转型必须是继承关系( 兄弟关系编译期间可以转, 但执行会报错 ) 
    
    - 向上转型: 自动
    
    - 向下转型: 强制
    
      [targetType] foo = (curTypp) bar;          // 将 curTypp 强制转换为 targetType
                                                 ( 必须在继承关系中 )
}


//-------------------------------------------------------------------------------------------------------------------//


    // type: 决定可以调用哪个 类的方法( 可能被重写 )

    [type] ins = new TargetClass                 // type: TargetClass, Father, GrandFather ....
                --> extends Father 
                --> extends GrandFather 
                --> ... ;


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

#### (target instanceof Class): boolean;

``` javascript
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/**
 * (target instanceof Class): boolean; 
 * 
 * 
 * 判断指定对象是否属于某个类的继承关系
 */


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```






















# tomcat

#### 

``` javascript
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/**
 * Tomcat           // Apatche 组织开源的免费 web容器
 * 
 * 
 * 用于管理: Servlet, JSP, Html + Css + JavaScript ...
 */


Tomcat3     JDK1.1      Servlet2.x      JSP1.x
Tomcat5     JDK1.4      Servlet2.x      JSP2.

Tomcat6     JDK5.x      Servlet3.x      JSP2.x      EL2.x
Tomcat7     JDK6.x      Servlet3.x      JSP2.x      EL2.x

Tomcat8+    JDK8.x      Servlet4.x      JSP2.x      EL3.x

... 


//-------------------------------------------------------------------------------------------------------------------//


tomcat
|
|
|- bin                  // 服务器启动相关
|- conf                 // 配置文件
|   |- web.xml          // 请求相关的信息
|   |- server.xml       // 容器自身的配置( eg: 端口 ...)
|
|
|- lib                  // jar 形式的包
|- logs                 // 日志记录
|- temp                 // 临时文件存储
|
|- webapps              // 前端文件                                         √
|- work                 // 存放解析 JSP后形成的 java 文件                     √
|
|- ...
|
|


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

#### usage

``` javascript
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// Tomcat usage


    1) 定义一个 Controller 类
    
    2) 继承 Tomcat 中的 HttpServlet( 为了管理方便继承统一个接口 )
    
    3) 并重写该类中的 service 方法, 有参数没有返回值, 该方法中有两个参数
    
        - HttpServletRequuest
        
        - HttpServletResponse
    
    4) 抛出异常 ServletException IOException
    
    5) 配置 web.xml 文件( 配置路由 与 Controller 的对应关系 )


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

#### 

``` javascript
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


1) 读取请求协议: 

2) 解析: 
    
    - 解析参数与  路由地址
    
    - 包装成为 Request 对象

3) 根据配置文件找到对应的 controller 对象

    - web.xml

4) 反射: 利用找到对应的类

    - 利用反射调用 service 方法

5) 将相应信息 写入 response 并 返回给浏览器 


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```

#### web.xml config rules

``` javascript
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    <servlet>
        <servlet-name>[ControllerName]</servlet-name>
        <servlet-class>[controllerPath]</servlet-class>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>[ControllerName]</servlet-name>
        <url-pattern>[/router_01]</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>[ControllerName]</servlet-name>
        <url-pattern>[/router_02]</url-pattern>
    </servlet-mapping>


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
```
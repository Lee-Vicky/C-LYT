# Spring简介

------

## 1.简介

### 1.1.简介

Spring : 春天 —>给软件行业带来了春天

2002年，Rod Jahnson首次推出了Spring框架雏形interface21框架。

2004年3月24日，Spring框架以interface21框架为基础，经过重新设计，发布了1.0正式版。

很难想象Rod Johnson的学历 , 他是悉尼大学的博士，然而他的专业不是计算机，而是音乐学。

Spring理念 : 使现有技术更加实用 . 本身就是一个大杂烩 , 整合现有的框架技术

官网 : http://spring.io/

官方下载地址 : https://repo.spring.io/libs-release-local/org/springframework/spring/

GitHub : https://github.com/spring-projects

```
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.0.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.0.RELEASE</version>
</dependency>


```

### 1.2.优点

1、Spring是一个开源免费的框架 , 容器 .

2、Spring是一个轻量级的框架 , 非侵入式的 .

**3、控制反转 IoC , 面向切面 Aop**

4、对事物的支持 , 对框架的支持

一句话概括：

**Spring是一个轻量级的控制反转(IoC)和面向切面(AOP)的容器（框架）。**

- 

# Spring组成及拓展

------

### 2.1组成

 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20200613181721812.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDIwNzQwMw==,size_16,color_FFFFFF,t_70) 

 Spring 框架是一个分层架构，由 7 个定义良好的模块组成。Spring 模块构建在核心容器之上，核心容器定义了创建、配置和管理 bean 的方式 . 

 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20200613181733388.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDIwNzQwMw==,size_16,color_FFFFFF,t_70) 

组成 Spring 框架的每个模块（或组件）都可以单独存在，或者与其他一个或多个模块联合实现。每个模块的功能如下：

- **核心容器**：核心容器提供 Spring 框架的基本功能。核心容器的主要组件是 BeanFactory，它是工厂模式的实现。BeanFactory 使用*控制反转*（IOC） 模式将应用程序的配置和依赖性规范与实际的应用程序代码分开。

- **Spring 上下文**：Spring 上下文是一个配置文件，向 Spring 框架提供上下文信息。Spring 上下文包括企业服务，例如 JNDI、EJB、电子邮件、国际化、校验和调度功能。

- **Spring AOP**：通过配置管理特性，Spring AOP 模块直接将面向切面的编程功能 , 集成到了 Spring 框架中。所以，可以很容易地使 Spring 框架管理任何支持 AOP的对象。Spring AOP 模块为基于 Spring 的应用程序中的对象提供了事务管理服务。通过使用 Spring AOP，不用依赖组件，就可以将声明性事务管理集成到应用程序中。

- **Spring DAO**：JDBC DAO 抽象层提供了有意义的异常层次结构，可用该结构来管理异常处理和不同数据库供应商抛出的错误消息。异常层次结构简化了错误处理，并且极大地降低了需要编写的异常代码数量（例如打开和关闭连接）。Spring DAO 的面向 JDBC 的异常遵从通用的 DAO 异常层次结构。

- **Spring ORM**：Spring 框架插入了若干个 ORM 框架，从而提供了 ORM 的对象关系工具，其中包括 JDO、Hibernate 和 iBatis SQL Map。所有这些都遵从 Spring 的通用事务和 DAO 异常层次结构。

- **Spring Web 模块**：Web 上下文模块建立在应用程序上下文模块之上，为基于 Web 的应用程序提供了上下文。所以，Spring 框架支持与 Jakarta Struts 的集成。Web 模块还简化了处理多部分请求以及将请求参数绑定到域对象的工作。

- **Spring MVC 框架**：MVC 框架是一个全功能的构建 Web 应用程序的 MVC 实现。通过策略接口，MVC 框架变成为高度可配置的，MVC 容纳了大量视图技术，其中包括 JSP、Velocity、Tiles、iText 和 POI。

  ### 2.2.扩展

**Spring Boot与Spring Cloud**

- Spring Boot 是 Spring 的一套快速配置脚手架，可以基于Spring Boot 快速开发单个微服务;
- Spring Cloud是基于Spring Boot实现的；
- Spring Boot专注于快速、方便集成的单个微服务个体，Spring Cloud关注全局的服务治理框架；
- Spring Boot使用了约束优于配置的理念，很多集成方案已经帮你选择好了，能不配置就不配置 , Spring Cloud很大的一部分是基于Spring Boot来实现，Spring Boot可以离开Spring Cloud独立使用开发项目，但是Spring Cloud离不开Spring Boot，属于依赖的关系。
- SpringBoot在SpringClound中起到了承上启下的作用，如果你要学习SpringCloud必须要学习SpringBoot。

 ![在这里插入图片描述](https://img-blog.csdnimg.cn/2020061318174078.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDIwNzQwMw==,size_16,color_FFFFFF,t_70) 

------



# IOC理论推导

------

IoC基础

新建一个空白的maven项目

### 分析实现

我们先用我们原来的方式写一段代码 .

1、先写一个UserDao接口

```
public interface UserDao {
   public void getUser();
}

```

 2、再去写Dao的实现类 

```
public class UserDaoImpl implements UserDao {
   @Override
   public void getUser() {
       System.out.println("获取用户数据");
  }
}

```

 3、然后去写UserService的接口 

```
public interface UserService {
   public void getUser();
}

```

 4、最后写Service的实现类 

```
public class UserServiceImpl implements UserService {
   private UserDao userDao = new UserDaoImpl();

   @Override
   public void getUser() {
       userDao.getUser();
  }
}

```





------



# IOC本质

------



**控制反转IOC(Inversion of Control)，是一种设计思想，DI(依赖注入)是实现IOC的一种方法**，也有人认为DI只是IoC的另一种说法。没有IoC的程序中 , 我们使用面向对象编程 , 对象的创建与对象间的依赖关系完全硬编码在程序中，对象的创建由程序自己控制，控制反转后将对象的创建转移给第三方，个人认为所谓控制反转就是：获得依赖对象的方式反转了。

采用XML方式配置Bean的时候，Bean的定义信息是和实现分离的，而采用注解的方式可以把两者合为一体，Bean的定义信息直接以注解的形式定义在实现类中，从而达到了零配置的目的。

**控制反转是一种通过描述（XML或注解）并通过第三方去生产或获取特定对象的方式。在Spring中实现控制反转的是IoC容器，其实现方法是依赖注入（Dependency Injection,DI）。**

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628180055895.png#pic_center)



------



# HelloSpring

------



1. poji

```java
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
```

1. resource

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="hello" class="com.pojo.Hello">
        <property name="str" value="Spring"/>
    </bean>
</beans>
12345678910
```

1. 测试类

```java
@Test
public void test(){
    //获取Spring的上下文对象
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    //我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来就可以
    Hello hello = (Hello)context.getBean("hello");
    System.out.println(hello.toString());
}
12345678
 <!--使用Spring来创建对象，在Spring这些都成为Bean

    类型 变量名 = new 类型();
    bean = 对象 new Hello();

    id = 变量名
    class = new 的对象
    property 相当于给对象中的属性设置一个值
    value：具体的值，基本数据类型
    ref:应用Spring容器中创建好的对象
 -->

```

hello对象的属性是由Spring容器设置的，这个过程叫做**控制反转**

控制：谁来控制对象的创建，传统的应用程序的对象由程序本身控制创建的，使用Spring后，对象是由Spring来创建的。

反转：程序本身不创建对象，而变成被动的接受对象

依赖注入：就是利用set方法来进行注入

IOC是一种编程思想，由主动的编程思想变成被动的接收。

可以通过new ClassPathXmlApplicationContext去浏览底层源码

**到现在，我们彻底不用在程序中改动了，要实现不同的操作，只需要在xml配置文件中进行修改，所谓的IOC就是：对象由Spring来创建，管理，装配。**



------



# IOC创建对象方式

------

### 4.1、使用无参构造创建对象，默认

### 4.2、假设我们要使用有参构造创建对象

1. 下标赋值
2. 类型创建
3. 直接通过参数名创建(重点)

```xml
<!--下标赋值-->
<bean id="user" class="com.pojo.User">
    <constructor-arg index="0" value="张三"/>
</bean>
1234
<!--通过类型创建对象，不建议使用-->
<bean id="user" class="com.pojo.User">
    <constructor-arg type="java.lang.String" value="李四"/>
</bean>
1234
<!--直接通过参数名来设置-->
<bean id="user" class="com.pojo.User">
    <constructor-arg name="name" value="王五"/>
</bean>


```

总结：在配置文件加载的时候，容器中管理的对象就已经被初始化了





------



# Spring配置说明

### 5.1、别名

```xm
<alias name="user" alias="userNew"/>

```

### 5.2、Bean的配置

```xml
<!--
    id:bean的唯一标识符，也就是相当于我们的对象名
    class：bean对象所对应的权限定名，包名+类名
    name：也是别名，而且name可以同时取多个别名
-->
<bean id="userT" class="com.pojo.UserT" name="userT2,userT3 userT4;userT5">
    <property name="name" value="历史"/>
</bean>

```

### 5.3、import

import,一般用于团队开发使用，他可以将多个配置文件，导入合并为一个

假设，现在项目有多个人开发，这三个人复制不同的类开发，不同的类需要注册在不同的bean中，我们可以利用import将所有的人的beans.xml合并为一个总的，在使用的时候我们只需要使用总的配置即可。

- applicationContext.xml

```xml
<import resource="beans.xml"/>
<import resource="beans1.xml"/>
```

# DI依赖注入环境

环境搭建

1. 复杂类型

   ```java
   public class Address {
       private String address;
   
       public String getAddress() {
           return address;
       }
   
       public void setAddress(String address) {
           this.address = address;
       }
   }
   
   ```

2. 真实测试对象

   ```java
   public class Student {
       private String name;
       private Address address;
       private String[] books;
       private List<String> hobby;
       private Map<String,String> card;
       private Set<String> games;
       private String wife;
       private Properties info;
   }
   
   
   ```

3. beans.xml

   ```xml
    <bean id="address" class="com.pojo.Address">
           <property name="address" value="湖北武汉"/>
       </bean>
   
       <bean id="student" class="com.pojo.Student">
           <!--普通注入：value-->
           <property name="name" value="陈敬涛"/>
           <!--bean注入:ref-->
           <property name="address" ref="address"/>
           <!--数组注入:array-->
           <property name="books">
               <array>
                   <value>三国演义</value>
                   <value>西游记</value>
                   <value>红楼梦</value>
                   <value>水浒卷</value>
               </array>
           </property>
           <!--list注入:list-->
           <property name="hobby">
               <list>
                   <value>玩游戏</value>
                   <value>唱歌</value>
                   <value>学习</value>
               </list>
           </property>
           <!--map注入:map-->
           <property name="card">
               <map>
                   <entry key="身份证号码" value="420222199904056137"/>
                   <entry key="银行卡号" value="2616256651655665"/>
               </map>
           </property>
           <!--set注入:set-->
           <property name="games">
               <set>
                   <value>lol</value>
                   <value>dnf</value>
                   <value>cf</value>
               </set>
           </property>
           <!--null注入-->
           <property name="wife">
               <null/>
           </property>
           <!--props注入-->
           <property name="info">
               <props>
                   <prop key="学号">171101010031</prop>
                   <prop key="学部">信息学部</prop>
                   <prop key="专业">电子信息工程</prop>
               </props>
           </property>
       </bean>
   
   
   ```

4. 测试类

   ```java
    @Test
       public void test(){
           ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
           Student student = (Student) context.getBean("student");
           System.out.println(student.toString());
   //        Student{name='陈敬涛',
   //        address=Address{address='湖北武汉'},
   //        books=[三国演义, 西游记, 红楼梦, 水浒卷],
   //        hobby=[玩游戏, 唱歌, 学习], card={身份证号码=420222199904056137, 银行卡号=2616256651655665},
   //        games=[lol, dnf, cf],
   //        wife='null',
   //        info={学号=171101010031, 专业=电子信息工程, 学部=信息学部}}
       }
   ```

# 依赖注入之Set注入

- 依赖注入：Set注入
  - 依赖：bean对象的创建依赖于容器
  - 注入：bean对象中的所有属性，由容器来注入

# c命名和P命名空间注入

- 依赖注入：Set注入
  - 依赖：bean对象的创建依赖于容器
  - 注入：bean对象中的所有属性，由容器来注入

# Bean的作用域

注意点：p命名空间和c命名空间不能直接使用，需要导入xml约束

```xml
xmlns:p="http://www.springframework.org/schema/p"
xmlns:c="http://www.springframework.org/schema/c"
```

# 自动配置Bean

- 自动装配是Spring满足bean依赖的一种方式
- Spring会在上下文自动寻找，并自动给bean装配属性

在Spring中有3种装配的方式

1. 在xml中显示的配置
2. 在java中显示的配置
3. 隐式的自动装配bean【重要】

### 7.1、测试

环境搭建：一个人有两个宠物

### 7.2、byName自动装配

```xml
<!--byName:会自动在容器上下文中查找，和自己对象set方法后面的值对应的beanid-->
<bean id="people" class="com.pojo.People" autowire="byName"/>


```

### 7.3、byType自动装配

```xml
<!--byType:会自动在容器上下文中查找，和自己对象属性类型一致的bean-->
<bean id="people" class="com.pojo.People" autowire="byType"/>

```

小结：

- byName的时候，需要保证所有的bean的id唯一，并且这个bean需要和自动注入的属性的set方法的值一致

- byType的时候，需要保证所有的bean的class唯一，并且这个bean需要和自动注入的属性的类型一致

- 使用注解须知：

  1. 导入约束 context约束
  2. 配置注解的支持 context:annotation-config/

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xmlns:context="http://www.springframework.org/schema/context"
      xsi:schemaLocation="http://www.springframework.org/schema/beans
          https://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/context
          https://www.springframework.org/schema/context/spring-context.xsd">
  
      <context:annotation-config/>
  
  </beans>
  
  
  ```

  **@Autowired**

  直接在属性上使用即可，也可以在set方式上使用

  使用Autowired我们可以不用编写Set方法，前提是你这个自动装配的属性在IOC（Spring）容器中存在，且符合名字byType。

  科普：

  ```xml
  @Nullabel 字段标记了这个注解，说明这个字段可以为null
  
  
  public @interface Autowired {
      boolean required() default true;
  }
  
  ```

  测试

  ```java
  public class People {
      //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
      @Autowired(required = false)
      private Cat cat;
      @Autowired
      private Dog dog;
      private String name;
  }
  
  ```

  如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成的时候，我们可以使用@Qualifier(value = “”)去配合@Autowired的使用，指定一个唯一的bean对象注入

  ```java
  public class People {
      //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
      @Autowired(required = false)
      @Qualifier(value = "cat1")
      private Cat cat;
  }
  
  ```

  @Resource注解

  ```java
  public class People {
      @Resource 
      private Cat cat;
      @Resource(name = "")
      private Dog dog;
      private String name;
  }
  ```

# 注解实现自动配置

使用注解须知：

1. 导入约束 context约束
2. 配置注解的支持 context:annotation-config/

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>


```

**@Autowired**

直接在属性上使用即可，也可以在set方式上使用

使用Autowired我们可以不用编写Set方法，前提是你这个自动装配的属性在IOC（Spring）容器中存在，且符合名字byType。

科普：

```xml
@Nullabel 字段标记了这个注解，说明这个字段可以为null

12
public @interface Autowired {
    boolean required() default true;
}


```

测试

```java
public class People {
    //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;
}

```

如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成的时候，我们可以使用@Qualifier(value = “”)去配合@Autowired的使用，指定一个唯一的bean对象注入

```java
public class People {
    //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
    @Autowired(required = false)
    @Qualifier(value = "cat1")
    private Cat cat;
}

```

@Resource注解

```java
public class People {
    @Resource 
    private Cat cat;
    @Resource(name = "")
    private Dog dog;
    private String name;
}
```

# SPring注解开发

在Spring4之后，要使用注解开发，必须保证aop的包导入

使用注解需要导入context约束，增加注解支持

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

</beans>

```

1. bean

2. 属性如何注入

   ```java
   //等价于<bean id="user" class="com.pojo.User"/>
   //@Component 组件
   @Component
   @Scope("prototype")
   public class User {
       //相当于<property name="name" value="cjt"/>
       @Value("cjt")
       public String name ;
   }
   
   
   ```

3. 衍生的注解

   @Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层

   - dao【@Repository】
   - service【@Service】
   - controller【@Controller】

   这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean

4. 自动装配置

   ```xml
   @Autowired：自动装配通过类型，名字
       如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier（value=“”）
   @Nullable   字段标记了这个注解，说明这个字段可以为null
   @Resource   自动装配通过名字，类型
   
   ```

5. 作用域

   ```java
   @Component
   @Scope("prototype")
   public class User {
       //相当于<property name="name" value="cjt"/>
       @Value("cjt")
       public String name ;
   }
   
   ```

6. 小结

   xml与注解：

   - xml更加万能，适用于任何场合，维护简单方便
   - 注解不是自己类使用不了，维护相对复杂

   xml和注解最佳实践：

   - xml用来管理bean

   - 注解只负责完成属性的注入

   - 我们在使用的过程中，需要注意一个问题，必须让注解生效，就需要开启注解的支持

     ```xml
     <!--指定要扫描的包，这个包下的注解就会生效-->
     <context:component-scan base-package="com"/>
     <context:annotation-config/>
     ```

# 使用JavaConfig实现配置

我们现在完全不使用Spring的xml配置了，全权交给java来做

JavaConfig是Spring的一个子项目，在Spring之后，他成为了一个新功能

实体类：

```java
//这个注解的意思，就是说明这个类被Spring接管了，注册到了容器中
@Configuration
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }
    @Value("陈敬涛")//属性注入值
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    @Value("18")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

配置文件：

```java
@Configuration
//这个也会被Spring容器托管，注册到容器中，因为他本身就是一个@Component
//@Configuration 代表这是一个配置类，就和我们之前看的beans.xml类似

@ComponentScan("com.pojo")
//类似于包扫描

@Import(KuangConfig1.class)
//类似于导入xml
public class KuangConfig {
    @Bean
    //注册一个bean，就相当于我们之前写的一个bean标签，
    //这个方法的名字就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }
}

```

测试：

```java
 @Test
    public void test(){
        //如果完全使用了配置类方式去做，我们只能通过AnnotationConfig 上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.toString());
    }

```

这种纯Java的配置方式，在SpringBoot中随处可见



# 静态代理模式

角色分析：

- 抽象角色：一般会使用接口或者抽象类来解决
- 真实角色：被代理的角色
- 代理角色：代理真实角色，代理真实角色之后，我们一般会做一些附属操作
- 客户：访问代理对象的人

步骤：

1. 接口

   ```java
   //租房接口
   public interface Rent {
       public void rent();
   }
   
   
   ```

2. 真实角色

   ```java
   //房东
   public class Host implements Rent {
       public void rent() {
           System.out.println("房东要出租房子");
       }
   }
   
   
   ```

3. 代理角色

   ```java
   public class Proxy implements Rent {
       private Host host;
   
       public Proxy() {
       }
   
       public Proxy(Host host) {
           this.host = host;
       }
   
       public void rent() {
           seeHouse();
           host.rent();
           heTong();
           fare();
       }
   
       //看房
       public void seeHouse(){
           System.out.println("中介带你看房");
       }
   
       //签合同
       public void heTong(){
           System.out.println("签合同");
       }
   
       //收中介费
       public void fare(){
           System.out.println("收中介费");
       }
   }
   
   
   ```

4. 客户端访问代理角色

   ```java
   public class Client {
       public static void main(String[] args) {
           //房东要出租房子
           Host host = new Host();
           //代理，中介帮房东租房子，但是，代理角色一般会有一些附属操作
           Proxy proxy = new Proxy(host);
           //你不用面对房东，直接找中介租房即可
           proxy.rent();
       }
   }
   
   ```

代理模式的好处：

- 可以使真实角色的操作更加纯粹，不用去关注一些公共的业务
- 公共业务就交给了代理角色，实现了业务的分工
- 公共业务发生扩展的时候，方便集中管理

缺点：

- 一个真实角色就会产生一个代理角色，代码量会翻倍，开发效率会变低



# 动态代理详解

- 动态代理和静态代理角色一样
- 动态代理的代理类是动态生成的，不是我们直接写好的
- 动态代理分为两大类：基于接口的动态代理，基于类的动态代理
  - 基于接口—jdk动态代理
  - 基于类：cglib
  - Java字节码实现：Javasist

需要了解两个类：Proxy：代理，InvocationHandler：调用处理程序

```java
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


//我们使用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }


    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }


}


```

测试

```java
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);//设置要代理的对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}


```

动态代理的好处：

- 可以使真实的操作更加纯粹，不用去关注一些公共业务
- 公共业务就交给代理角色，实现了业务的分工
- 公共业务发生拓展的时候，方便集中管理
- 一个动态代理类代理的是一个接口，一般就是对应的一类业务
- 一个动态代理类可以代理多个类，只要实现了同一个接口即可

# AOP实现方式一

使用Spring的API接口

业务接口和实现类

```java
public interface UserService {
    public void add();
    public void delete();
    public void update();
    public void query();
}


public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}

```

编写两个增强类，一个前置增强，一个后置增强

```java
public class Log implements MethodBeforeAdvice {

    //method:要执行的目标对象方法
    //objects：参数
    //o：目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}

public class AfterLog implements AfterReturningAdvice {

    //o：返回值
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行力"+method.getName()+"返回结果为"+o);
    }
}


```

最后去spring的文件中注册 , 并实现aop切入实现 , 注意导入约束

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd">
    <!--注册bean-->
    <bean id="userService" class="com.tao.service.UserServiceImpl"/>
    <bean id="log" class="com.tao.log.Log"/>
    <bean id="afterLog" class="com.tao.log.AfterLog"/>
    <!--方式一：使用原生Spring API接口-->
    <!--配置aop:需要导入aop的约束-->
    <aop:config>
    <!--切入点：expression:表达式:execution(要执行的位置)-->
        <aop:pointcut id="pointcut" expression="execution(* com.tao.service.UserServiceImpl.*(..))"/>
    <!--执行环绕增加-->
        <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
    </aop:config>
</beans>

```

注意点：需要导入aop约束

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd">
</beans>


```

测试

```java
@Test
public void test(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //动态代理代理的是接口
    UserService userService = (UserService) context.getBean("userService");
    userService.add();
}
```

# AOP实现方式二

使用Spring的API接口

业务接口和实现类

```java
public interface UserService {
    public void add();
    public void delete();
    public void update();
    public void query();
}

1234567
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}

```

编写两个增强类，一个前置增强，一个后置增强

```java
public class Log implements MethodBeforeAdvice {

    //method:要执行的目标对象方法
    //objects：参数
    //o：目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}

12345678910
public class AfterLog implements AfterReturningAdvice {

    //o：返回值
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行力"+method.getName()+"返回结果为"+o);
    }
}


```

最后去spring的文件中注册 , 并实现aop切入实现 , 注意导入约束

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd">
    <!--注册bean-->
    <bean id="userService" class="com.tao.service.UserServiceImpl"/>
    <bean id="log" class="com.tao.log.Log"/>
    <bean id="afterLog" class="com.tao.log.AfterLog"/>
    <!--方式一：使用原生Spring API接口-->
    <!--配置aop:需要导入aop的约束-->
    <aop:config>
    <!--切入点：expression:表达式:execution(要执行的位置)-->
        <aop:pointcut id="pointcut" expression="execution(* com.tao.service.UserServiceImpl.*(..))"/>
    <!--执行环绕增加-->
        <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
    </aop:config>
</beans>

```

注意点：需要导入aop约束

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd">
</beans>

```

测试

```java
@Test
public void test(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //动态代理代理的是接口
    UserService userService = (UserService) context.getBean("userService");
    userService.add();
}
```

# 注解实现AOP

使用注解实现

编写一个注解实现的增强类

```java
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解方式实现AOP
@Aspect//标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.tao.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.tao.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.tao.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
    }
}


```

在Spring配置文件中，注册bean，并增加支持注解的配置

```xml
<!--方式三-->
<bean id="annotationPointCut" class="com.tao.diy.AnnotationPointCut"/>
<!--开启注解支持 JDK(默认proxy-target-class="false") cglib(proxy-target-class="true")-->
<aop:aspectj-autoproxy/>
```

# 回顾Mybatis

步骤：

1. 导入相关jar包

   - junit

     ```xml
     <dependency>
         <groupId>junit</groupId>
         <artifactId>junit</artifactId>
         <version>4.12</version>
     </dependency>
     
     ```

   - mybatis

     ```xml
     <dependency>
         <groupId>org.mybatis</groupId>
         <artifactId>mybatis</artifactId>
         <version>3.5.2</version>
     </dependency>
     
     ```

   - mysql数据库

     ```xml
     <dependency>
         <groupId>mysql</groupId>
         <artifactId>mysql-connector-java</artifactId>
         <version>5.1.46</version>
     </dependency>
     
     ```

   - spring相关的

     ```xml
     <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-webmvc</artifactId>
         <version>5.2.0.RELEASE</version>
     </dependency>
     <!--Spring操作数据库的话，还需要一个spring-jdbc-->
     <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-jdbc</artifactId>
         <version>5.1.10.RELEASE</version>
     </dependency>
     
     ```

   - aop织入

     ```xml
     <dependency>
         <groupId>org.aspectj</groupId>
         <artifactId>aspectjweaver</artifactId>
         <version>1.9.4</version>
     </dependency>
     
     ```

   - mybatis-spring

     ```xml
     <dependency>
         <groupId>org.mybatis</groupId>
         <artifactId>mybatis-spring</artifactId>
         <version>2.0.2</version>
     </dependency>
     
     ```

2. 编写配置文件

3. 测试

# 整合Mybatis方式一

1. 编写数据源配置

   ```xml
   <!--DataSource(数据源):使用Spring的数据源替换Mybatis的配置
       我们这里使用Spring提供的jdbc-->
   <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
       <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
       <property name="url" value="jdbc:mysql://localhost:3306/vip08?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF-8"/>
       <property name="username" value="root"/>
       <property name="password" value="123456"/>
   </bean>
   
   ```

2. sqlSessionFactory

   ```xml
   <!--sqlSessionFactory-->
   <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
       <property name="dataSource" ref="dataSource" />
       <!--绑定mybatis配置文件-->
       <property name="configLocation" value="classpath:mybatis-config.xml"/>
       <!--注册mapper.xml-->
       <property name="mapperLocations" value="classpath:com/mapper/*.xml"/>
   </bean>
   
   ```

3. sqlSessionTemplate

   ```xml
   <!--SqlSessionTemplate:就是我们的使用的sqlSession-->
   <bean id="sqlSessionTemplate" class="org.mybatis.spring.SqlSessionTemplate">
       <!--只能使用构造器注入sqlSessionFactory，因为它没有set方法-->
       <constructor-arg index="0" ref="sqlSessionFactory"/>
   </bean>
   
   ```

4. 需要给接口加实现类

   ```java
   public class UserMapperImpl implements UserMapper {
   
       //我们的所有操作，都使用sqlSession来执行，在原来，现在都使用sqlSessionTemplate
       private SqlSessionTemplate sqlSessionTemplate;
   
       public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
           this.sqlSessionTemplate = sqlSessionTemplate;
       }
   
       public List<User> selectUser() {
           UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
           return mapper.selectUser();
       }
   }
   
   ```

5. 将自己的写的实现类，注入到Spring中

   ```xml
   <bean id="userMapper" class="com.mapper.UserMapperImpl">
       <property name="sqlSessionTemplate" ref="sqlSessionTemplate"/>
   </bean>
   ```

6. 测试使用即可

   ```java
   @Test
   public void test() throws IOException {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
       List<User> users = userMapper.selectUser();
       for (User user : users) {
           System.out.println(user);
       }
   }
   ```

# 整合MYbatis方式二

1. 编写数据源配置

   ```xml
   <!--DataSource(数据源):使用Spring的数据源替换Mybatis的配置
       我们这里使用Spring提供的jdbc-->
   <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
       <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
       <property name="url" value="jdbc:mysql://localhost:3306/vip08?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF-8"/>
       <property name="username" value="root"/>
       <property name="password" value="123456"/>
   </bean>
   ```

2. sqlSessionFactory

   ```xml
   <!--sqlSessionFactory-->
   <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
       <property name="dataSource" ref="dataSource" />
       <!--绑定mybatis配置文件-->
       <property name="configLocation" value="classpath:mybatis-config.xml"/>
       <!--注册mapper.xml-->
       <property name="mapperLocations" value="classpath:com/mapper/*.xml"/>
   </bean>
   ```

3. 需要给接口加实现类

   ```java
   public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
       public List<User> selectUser() {
   //        SqlSession sqlSession = getSqlSession();
   //        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
   //        List<User> users = mapper.selectUser();
           return getSqlSession().getMapper(UserMapper.class).selectUser();
       }
   }
   ```

4. 将自己的写的实现类，注入到Spring中

   ```xml
   <bean id="userMapper2" class="com.mapper.UserMapperImpl2">
       <property name="sqlSessionFactory" ref="sqlSessionFactory"/>
   </bean>
   
   ```

5. 测试

   ```java
   @Test
   public void test1() throws IOException {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
       List<User> users = userMapper.selectUser();
       for (User user : users) {
           System.out.println(user);
       }
   ```

# 事务回顾

### 13.1、回顾事物

- 把一组业务当成一个业务，要么都成功，要么都失败
- 事物在项目开发中，十分重要，涉及到数据的一致性问题，不能马虎
- 确保完整性和一致性

事务的ACID原则：

- 原子性
- 一致性
- 隔离性
  - 多个业务可能操作同一个资源，防止数据损坏
- 持久性
  - 事物一旦提交，无论系统发生什么问题，结果都不会在被影响，被持久化的写到存储器中

### 13.2、Spring中的事务管理

- 声明式事务：AOP

  ```xml
  <!--配置声明式事务-->
  <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
      <constructor-arg name="dataSource" ref="dataSource" />
  </bean>
  <!--结合AOP实现事务的织入-->
  <!--配置事务通知-->
  <tx:advice id="txAdvice" transaction-manager="transactionManager">
      <!--给哪些方法配置事务-->
      <!--配置事务的传播特性：new propagation-->
      <tx:attributes>
          <tx:method name="add" propagation="REQUIRED"/>
          <tx:method name="delete" propagation="REQUIRED"/>
          <tx:method name="update" propagation="REQUIRED"/>
          <tx:method name="query" read-only="true"/>
          <tx:method name="*" propagation="REQUIRED"/>
      </tx:attributes>
  </tx:advice>
  
  <!--配置事务切入-->
  <aop:config>
      <aop:pointcut id="txPointCut" expression="execution(* com.mapper.*.* (..))"/>
      <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointCut"/>
  </aop:config>
  
  
  ```

- 编程式事务：需要在代码中，进行事务的管理
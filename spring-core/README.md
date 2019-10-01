# Spring core
## IoC
&nbsp;IoC 란 객체의 생성과 관리에 대해 작성하는 프로그램이 아닌 Framework에서 제어하는 것을 의미하며, 프로그램에서 참조하는 객체에 대해서 객체 참조를 삽입 해주는 것이 DI이다.  
&nbsp;Spring 내부에서  BeanFactory를 통해 Bean(객체)를 관리 할 수 있도록 API를 제공한다. ApplicationContext는 BeanFactory구현체중 하나이다.  
&nbsp;ApplicationContext는 Spring IoC Container를 대표하고, Bean들에 대해서 객체화, 설정, 의존성 삽입 기능을 수행한다.  
&nbsp;Bean 이란 Spring IoC Container에서 관리(생성, 삽입)되는 객체를 말한다.
&nbsp;ApplicationContext는 Configuration Metadata 를 통해서 bean들을 제어합니다. 전통적으로는 xml파일로 정의하도록 되어있고, 추가로 java-base configuration, Annotation-based Configuration방식도 있습니다.
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="..." class="...">  
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions go here -->

</beans>
```
&nbsp;xml에 정의된 설정을 로드하는 코드
``` java
// create and configure beans
ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

// retrieve configured instance
PetStoreService service = context.getBean("petStore", PetStoreService.class);

// use configured instance
List<String> userList = service.getUsernameList();
```
## Beans
&nbsp;Bean이란 Spring IoC Container에 의해 제어되는 객체를 의미합니다. Bean의 생성은 Configuration Metadata에 정의된 설정을 바탕으로 생성됩니다.  
&nbsp;Bean의 속성  
* Class : Bean으로 생성해야할 클래스
* Name
* Scope
* Constructor arguments
* Properties
* Autowiring mode
* Lazy initialization mode
* Initialization method
* Destruction method

&nbsp;모든 Bean들은 식별자를 한 개 이상 가지고 있으며 컨테이너 안에서 유일한 값이다. 유일한 값인 id, name을 alias를 통해 다양한 명칭으로 참조 할 수 있다.  
&nbsp;Container는 정의된 bean들을 정의된 값에 따라 요청이 올때마다 생성하거나 생성된 객체를 전달 합니다.  
&nbsp;Bean을 생성하는 방식  
* constructor 방식
  - 가장 일반적인 방식.
  - 추가적인 구현이 필요하지 않음.
  - 다만 기본 생성자가 있어야함.
    + 기본 생성자 없으면  
    org.springframework.beans.BeanInstantiationException: Failed to instantiate [io.doubleu0714.spring.core.instantiation.ByConstructorWithArgs]: No default constructor found; nested exception is java.lang.NoSuchMethodException: io.doubleu0714.spring.core.instantiation.ByConstructorWithArgs.<init>()
    + 인자값이 필요한 생성자의 경우 `<constructor-arg />` 를 사용해야 한다.
  - ``` xml
    <bean id="exampleBean" class="examples.ExampleBean"/>
    <bean name="anotherExample" class="examples.ExampleBeanTwo"/>
    ```
  - [Example 소스](https://github.com/doubleu0714/handson-spring/tree/master/spring-core/src/main/java/io/doubleu0714/spring/core/instantiation)
* static factory method 방식
  - 정의되어있는 메소드 명을 `factory-method` 속성값에 정의한다.
  - 인자 값이 필요한 경우 `<constructor-arg />` 를 사용해야 한다.
  - [Example 소스](https://github.com/doubleu0714/handson-spring/tree/master/spring-core/src/main/java/io/doubleu0714/spring/core/instantiation)
* instance factory method 방식
  - Factory 클래스를 통한 생성을 위해 Factory 를 bean 으로 등록해야한다.
  - Factory를 통해 생성될 Bean 속성에 `factory-bean, factory-method` 를 정의한다.
  - 인자 값이 필요한 경우 `<constructor-arg />` 를 사용해야 한다.
  - [Example 소스](https://github.com/doubleu0714/handson-spring/tree/master/spring-core/src/main/java/io/doubleu0714/spring/core/instantiation)

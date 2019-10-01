package io.doubleu0714.spring.core.javaconfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "io.doubleu0714.spring.core.javaconfig")
@PropertySource("classpath:application.yaml")
public class JavaConfigApp {
    @Bean
    public IFoo foo(){
        System.out.println("call creating foo bean method!!");
        return new Foo();
    }

    @Bean
    public IFoo fooAnother(){
        System.out.println("call creating fooAnother bean method!!");
        return new Foo();
    }

    @Bean
    public IFoo foo2(@Value("${test1:HI}") String test1, @Value("${test2:HI2}") String test2, @Value("${test3:3}") int test3){
        System.out.println("call creating foo2 bean method!!");
        System.out.println("test1 : " + test1);
        System.out.println("test2 : " + test2);
        System.out.println("test3 : " + test3);
        return new Foo2();
    }

    @Bean
    public Bar bar(){
        System.out.println("call creating bar bean method!!");
        Bar bar = new Bar();
        bar.setFoo(foo());
        return bar;
    }

    @Bean
    // public Bar bar2(@Autowired IFoo fooAnother) {
    public Bar bar2(IFoo fooAnother) {
        System.out.println("call creating bar2 bean method!!");
        Bar bar = new Bar();
        bar.setFoo(fooAnother);
        return bar;
    }

    @Bean
    public Map<String, IFoo> map() {
        System.out.println("call creating map bean method!!");
        Map<String, IFoo> map = new HashMap<>();
        map.put("foo", new Foo());
        map.put("fooref", foo());
        return map;
    }

    @Bean
    public List<String> hellolist() {
        List<String> hellolist = new ArrayList<String>();
        hellolist.add("dddd");
        hellolist.add("aaaa");
        hellolist.add("bbbb");
        return hellolist;
    }

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigApp.class);
        // IFoo foo = ctx.getBean("foo", Foo.class);
        // IFoo fooAnother = ctx.getBean("fooAnother", Foo.class);
        // IFoo foo2 = ctx.getBean(Foo2.class);
        // Bar bar = ctx.getBean("bar", Bar.class);
        // Bar bar2 = ctx.getBean("bar2", Bar.class);
        // Map<String, IFoo> map = (Map<String, IFoo>)ctx.getBean("map");
        // Map<String, IFoo> map2 = (Map<String, IFoo>)ctx.getBean("map");
        
        // foo.print();
        // fooAnother.print();
        // foo2.print();
        // bar.print();
        // System.out.println("foo == bar.getFoo() ? " + (foo == bar.getFoo()));
        // map.get("foo").print();
        // map.get("fooref").print();
        // System.out.println("foo == map.get(fooref) ? " + (foo == map.get("fooref")));
        // System.out.println("foo == map.get(foo) ? " + (foo == map.get("foo")));
        // System.out.println("map.get(foo) == map2.get(foo) ? " + (map.get("foo") == map2.get("foo")));
        // System.out.println("foo == fooAnother ? " + (foo == fooAnother));
        // System.out.println("fooAnother == bar2.fooAnother ? " + (fooAnother == bar2.getFoo()));


        ListProperties lp = (ListProperties)ctx.getBean("listProperties");
        lp.print(lp.getProperties());

    }
}
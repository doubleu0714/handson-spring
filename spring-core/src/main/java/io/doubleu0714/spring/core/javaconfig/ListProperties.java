package io.doubleu0714.spring.core.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ListProperties {

    @Value("${prop1}")
    private String prop1;
    @Value("#{new String[]{\"nexcore.\", listProperties.prop1}}")
    private List<String> properties;
    @Autowired
    private List<String> properties2;

    public String getProp1() {
        return this.prop1;
    }

    public List<String> getProperties() {
        return this.properties;
    }

    public void print(List<String> properties) {
        System.out.println("prop1 is [" + prop1 + "]");
        if(properties == null || properties.size() < 1) {
            System.out.println("properties is not injected"); 
            return;
        }
        for(String val : properties) {
            System.out.println("val is [" + val + "]");
        }
        for(String val : properties2) {
            System.out.println("val is [" + val + "]");
        }
    }
}
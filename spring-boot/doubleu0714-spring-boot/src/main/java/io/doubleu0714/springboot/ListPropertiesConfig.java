package io.doubleu0714.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="jobfilter")
public class ListPropertiesConfig {
    private List<Map<String, String>> list;

    public List<Map<String, String>> getList() {
        return this.list;
    }
    
    public void setList(List<Map<String, String>> list) {
        this.list = list;
    }
}
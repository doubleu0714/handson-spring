package io.doubleu0714.springboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import io.doubleu0714.springboot.vo.MyVO;

public class MyRestControllerTest {
    RestTemplate restTemplate = new RestTemplate();
    Logger logger = LogManager.getLogger(getClass());
    String url = "http://localhost:8080/v1";
    @Test
    public void test() {
        logger.debug("Hello JUnitTest");
        MyVO myVO = restTemplate.getForObject(String.format("%s/print?intval=%d&stringval=%s", url, 100, "Hello World!!!"), MyVO.class);
        logger.debug(myVO.getIntVal());
        logger.debug(myVO.getStringVal());
        logger.debug(new String(myVO.getByteArr()));
    }

    @Test
    public void test1() {
        String msg = restTemplate.postForObject("http://localhost:8080/v1/two-request-body", "{'param1': 'param1-value', 'param2': 'param2-value'}", String.class, url);
        logger.debug(msg);
    }
}
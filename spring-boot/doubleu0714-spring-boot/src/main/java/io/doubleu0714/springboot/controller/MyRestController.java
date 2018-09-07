package io.doubleu0714.springboot.controller;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.doubleu0714.springboot.vo.MyVO;

@RestController
@RequestMapping("v1")
public class MyRestController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = "greet", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value="name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value="print/myvo", method=RequestMethod.GET)
    public String printMyVO(@RequestParam(value = "intval") int intVal, @RequestParam(value = "stringval") String stringVal) {
        MyVO myVO = new MyVO(stringVal, intVal);
        logger.info("myvo is [" + myVO + "]");
        return myVO.toString();
    }

    @RequestMapping(value="print", method=RequestMethod.GET)
    public MyVO returnMyVO(@RequestParam(value = "intval") int intVal, @RequestParam(value = "stringval") String stringVal) {
        MyVO myVO = new MyVO(stringVal, intVal);
        myVO.setByteArr(stringVal.getBytes());
        logger.info("myvo is [" + myVO + "]");
        return myVO;
    }

    @RequestMapping(value="map", method=RequestMethod.GET)
    public Map<String, String> map() {
        Map<String, String> returnValue = new HashMap<>();

        returnValue.put("param1", "value1");
        returnValue.put("param2", "value2");
        returnValue.put("param3", "value3");
        returnValue.put("param4", "value4");
        returnValue.put("param5", "value5");

        return returnValue;
    }

    @RequestMapping(value="two-request-body", method=RequestMethod.POST)
    public String printTwoRequestBody(@RequestBody Map<String, String> twoRequestBody) {
        String msg = MessageFormat.format("param1 is [{0}], param2 is [{1}]", twoRequestBody.get("param1"), twoRequestBody.get("param2"));
        String msg2 = MessageFormat.format("param1 is [{0}], param2 is [{1}]", twoRequestBody.get("param3"), twoRequestBody.get("param4"));
        logger.info(msg);
        logger.info(msg2);
        return msg;
    }

    @DeleteMapping(path="deletemethod")
    public String deleteRequestBody(@RequestBody Map<String, String> twoRequestBody) {
        String msg = MessageFormat.format("param1 is [{0}], param2 is [{1}]", twoRequestBody.get("param1"), twoRequestBody.get("param2"));
        String msg2 = MessageFormat.format("param1 is [{0}], param2 is [{1}]", twoRequestBody.get("param3"), twoRequestBody.get("param4"));
        logger.info(msg);
        logger.info(msg2);
        return msg;
    }

    @PostMapping("filetest")
    public void fileUplaodTest(@RequestParam("uploadFile") MultipartFile uploadFile) {
        logger.info(uploadFile.getName());
        logger.info(uploadFile.getOriginalFilename());
    }

}
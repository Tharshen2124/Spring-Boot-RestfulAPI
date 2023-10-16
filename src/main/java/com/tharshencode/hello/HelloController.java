package com.tharshencode.hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        Map<String, Object> object = new HashMap<>();
        object.put("key1", "value1");
        object.put("key2", "value2");
        return object;
    }
}

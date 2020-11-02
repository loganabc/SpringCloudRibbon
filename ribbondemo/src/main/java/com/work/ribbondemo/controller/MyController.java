package com.work.ribbondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class MyController {

    private static final String REST_URL_PREFIX = "http://BIZ";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon/hello")
    @ResponseBody
    public String hello(){
        String res = restTemplate.postForObject(REST_URL_PREFIX+"/hello1","12",String.class);
        System.out.println(res);
        return res;
    }


    @RequestMapping("/ribbon/hello1")
    @ResponseBody
    public String hello2(){
        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("name", "logan");
        String res = restTemplate.postForObject(REST_URL_PREFIX+"/hello2",paramMap,String.class);
        return res;
    }

    @RequestMapping("/ribbon/hello2")
    @ResponseBody
    public Map hello3(){
        Map map = restTemplate.postForObject(REST_URL_PREFIX+"/hello3","",Map.class);
        return map;
    }

    @RequestMapping("/ribbon/hello3")
    public String hello4(){
        return "Hello";
    }

    @RequestMapping("/ribbon/hello4")
    public String hello5(){
        return "User";
    }

    @RequestMapping("/ribbon/hello5")
    public String hello6(){
        return "User1";
    }

    @RequestMapping("/ribbon/hello7")
    @ResponseBody
    public Map<String,Object> hello7(String id){
        System.out.println(id);
        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("id", id);
        Map<String, Object> map = restTemplate.postForObject(REST_URL_PREFIX+"/account/queryById",paramMap,Map.class);
        return map;
    }

}

package api.controller;

import api.entity.Message;
import api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cactus on 2016/6/28.
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;


    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "hello world!";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Message json() {
        Message message = new Message();
        message.setResult(true);
        message.setData(testService.makeUser("cactus", 27));
        return message;
    }

    @RequestMapping("/json2")
    @ResponseBody
    public Message json2(@RequestParam String name, @RequestParam int age) {
        Message message = new Message();
        message.setResult(true);
        message.setData(testService.makeUser(name, age));
        return message;
    }
}

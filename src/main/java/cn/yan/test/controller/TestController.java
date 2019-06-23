package cn.yan.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gentlemen_yan on 2019/6/23.
 */
@RestController
@RequestMapping("/test/")
public class TestController {

    @RequestMapping("getTime")
    public String  getTimeInfo() {
        long time = System.currentTimeMillis() / 1000L;
        return "time : " + time;
    }

}

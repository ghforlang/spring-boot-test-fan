package cn.edu.nbu.light.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/20 16:15
 */
@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloworld(){
        return "helloworld";
    }
}

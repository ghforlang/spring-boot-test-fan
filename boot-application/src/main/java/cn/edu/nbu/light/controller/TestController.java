package cn.edu.nbu.light.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/helloworld2")
    public String helloworld2(){
        return "helloworld2";
    }

    //访问方式：/path/123
    @GetMapping("/path/{id}")
    public String pathVariable(@PathVariable("id") String id){
        return "path_variable_id : " + id;
    }

    //访问方式：/param?id=123
    @GetMapping("/param")
    public String param(@RequestParam("id") String id ){
        return "param_id : " + id;
    }

    //注解@RequestAttribute可以被用于访问由过滤器或拦截器创建的、预先存在的请求属性
    @GetMapping("/req/attr")
    public String requestAttr(@RequestAttribute("id") String id){
        return "request_id : " + id;
    }
}

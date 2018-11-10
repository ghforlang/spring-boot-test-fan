package cn.edu.nbu.light.config;

import cn.edu.nbu.light.util.TestFunctionnal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/20 17:39
 */
@Configuration
public class BeanConfiguration {

    @Bean
    @Profile("dev")
    public Runnable dev(){
        System.out.println("开发环境使用Bean");
        return ()->{};
    }


    @Bean
    @Profile("dev")
    public TestFunctionnal functionalDev(){
        System.out.println("test FunctionalInterface!");
        return ()->{};
    }

    @Bean
    @Profile("test")
    public Runnable test(){
        System.out.println("测试环境使用Bean");
        return () -> {};
    }

    @Bean
    @Profile("prod")
    public Runnable produrce(){
        System.out.println("生产环境使用Bean");
        return () ->{};
    }

}

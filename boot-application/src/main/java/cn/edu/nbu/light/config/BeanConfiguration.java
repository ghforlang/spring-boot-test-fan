package cn.edu.nbu.light.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import cn.edu.nbu.light.util.TestFunctionnal;
import lombok.extern.slf4j.Slf4j;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/20 17:39
 */
@Configuration
@Slf4j
public class BeanConfiguration {

    @Bean
    @Profile("dev")
    public Runnable dev(){
        log.info("开发环境使用Bean");
        return ()->{};
    }


    @Bean
    @Profile("dev")
    public TestFunctionnal functionalDev(){
        log.info("test FunctionalInterface!");
        return ()->{};
    }

    @Bean
    @Profile("test")
    public Runnable test(){
        log.info("测试环境使用Bean");
        return () -> {};
    }

    @Bean
    @Profile("prod")
    public Runnable produrce(){
        log.info("生产环境使用Bean");
        return () ->{};
    }

}

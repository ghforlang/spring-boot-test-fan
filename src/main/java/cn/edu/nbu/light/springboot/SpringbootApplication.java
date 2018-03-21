package cn.edu.nbu.light.springboot;

import cn.edu.nbu.light.config.DBConfig;
import cn.edu.nbu.light.properties.DataSourceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/20 16:14
 */
@SpringBootApplication
@ComponentScan(value = "cn.edu.nbu.light.properties")
public class SpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class,args);
//        context.getBean(DBConfig.class).show();
        context.getBean(DataSourceProperties.class).show();
    }
}

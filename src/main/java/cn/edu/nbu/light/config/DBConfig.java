package cn.edu.nbu.light.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/21 10:23
 */
@Configuration
public class DBConfig {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String userName;
    @Value("${spring.datasource.password}")
    private String password;

    @Autowired
    private Environment environment;

    public void show(){
        System.out.println("spring.datasource.url:" + this.url);
        System.out.println("spring.datasource.username:" + this.userName);
        System.out.println("spring.datasource.password:" + this.password);

        System.out.println("spring.datasource.url:" + environment.getProperty("spring.datasource.url"));
        System.out.println("spring.datasource.username:" + environment.getProperty("spring.datasource.username"));
        System.out.println("spring.datasource.password:" + environment.getProperty("spring.datasource.password"));
    }
}

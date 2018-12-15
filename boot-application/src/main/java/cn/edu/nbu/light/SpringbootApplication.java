package cn.edu.nbu.light;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import cn.edu.nbu.light.config.DBConfig;
import cn.edu.nbu.light.properties.DataSourceProperties;
import lombok.extern.slf4j.Slf4j;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/20 16:14
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})
//@ComponetScan默认加载当前包的class，如需指定要加value值(value = "cn.edu.nbu")，
//或者采用@Import()直接导入
//或者采用spring.factories方式，详情参考spring.factories
@ComponentScan(value = "cn.edu.nbu")
@PropertySource(value="classpath:conf/application-dev.properties",encoding="utf-8")
//@Import(DBConfig.class)
@ServletComponentScan
@Slf4j
public class SpringbootApplication  extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class,args);


        //DB TEST
        System.out.println("DB TEST--------");
        context.getBean(DBConfig.class).show();
        context.getBean(DataSourceProperties.class).show();

        //Cache TEST
//        System.out.println("Cache TEST--------");
//        CacheConfiguration ccf = context.getBean(CacheConfiguration.class);
//        Cache cache = context.getBean(Cache.class);
//        System.out.println(JsonUtils.toJSON(cache));

        //Convertor TEST
//        System.out.println("Convertor TEST--------");
//          Map<String,Convertor> map = context.getBeansOfType(Convertor.class);
//          System.out.println(JsonUtils.toJSON(map));

        //condition TEST
//        System.out.println("condition TEST--------");
//        Map<String,Convertor> conditionMap = context.getBeansOfType(Convertor.class);
//        System.out.println(JsonUtils.toJSON(conditionMap));
        log.info("application启动成功!");
    }
}

package cn.edu.nbu.light.springboot;

import cn.edu.nbu.cache.Cache;
import cn.edu.nbu.config.CacheConfiguration;
import cn.edu.nbu.light.properties.DataSourceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/20 16:14
 */
@SpringBootApplication
//@ComponetScan默认加载当前包的class，如需指定要加value值(value = "cn.edu.nbu")，
//或者采用@Import()直接导入
//或者采用spring.factories方式，详情参考spring.factories
//@ComponentScan(value = "cn.edu.nbu")
//@Import(CacheConfiguration.class)
public class SpringbootApplication  extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class,args);


        CacheConfiguration ccf = context.getBean(CacheConfiguration.class);
        System.out.println(ccf);

        Cache cache = context.getBean(Cache.class);
        System.out.println(cache);
//        context.getBean(DBConfig.class).show();
//        context.getBean(DataSourceProperties.class).show();
    }
}

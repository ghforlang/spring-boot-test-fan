package cn.edu.nbu.config;

import cn.edu.nbu.cache.Cache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/21 17:37
 */
@Configuration
public class CacheConfiguration {

    @Bean
    public Cache createCacheObj(){
        return new Cache();
    }
}

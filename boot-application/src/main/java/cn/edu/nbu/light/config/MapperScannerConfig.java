
package cn.edu.nbu.light.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.edu.nbu.light.constant.ConfigConstants;

/**
 *
 * @author fanwenhao
 * @version V1.0
 * @since 2018-12-15 13:56
 */
@Configuration
@AutoConfigureAfter(DBConfig.class)
public class MapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage(ConfigConstants.MYBATIS_MAPPER_PACKAGE);
        return mapperScannerConfigurer;
    }

}

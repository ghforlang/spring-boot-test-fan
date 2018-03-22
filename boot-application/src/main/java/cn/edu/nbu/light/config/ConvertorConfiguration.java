package cn.edu.nbu.light.config;

import cn.edu.nbu.light.condition.GBKCondition;
import cn.edu.nbu.light.condition.UTF8Condition;
import cn.edu.nbu.light.convertor.GBKEncodingConvertor;
import cn.edu.nbu.light.convertor.UTF8EncodingConvertor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/22 17:23
 */
@Configuration
public class ConvertorConfiguration {

    @Bean
    @Conditional(UTF8Condition.class)
    public UTF8EncodingConvertor createUTF8EncodingConvertor(){
        return new UTF8EncodingConvertor();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public GBKEncodingConvertor createGBKEncodingConvertor(){
        return new GBKEncodingConvertor();
    }
}

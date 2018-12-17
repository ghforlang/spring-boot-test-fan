package cn.edu.nbu.light.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.edu.nbu.light.filter.NewFilter;

/**
 *
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 17:52
 */
@Configuration
public class FilterRegistrationConfiguration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(newFilter());
        filterRegistrationBean.setName("newFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(12);
        return filterRegistrationBean;
    }

    @Bean
    public Filter newFilter(){
        return new NewFilter();
    }
}


package cn.edu.nbu.light.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 18:21
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getHandlerInterceptor());
    }

    @Bean
    public static HandlerInterceptor getHandlerInterceptor() {
        return new MyInterceptor();
    }
}

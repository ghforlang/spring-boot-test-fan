
package cn.edu.nbu.light.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 18:07
 */
//@WebListener注解不生效，需要同时配置@Configuration注解
@WebListener
@Slf4j
@Configuration
public class MyListener implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        log.info("myListener destroyed-----");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        log.info("myListener init-----");
    }
}

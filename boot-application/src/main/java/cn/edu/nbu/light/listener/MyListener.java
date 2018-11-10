/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
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

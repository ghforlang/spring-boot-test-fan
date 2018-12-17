
package cn.edu.nbu.light.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 17:45
 */
@Slf4j
//webFilter注解不支持自定义过滤器顺序(默认2147483647)，可以替换成FilterRegistrationBean方式注册过滤器,
// FilterRegistrationBean是springboot提供的，此类提供setOrder方法，可以为filter设置排序值，让spring在注册web filter之前排序后再依次注册
public class NewFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("------newFilter init------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
        throws IOException, ServletException {
        log.info("-------execute newFilter-----");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("------myFilter destroy-----");
    }
}

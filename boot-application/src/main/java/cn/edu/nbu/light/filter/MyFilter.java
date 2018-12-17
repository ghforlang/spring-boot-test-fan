
package cn.edu.nbu.light.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 17:16
 */
@Slf4j
//boot单单加webFilter注不会生效，需要加@Configuration注解
@WebFilter(filterName = "myFilter",urlPatterns = {"/*"})
@Configuration
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("------myFilter init------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
        throws IOException, ServletException {
        log.info("-------execute doFilter-----");
        servletRequest.setAttribute("id",System.currentTimeMillis());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("------myFilter destroy-----");
    }
}

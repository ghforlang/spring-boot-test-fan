
package cn.edu.nbu.light.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 18:50
 */
@Component
public class CommonExceptionResolver  implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
        Object o, Exception e) {
        Map<String,Object> result = new HashMap<>();
        if(e instanceof RuntimeException){
            result.put("code","-1");
            result.put("message",e.getMessage());
        }else{
            result.put("code","-2");
            result.put("message","biz Exception");
        }
        return new ModelAndView("exception",result);
    }
}

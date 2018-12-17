
package cn.edu.nbu.light.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 18:33
 */
@ControllerAdvice
public class CommonExceptionHandler{

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(Exception e){
        Map<String,Object> result = new HashMap<>();
        result.put("code","-1");
        result.put("message",e.getMessage());
        return result;
    }
}

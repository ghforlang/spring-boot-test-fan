package cn.edu.nbu.light.condition;

import cn.edu.nbu.light.constant.ConstantValues;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/22 17:53
 */
public class GBKCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if(StringUtils.isNotBlank(encoding)){
            return ConstantValues.GBK.equalsIgnoreCase(encoding);
        }
        return false;
    }
}

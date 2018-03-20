package cn.edu.nbu.light.util;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/20 17:43
 */
@FunctionalInterface
public interface TestFunctionnal<T> {

    /**
     * 采用 @FunctionalInterface的接口，都可以采用()->{}的方式访问
     */
    public void test();
}
